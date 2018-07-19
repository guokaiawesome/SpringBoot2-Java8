package com.monster.demo.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.zone.ZoneRules;
import java.util.TimeZone;

public class MyZonedDateTime {

	public static void main(String[] args) {
		//TimeZone.getDefault().toZoneId();
		//ZoneId.systemDefault();
		ZoneId shanghaiZone=ZoneId.of("Asia/ShangHai");
		
		
		LocalDate date=LocalDate.of(2014, 11, 23);
		date.atStartOfDay(shanghaiZone);
		
		LocalDateTime dateTime=LocalDateTime.of(2014, 11,20,12,5,36);
		dateTime.atZone(shanghaiZone);
		
		Instant instant=Instant.now();
		instant.atZone(shanghaiZone);
		
		
		//dateTime.toInstant(shanghaiZone);
		dateTime=LocalDateTime.ofInstant(instant, shanghaiZone);
	}
}
