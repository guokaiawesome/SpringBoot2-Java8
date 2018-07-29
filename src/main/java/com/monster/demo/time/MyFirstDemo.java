package com.monster.demo.time;

import java.time.Instant;
import java.time.LocalDateTime;
import static java.time.temporal.TemporalAdjusters.*;

import java.time.DayOfWeek;

public class MyFirstDemo {
	public static void main(String[] args) {
		
		//打印当前系统时间毫秒数，等同于System.currentTimeMillis();
		Instant.now().toEpochMilli();
		
		//注意是不可变对象
		LocalDateTime localDateTime1=LocalDateTime.now();
		System.out.println(localDateTime1);
		//下周六,也可以用nextOrSame
		LocalDateTime localDateTime2=localDateTime1.with(next(DayOfWeek.SATURDAY));
		//上周一，也可以用previousOrSame
		LocalDateTime localDateTime3=localDateTime1.with(previous(DayOfWeek.MONDAY));
		System.out.println(localDateTime1);
		System.out.println(localDateTime2);
		System.out.println(localDateTime3);


		
		//这个月最后一天
		
		//同一个月中每一周的第几天
		localDateTime1.with(dayOfWeekInMonth(1, DayOfWeek.MONDAY));
		
		//当月第一天
		localDateTime1.with(firstDayOfMonth());
		//下个月第一天
		localDateTime1.with(firstDayOfNextMonth());
		
		//下一年的第一天
		localDateTime1.with(firstDayOfNextYear());
		
		//当年的第一天
		localDateTime1.with(firstDayOfYear());
		
		//同月中第一个星期六
		localDateTime1.with(firstInMonth(DayOfWeek.MONDAY));
		
		//当月中最后一天
		localDateTime1.with(lastDayOfMonth());
		
		//当年中最后一天
		localDateTime1.with(lastDayOfYear());
		
		//当月中最后一个周五
		localDateTime1.with(lastInMonth(DayOfWeek.FRIDAY));
		
		
		
		//localDateTime1.plus(amountToAdd);
		//localDateTime1.toLocalDate();
		
		
		
	}

}
