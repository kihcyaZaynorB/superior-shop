package com.kihcyaz.aynorb.superiorshop.common.exception;

public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private String errorCode;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
