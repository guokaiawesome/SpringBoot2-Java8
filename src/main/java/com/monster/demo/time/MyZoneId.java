package com.monster.demo.time;

import java.time.ZoneId;

public class MyZoneId {
	
	public static void main(String[] args) {
		//写的时候看下下面这个SHORT_IDS里面的源码
		ZoneId.of(ZoneId.SHORT_IDS.get("CTT"));
	}

}
