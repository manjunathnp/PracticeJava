package com.revision.session1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDateTimeStamp {
    public static void main(String[] args) {
        String currentDateTime = new SimpleDateFormat("dd-MMM-YYYY_HH:mm_a").format(new Date());

        System.out.println("Current Date and Timestamp: "+currentDateTime);
    }
}
