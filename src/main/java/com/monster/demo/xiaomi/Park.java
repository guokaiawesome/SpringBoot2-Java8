package com.monster.demo.xiaomi;


import java.time.Duration;
import java.time.LocalDateTime;

/**
 * 
 * 停车场类
 * 
 * @author guokai
 *
 */
public class Park {

	
	/** 
	 * 
	 * 停车收费
	 * 
	 * @param car   汽车类型
	 * @param time	停车时间
	 * @return 	收费钱数
	 */
	public static long charge(Car car,LocalDateTime inTime,LocalDateTime outTime) {
		long money;
		int price;
		
		//汽车类型 		1代表小汽车	 2代表中型卡车	3代表超长卡车
		int type = car.type();
		
		Duration duration=Duration.between(inTime, outTime);
		//分钟数
		long minutes=duration.toMinutes();
		
		switch(type) {
		case 1:
			price=10;
			break;
		case 2:
			price=20;
			break;
		case 3:
			price=30;
			break;
		default:
			price=10;
		}
		
		money=price*minutes;
		return money;
	}
	
}
