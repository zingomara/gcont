package com.Bean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author omar
 */
public class RDate {
    
    public static int getYear(){
        Calendar calendar=Calendar.getInstance();
        return calendar.get(Calendar.YEAR); 
    }
    
    /**
     *
     * @return
     */
    public static Date getToDaySql(){
        Calendar calendar=Calendar.getInstance();
        return new Date(calendar.getTime().getTime());
    }
    
    public static Date getYesterDaySql(){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH, calendar.get(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH)-1);
        return new Date(calendar.getTime().getTime());
    }
    /**
     *
     * @return
     */
    public static Date getStartDateSql(){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        return new Date(calendar.getTime().getTime());
    }
    
    /**
     *
     * @return
     */
    public static Date getEndDateSql(){
        Calendar calendar=Calendar.getInstance();
        calendar.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
        calendar.set(Calendar.MONTH, 11);
        calendar.set(Calendar.DAY_OF_MONTH, 31);
        return new Date(calendar.getTime().getTime());
    }
    
    /**
     *
     * @param date
     * @return
     */
    public static int DaysBetween(Date date){
        long DT=date.getTime();
        Calendar calendar=Calendar.getInstance();
        long CT=calendar.getTime().getTime();
        float difference=(float)(DT-CT)/(1000*60*60*24);
        return Math.round(difference);
    }
    public static void main(String[] args) {
        System.out.println(""+getToDaySql().toString());
        System.out.println(""+getYesterDaySql().toString());
        System.out.println(""+getStartDateSql().toString());
        System.out.println(""+getEndDateSql().toString());
        System.out.println(""+ DaysBetween(Date.valueOf("2020-03-31")));
    }
}
