package org.example.exception;

import org.example.constant.Status;

/**
 * @author zhangxiangji
 * @date 2020/1/8 14:18
 * @description
 */
public class JsonException extends BaseException {
    public JsonException(){super();}

    public JsonException(Status status) {
        super(status);
    }

    public JsonException(Integer code, String message) {
        super(code, message);
    }
}
