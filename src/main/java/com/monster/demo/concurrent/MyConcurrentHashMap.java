package com.monster.demo.concurrent;

/**
 * 
 * @description ConcurrentHashMap
 * 内部通过分段锁来控制，这有利于减小锁的范围，但是求map的size的时候相当于全段都要加锁
 * @author guokai
 * @date 2018年8月5日
 * @version v1.0
 */
public class MyConcurrentHashMap {
	public static void main(String[] args) {
		//这种方式也可以将一个map变成线程安全的map，但是有了ConcurrentHashMap，不建议使用该方法
		//Collections.synchronizedMap(new HashMap<>());
		
		
		
	}

}
