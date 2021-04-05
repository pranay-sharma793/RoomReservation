package com.hibernateDemo.reservation.Web;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
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

    public static String formatDate(Date date){
        String pattern = "yyyy-MM-dd";

        DateFormat df = new SimpleDateFormat(pattern);
        String todayAsString = df.format(date);

// Print the result!
        return todayAsString;

    }
}
