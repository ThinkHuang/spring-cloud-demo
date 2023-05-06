package com.example.springcloud.provider.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: OpenController
 * @Description:
 * @Author: huangyejun
 * @Date: 2023/5/6 10:23
 * @Version: v1.0
 */
@Slf4j
@RestController
public class OpenController {

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/open")
    public String getHandler() {
        log.info("##############received call, port: " + this.serverPort);
        return "test msg";
    }
}
