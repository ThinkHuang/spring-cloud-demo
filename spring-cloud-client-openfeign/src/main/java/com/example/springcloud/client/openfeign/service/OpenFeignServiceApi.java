package com.example.springcloud.client.openfeign.service;

import com.example.springcloudcommon.response.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @ClassName: DeptFeignService
 * @Description:
 * @Author: huangyejun
 * @Date: 2023/4/24 18:06
 * @Version: v1.0
 */
@Component
@FeignClient(value="SPRINGCLOUDOPENFEIGN")
public interface OpenFeignServiceApi {

    @GetMapping("/test")
    public Result<String> test();


    @GetMapping("/timeout")
    public Result<String> timeout();
}
