package com.example.springcloud.client.openfeign.service;

import com.example.springcloud.client.openfeign.constants.NameServer;
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
@FeignClient(value= NameServer.spring_cloud_service_name)
public interface OpenFeignServiceApi {

    @GetMapping("/test")
    Result<String> test();


    @GetMapping("/timeout")
    Result<String> timeout();
}
