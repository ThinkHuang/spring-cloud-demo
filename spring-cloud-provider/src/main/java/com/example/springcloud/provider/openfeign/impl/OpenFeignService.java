package com.example.springcloud.provider.openfeign.impl;

import com.example.springcloud.client.openfeign.service.OpenFeignServiceApi;
import com.example.springcloudcommon.response.Result;
import org.springframework.stereotype.Service;

/**
 * @ClassName: OpenFeignServiceApi
 * @Description:
 * @Author: huangyejun
 * @Date: 2023/4/26 16:55
 * @Version: v1.0
 */
@Service
public class OpenFeignService implements OpenFeignServiceApi {
    @Override
    public Result<String> test() {
        Result<String> result = new Result<>();
        result.setData("hello openfeign");
        return result;
    }

    @Override
    public Result<String> timeout() {
        Result<String> result = new Result<>();
        result.setData("time");
        return result;
    }
}
