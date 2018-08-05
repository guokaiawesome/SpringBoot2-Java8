package com.monster.demo.other;
/**
 * 
 * @description 单例模式
 * 写法源于《实战Java高并发程序设计》
 * @author guokai
 * @date 2018年8月5日
 * @version v1.0
 */
public class MySingleton {
	
	private MySingleton() {
		System.out.println("singleton created");
	}
	
	private static class SingletonHolder {
		private static MySingleton instance=new MySingleton();
	}
	
	public static MySingleton getInstance() {
		return SingletonHolder.instance;
	}

}
