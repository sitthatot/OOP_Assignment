package com.example.testprepare;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Pro2 {
    public static void main(String[] args) {
        GregorianCalendar calender = new GregorianCalendar();
        GregorianCalendar oneDayAfter = new GregorianCalendar();
        calender.setTimeInMillis(System.currentTimeMillis());
        oneDayAfter.setTimeInMillis(System.currentTimeMillis() + + 86400000);

        System.out.println("Current year, month, and day of week");
        System.out.println("Year is "+ calender.get(calender.YEAR));
        System.out.println("Month is "+ calender.get(calender.MONTH));
        System.out.println("Date is "+ calender.get(calender.DATE));
        System.out.println("Day of week is "+ calender.get(calender.DAY_OF_WEEK));
        System.out.println("------------");
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println("Current year, month, and day of week");
        System.out.println("Year is "+ oneDayAfter.get(calender.YEAR));
        System.out.println("Month is "+ oneDayAfter.get(calender.MONTH));
        System.out.println("Date is "+ oneDayAfter.get(calender.DATE));
        System.out.println("Day of week is "+ oneDayAfter.get(calender.DAY_OF_WEEK));
        System.out.println(oneDayAfter.getTime());
    }
}


