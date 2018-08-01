package com.monster.demo.thread;

import java.util.concurrent.Executors;
/**
 * 
 * @description 线程池
 * 注意看Executors的源码，底层都是调用ThreadPoolExecutor这个类
 * @author guokai
 * @date 2018年8月1日
 * @version v1.0
 */
public class MyThreadPool {
	
	public static void main(String[] args) {
		
		//只有一个线程的线程池
		Executors.newSingleThreadExecutor();
		
		//固定个数的线程池
		Executors.newFixedThreadPool(10);
		
		//具有缓存功能的线程池
		Executors.newCachedThreadPool();
		
		//只有一个线程的定时线程池
		Executors.newSingleThreadScheduledExecutor();
		
		//具有指定个数的定时线程池
		Executors.newScheduledThreadPool(10);
		
		
		
		Executors.newWorkStealingPool();
		
		
		
		
		
		
	}

}
