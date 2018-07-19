package com.monster.demo.time;

import java.time.Clock;

/**
 * 
 * @description 用于练习java8的Clock类
 * Clock类对时区敏感
 * @author guokai
 * @date 2018年7月16日
 * @version v1.0
 */
public class MyClock {
	
	public static void main(String[] args) {
		Clock startClock=Clock.systemUTC();
		startClock.millis();
	}

}
