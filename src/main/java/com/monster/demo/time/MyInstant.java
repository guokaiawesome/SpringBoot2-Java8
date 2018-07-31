package com.monster.demo.time;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyInstant {
	
	private static final Logger logger=LoggerFactory.getLogger(MyInstant.class);

	
	public static void main(String[] args) {
		
		//方便机器识别的时间，和LocalDateTime.now结果有一点点差别
		Instant now=Instant.now();
		System.out.println(now);
		System.out.println(LocalDateTime.now());
		
		//注意这个纳秒数起始时间未知，只能用于判别时间差
		//这两个值差别很大
		logger.info("nano={}",now.getNano());
		logger.info("nano={}",System.nanoTime());
		
		//秒数
		logger.info("epochSecond={}",now.getEpochSecond());
		
		//毫秒数
		logger.info("mills={}",System.currentTimeMillis());
		logger.info("mills={}",now.toEpochMilli());

		//
		Instant.ofEpochSecond(3L);
		
		//和Date类型相互转换
		Date date=Date.from(Instant.now());
		Instant instant=date.toInstant();
		
		//Instant.now().atZone(zone);
		
		
	}

}
