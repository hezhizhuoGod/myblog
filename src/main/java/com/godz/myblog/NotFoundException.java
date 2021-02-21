package com.godz.myblog;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//资源找不到异常处理 跳转到404
@ResponseStatus(HttpStatus.NOT_FOUND)
//@ResponseStatus(HttpStatus.NOT_FOUND)注解表示资源找不到的状态码，标识了状态码的时候就不拦截
public class NotFoundException extends RuntimeException{
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }

    public NotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}