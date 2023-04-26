package com.example.springcloud.client.openfeign.controller;

import com.example.springcloud.client.openfeign.service.OpenFeignServiceApi;
import com.example.springcloudcommon.response.Result;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: FeignController
 * @Description:
 * @Author: huangyejun
 * @Date: 2023/4/26 16:19
 * @Version: v1.0
 */
@RestController
@RequestMapping("/web")
public class FeignController {

    @Resource
    private OpenFeignServiceApi openFeignServiceApi;

    @RequestMapping(value="/get", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<String> get() {
        return openFeignServiceApi.test();
    }

    /**
     *
     * @return
     */
    @RequestMapping(value="/timeout", produces = MediaType.APPLICATION_JSON_VALUE)
    public Result<String> timeout() {
        return openFeignServiceApi.timeout();
    }
}
