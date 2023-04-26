package com.example.springcloudcommon.response;

import java.io.Serializable;

/**
 * @ClassName: Result
 * @Description:
 * @Author: huangyejun
 * @Date: 2023/4/26 16:12
 * @Version: v1.0
 */
public class Result<T> implements Serializable{

        private Boolean success;
        private String message;

        private T data;

        public Result() {
        }

        public static Result<Void> SUCCESS() {
            Result<Void> result = new Result<>();
            result.success = true;
            return result;
        }

    public static Result<Void> FAIL(String message) {
        Result<Void> result = new Result<>();
        result.success = false;
        result.message = message;
        return result;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
