package com.zhaoyu.exception.global;


import com.zhaoyu.result.ResponseData;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author jiangqiangqiang
 * @description: 全局异常处理
 * @date 2021/10/25 3:51 下午
 */
@RestControllerAdvice
public class GlobalException {

    /**
     * 登录异常
     *
     * @param badCredentialsException /
     * @return /
     */
    @ExceptionHandler(BadCredentialsException.class)
    public ResponseData<String> loginExceptionHandler(BadCredentialsException badCredentialsException) {
        return ResponseData.fali(101, "用户名或密码错误", null);
    }
}
