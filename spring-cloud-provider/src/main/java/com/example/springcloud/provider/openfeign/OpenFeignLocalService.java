package com.example.springcloud.provider.openfeign;

import com.example.springcloudcommon.response.Result;

/**
 * @ClassName: OpenFeignLocalService
 * @Description:
 * @Author: huangyejun
 * @Date: 2023/5/5 11:47
 * @Version: v1.0
 */

public interface OpenFeignLocalService {

    Result<String> test();

    Result<String> timeout();

}
