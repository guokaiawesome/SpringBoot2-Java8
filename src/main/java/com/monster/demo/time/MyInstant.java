package com.monster.demo.time;

import java.time.Instant;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyInstant {
	
	private static final Logger logger=LoggerFactory.getLogger(MyInstant.class);

	
	public static void main(String[] args) {
		
		//方便机器识别时间？
		
		Instant now=Instant.now();
		now.getNano();
		
		
		//
		Instant.ofEpochSecond(3L);
		
		
		
		
	}

}
