package com.monster.demo.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MyDateTimeFormatter {
	
	public static void main(String[] args) {
		LocalDate date1=LocalDate.of(2014, 2, 21);
		String s1=date1.format(DateTimeFormatter.BASIC_ISO_DATE);
		String s2=date1.format(DateTimeFormatter.ISO_LOCAL_DATE);
		
		LocalDate.parse("20140318", DateTimeFormatter.BASIC_ISO_DATE);
		
		LocalTime time1=LocalTime.of(12, 12, 32);
		//看一下下面这几个有什么区别
		String s3=time1.format(DateTimeFormatter.ISO_LOCAL_TIME);
		String s4=time1.format(DateTimeFormatter.ISO_OFFSET_TIME);
		String s5=time1.format(DateTimeFormatter.ISO_TIME);
		
		LocalDateTime dateTime1=LocalDateTime.of(date1, time1);
		dateTime1.format(DateTimeFormatter.ISO_DATE_TIME);

		DateTimeFormatter formatter1 =DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter formatter2 =DateTimeFormatter.ofPattern("dd/MM/yyyy",Locale.CHINA);

		
		
		
		
	}

}
