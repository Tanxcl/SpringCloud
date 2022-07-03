package com.study.common.utils;

/**
 * @className: Result
 * @description: 统一返回结果
 * @author: Txc
 * @date: 2022/7/3 22:41
 **/
public class Result {


    //成功
    public static final int SUCCESS = 200;

    //失败
    public static final int ERROR = 500;

    /**
     * 状态码
     */
    private Integer code;
    /**
     * 消息
     */
    private String message;
    /**
     * 数据
     */
    private Object data;

    private Result() {

    }

    private Result(Integer code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    private Result(Integer code, String message, Object data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }

    /**
     * 返回成功消息
     * @return Result
     */
    public static Result success(String message) {
        return new Result(SUCCESS, message);
    }

    /**
     * 返回成功消息
     * @return Result
     */
    public static Result success(String message, Object data) {
        return new Result(SUCCESS, message, data);
    }


    /**
     * 返回失败消息
     * @return Result
     */
    public static Result error(String message) {
        return new Result(ERROR, message);
    }

    /**
     * 返回失败消息
     * @return Result
     */
    public static Result error(String message, Object data) {
        return new Result(ERROR, message,data);
    }

}
