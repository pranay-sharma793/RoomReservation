package com.hibernateDemo.reservation.Web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    public static Date createDatefromDateString(String dateString){
        Date date = null;
        if(null != dateString) {
            try {
                date = DATE_FORMAT.parse(dateString);
            }catch (ParseException e){
                date = new Date();
            }
        }else date = new Date();

        return date;
    }
}
