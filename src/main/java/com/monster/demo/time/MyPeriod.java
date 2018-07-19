package com.monster.demo.time;

import java.time.LocalDate;
import java.time.Period;

public class MyPeriod {
	
	public static void main(String[] args) {
		LocalDate date1=LocalDate.of(2017, 12, 12);
		LocalDate date2=LocalDate.of(2018, 10, 13);
		
		Period.between(date1, date2);
		
		Period threeDays=Period.ofDays(3);
		Period threeWeeks=Period.ofWeeks(3);
		Period twoYearsAndtwoMonthsAndTwoDays =Period.of(2, 2, 2);
	}

}
