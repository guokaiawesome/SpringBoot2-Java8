package com.monster.demo.xiaomi;


import java.time.LocalDateTime;

/**
 * 
 * 所有车的品种
 * 因为Java8中的接口可以有默认实现，基本可以替换抽象类，所以这里没有采用抽象类来书写，各个不同种类的车实现接口而不是继承抽象类
 * 
 * 
 * @author guokai
 *
 */
public interface Car {
	
	/** 汽车类型 	1代表小汽车	 2代表中型卡车	3代表超长卡车*/
	int type();
	
	/**
	 * 驶入
	 * @return  驶入时间
	 */
	default LocalDateTime  driveIn() {
		return LocalDateTime.now();
	};
	
	/**
	 * 
	 * @return	驶出时间
	 */
	default LocalDateTime  driveOut() {
		return LocalDateTime.now();
	}
	

}
