package com.mindassist.hami_chau.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtility {

    public static void formatDate() {
        String date = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
        String time = new SimpleDateFormat("HH:mm:ss").format(new Date());
        String dayOfWeek = new SimpleDateFormat("EEEE").format(new Date());

        System.out.println(date);
        System.out.println(time);
        System.out.println(dayOfWeek);
    }
}
