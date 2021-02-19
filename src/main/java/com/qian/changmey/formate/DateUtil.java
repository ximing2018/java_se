package com.qian.changmey.formate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ProjectName: t_javase
 * @Package: com.qian.changmey.executor
 * @ClassName: DateUtil
 * @Author: changmey
 * @Description: 日期工具类
 * @Date: 2020/10/1 8:29
 * @Version: 1.0
 */
public class DateUtil {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public static  String formatDate(Date date)throws ParseException {
        return sdf.format(date);
    }


    public static Date parse(String strDate) throws ParseException{
        return sdf.parse(strDate);
    }
}

