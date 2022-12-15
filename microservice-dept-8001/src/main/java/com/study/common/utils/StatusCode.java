package com.study.common.utils;

/**
 * @className: StatusCode
 * @description: 状态码
 * @author: Txc
 * @date: 2022/7/3 22:50
 **/
public @interface StatusCode {

    /* 成功 */
    String CODE_SUCESS = "200";

    /* 失败 */
    String CODE_FAIL =  "400";

    /* 错误 */
    String CODE_ERROR = "500";
}
