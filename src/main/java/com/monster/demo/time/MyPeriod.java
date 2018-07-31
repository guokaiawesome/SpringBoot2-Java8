package com.monster.demo.time;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * @description 用于计算两个日期之间的差值
 * @author guokai
 * @date 2018年7月30日
 * @version v1.0
 */
public class MyPeriod {
	
	public static void main(String[] args) {
		LocalDate date1=LocalDate.of(2017, 12, 12);
		LocalDate date2=LocalDate.of(2018, 10, 13);
		
		Period period=Period.between(date1, date2);
		period.getMonths();
		period.getDays();
		period.getYears();
		
		Period threeDays=Period.ofDays(3);
		Period threeWeeks=Period.ofWeeks(3);
		Period twoYearsAndtwoMonthsAndTwoDays =Period.of(2, 2, 2);
	}

}
