package com.yeehom.ecommerseminiprog.model;

/**
 * Created by kognxq on 2017/5/21.
 */
public class BaseResult{

    private int Code;
    private String Message;
    private Object Data;

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public Object getData() {
        return Data;
    }

    public void setData(Object data) {
        Data = data;
    }
}
