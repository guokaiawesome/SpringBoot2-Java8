package com.monster.demo.time;

import java.time.LocalDateTime;
import java.time.MonthDay;

/**
 * 
 * @description 只包括月份和日期的时间
 * @author guokai
 * @date 2018年7月30日
 * @version v1.0
 */
public class MyMonthDay {
	
	public static void main(String[] args) {
		MonthDay.now();
		MonthDay.from(LocalDateTime.now());
		MonthDay.of(12, 30);
		
	}

}
