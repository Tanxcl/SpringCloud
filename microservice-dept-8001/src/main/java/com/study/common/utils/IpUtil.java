package com.study.common.utils;

import javax.servlet.http.HttpServletRequest;

/**
 * @className: IpUtil
 * @description: TODO 类描述
 * @author: Txc
 * @date: 2022/12/14 23:14
 **/
public class IpUtil {

    /**
     * 获取ip地址
     * @param request
     * @return
     */
    public synchronized static String getIpAddr(HttpServletRequest request) {
        String strClientIp = request.getHeader("x-forwarded-for");
        if (strClientIp == null || strClientIp.length() == 0
                || "unknown".equalsIgnoreCase(strClientIp)) {
            strClientIp = request.getRemoteAddr();
        } else {
            String[] ipList = strClientIp.split(",");
            String strIp = new String();
            for (int index = 0; index < ipList.length; index++) {
                strIp = ipList[index];
                if (!("unknown".equalsIgnoreCase(strIp))) {
                    strClientIp = strIp;
                    break;
                }
            }
        }

        return strClientIp;
    }

}
