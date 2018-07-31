package com.monster.demo.time;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @description 主要用于计算两个时间类型的差值
 * @author guokai
 * @date 2018年7月30日
 * @version v1.0
 */
public class MyDuration {
	
	public static void main(String[] args) throws InterruptedException {
		LocalDate date1=LocalDate.of(2017, 12, 12);
		LocalDate date2=LocalDate.of(2018, 10, 13);
		//由于Duration主要用于以秒和纳秒衡量时间的长短，所以不能向between方法中传入LocalDate类型，看是否胡抛异常
		//如果你需要以年、月或者日的方式对多个时间单位建模，可以使用Period类
		Duration.between(date1, date2);
		
		LocalTime time1=LocalTime.of(12, 10);
		LocalTime time2=LocalTime.of(14, 10, 0);
		//试一下time1和2反过来
		Duration.between(time1, time2);
		
		
		LocalDateTime dateTime1=LocalDateTime.of(date1, time1);
		LocalDateTime dateTime2=LocalDateTime.of(date2, time2);
		Duration.between(dateTime1, dateTime2);
		
		Instant instant1=Instant.now();
		Thread.sleep(1000);
		Instant instant2=Instant.now();
		Duration.between(instant1, instant2);

		
		Duration threeMinutes=Duration.ofMinutes(3);
		Duration threeMillis=Duration.of(3, ChronoUnit.MILLIS);
		
		
	}

}
