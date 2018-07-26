package com.monster.demo.time;

import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyInstant {
	
	private static final Logger logger=LoggerFactory.getLogger(MyInstant.class);

	
	public static void main(String[] args) {
		
		//方便机器识别的时间
		Instant now=Instant.now();
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
		
		
	}

}
