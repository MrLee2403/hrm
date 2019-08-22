package com.company.lee.commons;


import java.io.Serializable;

public class ResponseResult<T> implements Serializable {
    private  int code;
    private  String msg;
    private T data;

    @Override
    public String toString() {
        return "ResponseResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ResponseResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResponseResult(int code) {
        this.code = code;
    }

    public ResponseResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResponseResult() {
    }
    public boolean isSuccess(){
        return this.code==ResultCode.SUCCESS.getCode();
    }
    public static <T> ResponseResult<T> createSuccessMassage(String msg){
        return  new ResponseResult<T>(ResultCode.SUCCESS.getCode(),msg);
    }
    public static <T> ResponseResult<T> createSuccessMassage(String msg ,T data){
        return  new ResponseResult<T>(ResultCode.SUCCESS.getCode(),msg,data);
    }
    public static <T> ResponseResult<T> createErrorMassage(String msg){
        return  new ResponseResult<T>(ResultCode.ERROR.getCode(),msg);
    }
    public static <T> ResponseResult<T> createErrorMassage(String msg ,T data){
        return  new ResponseResult<T>(ResultCode.ERROR.getCode(),msg,data);
    }
}
