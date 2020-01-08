package org.example.exception;

import org.example.constant.Status;

/**
 * @author zhangxiangji
 * @date 2020/1/8 14:19
 * @description
 */
public class PageException extends BaseException {
    public PageException() {
        super();
    }

    public PageException(Status status) {
        super(status);
    }

    public PageException(Integer code, String message) {
        super(code, message);
    }
}
