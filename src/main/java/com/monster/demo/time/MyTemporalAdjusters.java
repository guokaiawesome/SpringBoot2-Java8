package com.monster.demo.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class MyTemporalAdjusters {
	
	public static void main(String[] args) {
		//注意这个返回值是一个接口
		TemporalAdjuster adjuster1=TemporalAdjusters.firstDayOfMonth();
		TemporalAdjuster adjuster2 =TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY);
		
		LocalDate date1=LocalDate.of(2014, 3, 5);
		LocalDate date2=date1.with(adjuster1);
		date1.with(adjuster2);
	}

}
