package com.monster.demo.time;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * @description 时间类型测试
 * @author guokai
 * @date 2018年7月18日
 * @version v1.0
 */
public class MyLocalTime {
	
	private static final Logger logger=LoggerFactory.getLogger(MyLocalTime.class);

	
	public static void main(String[] args) {
		LocalTime time=LocalTime.of(23, 59, 59);
		time.getHour();
		time.getMinute();
		int second=time.getSecond();
		logger.debug("second={}",second);
		
		//LocalDateTime dateTime=time.atDate(date);

		
		LocalTime.now();
		
		LocalTime.parse("11:10:10");
		//LocalTime.parse("11:10:10", );
	}

}
