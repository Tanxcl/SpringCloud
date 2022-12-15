package com.study.common.utils;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @className: DateUtil
 * @description: 时间工具
 * @author: Txc
 * @date: 2022/7/3 23:55
 **/
public class DateUtil {

    private static SimpleDateFormat DateFormatOne = new SimpleDateFormat("yyyy-MM-dd");
    private static SimpleDateFormat DateFormatTwo = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /**
     * 取得当前日期
     * @return yyyy-MM-dd
     */
    public static String getCurrentDateOne() {
        Date d = new Date();
        return DateFormatOne.format(d);
    }

    /**
     * 取得当前日期
     * @return yyyy-MM-dd HH:mm:ss
     */
    public static String getCurrentDateTwo() {
        Date d = new Date();
        return DateFormatTwo.format(d);
    }

    /**
     * 自定义当前日期格式
     */
    public static String getCurrentDate(String formatStr){
        Date d = new Date();
        return new SimpleDateFormat(formatStr).format(d);
    }

    /**
     * 当天为星期几
     * @return int
     */
    public static int getWeek() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        return cal.get(Calendar.DAY_OF_WEEK) - 1;
    }

    /**
     * 当前为星期几
     * @return String
     */
    public static String getWeekStr(){
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int w = cal.get(Calendar.DAY_OF_WEEK) - 1;
        String week = "";
        switch(w){
            case 1:week="星期一"; break;
            case 2:week="星期二"; break;
            case 3:week="星期三"; break;
            case 4:week="星期四"; break;
            case 5:week="星期五"; break;
            case 6:week="星期六"; break;
            case 0:week="星期日"; break;
        }
        return week;
    }
}
