package com.monster.demo.time;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLocalDateTime {
	
	private static final Logger logger=LoggerFactory.getLogger(MyLocalDateTime.class);

	
	public static void main(String[] args) {
		LocalDateTime localDateTime=LocalDateTime.now();
		logger.debug("localDateTime={}",localDateTime);
		
		//of有多重实现方式，可以看一下
		LocalDateTime.of(2018, 11, 25, 12, 2,23);
		//试一下这种不要秒的这种，看下默认秒数是不是0
		LocalDateTime.of(2018, 11, 25, 12, 2,23);
		
		//返回日期
		localDateTime.toLocalDate();
		//返回时间
		localDateTime.toLocalTime();
		

	}

}
