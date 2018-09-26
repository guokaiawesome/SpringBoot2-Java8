package com.monster.demo.xiaomi;

import java.time.LocalDateTime;

public class Test {
	
	public static void main(String[] args) {
		LocalDateTime outTime=LocalDateTime.now().plusMinutes(10);
		
		Car miniCar=new MiniCar();
		long miniCarCharge=Park.charge(miniCar, miniCar.driveIn(), outTime);
		System.out.println(miniCarCharge);
		
		Car mediumCar=new MediumCar();
		long mediumCarCharge=Park.charge(mediumCar, mediumCar.driveIn(), outTime);
		System.out.println(mediumCarCharge);
		
		Car bigCar=new BigCar();
		long bigCarCharge=Park.charge(bigCar, bigCar.driveIn(), outTime);
		System.out.println(bigCarCharge);

	}

}
