package com.nabaa96.cemnma.common;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class Common {
    public static final String API_KEY = "089a36122aceecf35732d367c8b462d9";
    public static String unixTimeTDateTime(Double unixTimeStamp) {
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        date.setTime((long) (unixTimeStamp * 1000));

        return dateFormat.format(date);
    }
    public static String getdatenow() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy HH:mm",Locale.US);
        Date date = new Date();
        return dateFormat.format(date);
        }


}
