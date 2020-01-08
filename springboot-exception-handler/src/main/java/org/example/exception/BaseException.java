package org.example.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.constant.Status;

/**
 * @author zhangxiangji
 * @date 2020/1/8 14:21
 * @description
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class BaseException extends RuntimeException {
    private Integer code;
    private String message;

    public BaseException() {
        super();
    }

    public BaseException(Status status) {
        super(status.getMessage());
        this.code = status.getCode();
        this.message = status.getMessage();
    }

    public BaseException(Integer code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }
}
