package com.monster.demo.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;


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
		//当前瞬时时间的毫秒数,可以和后面两个比较一下
		startClock.millis();
		System.currentTimeMillis();
		Instant.now().toEpochMilli();
		
		Clock.systemDefaultZone();
		
		Clock.system(ZoneId.of(ZoneId.SHORT_IDS.get("CTT"))).instant();
		
		Clock.fixed(Instant.now(), ZoneId.of(ZoneId.SHORT_IDS.get("CTT")));
		
		
	}

}
