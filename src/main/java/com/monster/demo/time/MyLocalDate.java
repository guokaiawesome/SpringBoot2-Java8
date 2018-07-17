package com.monster.demo.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class MyLocalDate {
	
	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2018, 7, 16);
		int year=date.getYear();
		System.out.println("year="+year);
		Month month=date.getMonth();
		System.out.println("month="+month);
		int monthValue=date.getMonthValue();
		System.out.println("monthValue="+monthValue);
		int dayOfMonth=date.getDayOfMonth();
		System.out.println("dayOfMonth="+dayOfMonth);
		DayOfWeek dayOfWeek=date.getDayOfWeek();
		System.out.println("dayOfWeek="+dayOfWeek);
		int dayOfYear=date.getDayOfYear();
		System.out.println("dayOfYear="+dayOfYear);
		int lengthOfMonth=date.lengthOfMonth();
		System.out.println("lengthOfMonth="+lengthOfMonth);
		int lengthOfYear=date.lengthOfYear();
		System.out.println("lengthOfYear="+lengthOfYear);
		boolean isLeapYear=date.isLeapYear();
		System.out.println("isLeapYear="+isLeapYear);
		
		LocalDate today=LocalDate.now();
		System.out.println("today="+today);
		
		
	}

}
