package com.monster.demo.other;

public class MyInstance {
	
	//避免类型强制转换的获取某个类的实例
	public <T> T getInstance(Class<T> cls) {
		
		try {
			return cls.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			return null;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return null;
		}
		
	}

}
