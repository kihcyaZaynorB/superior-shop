package com.kihcyaz.aynorb.superiorshop.common.serverresponse;

import lombok.Data;

import java.io.Serializable;

@Data
public class ServerResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    private String errorCode;

    private String msg;

    private Object data;

    public static ServerResponse ok() {
        return ok(null, null);
    }

    public static ServerResponse ok(String msg) {
        return ok(msg, null);
    }

    public static ServerResponse ok(Object data) {
        return ok(null, data);
    }

    public static ServerResponse ok(String msg, Object data) {
        return createResponseByOk(msg, data);
    }

    public static ServerResponse error() {
        return error(ResponseStatus.SYSTEM_EXECUTION_ERROR, "出错了，请联系管理员");
    }

    public static ServerResponse error(String msg) {
        return error(ResponseStatus.SYSTEM_EXECUTION_ERROR, msg);
    }

    public static ServerResponse error(String errorCode, String msg) {
        return createResponseByError(errorCode, msg);
    }

    private static ServerResponse createResponseByOk(String msg, Object data) {
        ServerResponse response = new ServerResponse();
        response.setErrorCode(ResponseStatus.OK);
        response.setMsg(msg);
        response.setData(data);
        return response;
    }

    private static ServerResponse createResponseByError(String errorCode, String msg) {
        ServerResponse response = new ServerResponse();
        response.setErrorCode(errorCode);
        response.setMsg(msg);
        return response;
    }

}
