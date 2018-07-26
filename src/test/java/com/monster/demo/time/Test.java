package com.monster.demo.time;

import java.time.Instant;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println(Instant.now());
		System.out.println(Instant.now().getNano());
		System.out.println(Instant.now().getEpochSecond());
		System.out.println(Instant.now().toEpochMilli());
		long a=Instant.now().toEpochMilli();
		Thread.sleep(500);
		
		
		System.out.println(Instant.now());
		System.out.println(Instant.now().getNano());
		System.out.println(Instant.now().getEpochSecond());
		System.out.println(Instant.now().toEpochMilli());
		
		long b=Instant.now().toEpochMilli();
		
		System.out.println("耗费毫秒数"+(b-a));
		
		
	}
}
