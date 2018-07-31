package com.monster.demo.time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.zone.ZoneRules;
import java.util.TimeZone;

public class MyZonedDateTime {

	public static void main(String[] args) {
		//TimeZone.getDefault().toZoneId();
		//ZoneId.systemDefault();
		LocalDateTime localDateTime=LocalDateTime.now();
		ZoneId shanghaiZone=ZoneId.of(ZoneId.SHORT_IDS.get("CTT"));
		//带有时区信息的时间日期类型
		ZonedDateTime zoneDateTime=ZonedDateTime.of(localDateTime, shanghaiZone);
		
		
		LocalDate date=LocalDate.of(2014, 11, 23);
		date.atStartOfDay(shanghaiZone);
		
		LocalDateTime dateTime=LocalDateTime.of(2014, 11,20,12,5,36);
		dateTime.atZone(shanghaiZone);
		
		//instant和zonedatetime转换
		Instant instant=Instant.now();
		ZonedDateTime zoneDateTime2=instant.atZone(shanghaiZone);
		instant.atZone(ZoneOffset.UTC);
		//zonedatetime和localdate、localdatetime转换
		zoneDateTime2.toLocalDate();
		LocalDate.from(zoneDateTime2);
		zoneDateTime2.toLocalTime();
		LocalTime.from(zoneDateTime2);
		zoneDateTime2.toLocalDateTime();
		LocalDateTime.from(zoneDateTime2);
		
		//dateTime.toInstant(shanghaiZone);
		dateTime=LocalDateTime.ofInstant(instant, shanghaiZone);
	}
}
