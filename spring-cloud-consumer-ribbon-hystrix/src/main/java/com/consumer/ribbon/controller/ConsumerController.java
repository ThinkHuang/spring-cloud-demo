package com.consumer.ribbon.controller;

import com.consumer.ribbon.entity.User;
import com.consumer.ribbon.hystrix.command.UserCommand;
import com.consumer.ribbon.service.ConsumerService;
import com.consumer.ribbon.service.UserService;
import com.netflix.hystrix.HystrixCommandGroupKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;

@RestController
public class ConsumerController
{
    @Autowired
    ConsumerService consumerService;

    @Autowired
    UserService userService;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/ribbon-consumer")
    public String helloConsumer() {
        return consumerService.consumer();
    }

    @GetMapping(value = "/ribbon-getUserByHand")
    public User getUserByHand(Long id) {
        return new UserCommand(restTemplate, 1L).execute();
    }

    @GetMapping(value = "/ribbon-getUserAsyncByHand")
    public User getUserAsyncByHand(String id) {
        try
        {
            return new UserCommand(restTemplate, 1L).queue().get();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (ExecutionException e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @GetMapping(value = "/ribbon-getUser")
    public User getUser(Long id) {
        return userService.getUserById(id);
    }

    @GetMapping(value = "/ribbon-getUserAsync")
    public User getUserAsync(Long id) {
        try
        {
            return userService.getUserByIdAsync(id).get();
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        catch (ExecutionException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
