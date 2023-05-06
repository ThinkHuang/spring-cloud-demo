package com.example.springcloud.provider.web;

import com.example.springcloudcommon.response.Result;
import lombok.extern.slf4j.Slf4j;
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

    @GetMapping("/test")
    public Result<String> test() {
        Result<String> result = Result.SUCCESS();
        result.setData("test msg");
        return result;
    }

    @GetMapping("/timeout")
    public Result<String> timeout() {
        Result<String> result = Result.SUCCESS();
        result.setData("timeout msg");
        return result;
    }
}
