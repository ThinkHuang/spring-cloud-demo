package com.example.springcloud.client.openfeign.web;

import com.example.springcloud.client.openfeign.service.OpenFeignServiceApi;
import com.example.springcloudcommon.response.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: OpenFeignController
 * @Description:
 * @Author: huangyejun
 * @Date: 2023/5/6 10:30
 * @Version: v1.0
 */
@RestController
@RequestMapping
public class OpenFeignController {

    @Resource
    private OpenFeignServiceApi openFeignServiceApi;

    @GetMapping("/test")
    public Result<String> test() {
        return openFeignServiceApi.test();
    }

    @GetMapping("/timeout")
    public Result<String> timeout() {
        return openFeignServiceApi.timeout();
    }

}
