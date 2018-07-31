package com.monster.demo.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLocalDate {
	
	private static final Logger logger=LoggerFactory.getLogger(MyLocalDate.class);
	
	public static void main(String[] args) {
		LocalDate date=LocalDate.of(2018, 7, 16);
		
		//看下源码这个方法就是是干什么用的，将date调整至now？感觉没什么用
		LocalDate a=(LocalDate) LocalDate.now().adjustInto(date);
		System.out.println("---a---"+a);
		System.out.println(date);
		
		int year=date.getYear();
		logger.debug("year={}",year);
		Month month=date.getMonth();
		logger.debug("month={}",month);
		int monthValue=date.getMonthValue();
		logger.debug("monthValue={}",monthValue);
		int dayOfMonth=date.getDayOfMonth();
		logger.debug("dayOfMonth={}",dayOfMonth);
		DayOfWeek dayOfWeek=date.getDayOfWeek();
		logger.debug("dayOfWeek={}",dayOfWeek);
		int dayOfYear=date.getDayOfYear();
		logger.debug("dayOfYear={}",dayOfYear);
		int lengthOfMonth=date.lengthOfMonth();
		logger.debug("lengthOfMonth={}",lengthOfMonth);
		int lengthOfYear=date.lengthOfYear();
		logger.debug("lengthOfYear={}",lengthOfYear);
		boolean isLeapYear=date.isLeapYear();
		logger.debug("lengthOfYear={}",isLeapYear);
		
		LocalDate today=LocalDate.now();
		logger.debug("today={}",today);
		
		//ChronoField是一个枚举，枚举竟然还可以实现接口，以前的资料理解枚举就是一个特殊的接口
		//另一种获取方式
		int dayToo=today.get(ChronoField.DAY_OF_MONTH);
		logger.debug("dayToo={}",dayToo);

		//
		LocalDate todayDate=LocalDate.parse("2018-07-18");
		logger.debug("todayDate={}",todayDate);

		
		//LocalDateTime dateTime=date.atTime(time);
		
		//  ####总结
		//####三种静态方法 of()  now() parse()，其他用法自己去看实现类
		
		LocalDate date1=LocalDate.of(2018, 2, 25);
		//注意，with方法会创建对象的一个副本，并按照需要修改他的属性，不会修改原来的对象
		LocalDate date2=date1.withYear(2017);
		LocalDate date3=date2.withDayOfMonth(23);
		LocalDate date4=date3.with(ChronoField.MONTH_OF_YEAR, 11);
		
		//
		LocalDate date5=LocalDate.of(2018, 3, 26);
		//看下这个是否改变了原有对象
		LocalDate date6=date5.plusMonths(1);
		LocalDate date7=date6.minusYears(1);
		date7.plus(6,ChronoUnit.MONTHS);
		
		//带时区的时间
		LocalDate.now(ZoneId.of(ZoneId.SHORT_IDS.get("CTT")));
		
		//2018年的第100天
		LocalDate.ofYearDay(2018, 100);

		//自1970年1月1日起算的时间
		LocalDate.ofEpochDay(365);
		
		
	}

}
