package com.monster.demo.time;

import java.time.YearMonth;

public class MyYearMonth {
	
	public static void main(String[] args) {
		
		YearMonth yearMonth1=YearMonth.now();
		System.out.println(yearMonth1);
		System.out.println(yearMonth1.lengthOfMonth());
		System.out.println(yearMonth1.lengthOfYear());
		
		YearMonth yearMonth2=YearMonth.of(2018, 7);
		System.out.println(yearMonth2);
	}

}
