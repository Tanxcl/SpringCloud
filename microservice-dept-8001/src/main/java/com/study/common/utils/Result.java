package com.study.common.utils;

//import com.alibaba.druid.support.spring.stat.annotation.Stat;

/**
 * @className: Result
 * @description: 统一返回结果
 * @author: Txc
 * @date: 2022/7/3 22:41
 **/
public class Result {

    /**
     * 状态码
     */
    private String code;
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

    private Result(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    private Result(String code, String message, Object data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
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
        return new Result(StatusCode.CODE_SUCESS, message);
    }

    /**
     * 返回成功消息
     * @return Result
     */
    public static Result success(String message, Object data) {
        return new Result(StatusCode.CODE_SUCESS, message, data);
    }

    /**
     * 返回失败消息
     * @return Result
     */
    public static Result error(String message) {
        return new Result(StatusCode.CODE_FAIL, message);
    }

    /**
     * 返回失败消息
     * @return Result
     */
    public static Result error(String message, Object data) {
        return new Result(StatusCode.CODE_FAIL, message,data);
    }

}
