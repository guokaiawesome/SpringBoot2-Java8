package com.monster.demo.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLocalDateTime {
	
	private static final Logger logger=LoggerFactory.getLogger(MyLocalDateTime.class);

	
	public static void main(String[] args) {
		LocalDateTime localDateTime=LocalDateTime.now();
		logger.debug("localDateTime={}",localDateTime);
		
		
		
		//直接将localdate类型转成localdatetime类型,会报错
		//LocalDateTime a=LocalDateTime.from(LocalDate.now());
		//System.out.println("--a--"+a);
		//可以改成如下方式
		LocalDate b=LocalDate.now();
		LocalDateTime c=b.atTime(LocalTime.now());
		
		//of有多重实现方式，可以看一下
		LocalDateTime.of(2018, 11, 25, 12, 2,23);
		//试一下这种不要秒的这种，看下默认秒数是不是0
		LocalDateTime.of(2018, 11, 25, 12, 2,23);
		
		//返回日期
		localDateTime.toLocalDate();
		//返回时间
		localDateTime.toLocalTime();
		
		LocalDateTime localDateTime2=LocalDateTime.now();
		
		localDateTime2.isBefore(localDateTime);
		localDateTime2.isAfter(localDateTime);
		localDateTime2.equals(localDateTime);
		
		//跟文本之间转换
		LocalDateTime.parse("2018-05-12 12:00:00",DateTimeFormatter.BASIC_ISO_DATE);
		

	}

}
