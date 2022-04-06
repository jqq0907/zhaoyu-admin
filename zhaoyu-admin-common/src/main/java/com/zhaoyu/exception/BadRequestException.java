package com.zhaoyu.exception;

import lombok.Getter;

/**
 * @author jiangqiangqiang
 * @description: 请求失败exception
 * @date 2021/11/20 3:45 下午
 */
@Getter
public class BadRequestException extends RuntimeException {
    private final int status;

    public BadRequestException(String msg, int status) {
        super(msg);
        this.status = status;
    }
}
