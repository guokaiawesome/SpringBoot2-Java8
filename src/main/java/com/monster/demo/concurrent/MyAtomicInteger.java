package com.monster.demo.concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public class MyAtomicInteger {
	
	public static void main(String[] args) {
		AtomicInteger ai=new AtomicInteger(1000);
		//AtomicInteger ai=new AtomicInteger();
		//取得当前值
		ai.get();
		
		//设置当前值
		ai.set(100);
		
		//如果当前值为10000，则设置为10001
		ai.compareAndSet(10000, 100001);
		
		//设置新值，并返回旧值
		ai.getAndSet(100);
		
		//当前值加1，并返回旧值
		ai.getAndIncrement();
		
		//当前值减1，并返回旧值
		ai.getAndDecrement();
		
		//当前值增加10，并返回旧值
		ai.getAndAdd(10);
		
		//当前值加1，并返回新值
		ai.incrementAndGet();
		
		//当前值减1，并返回新值
		ai.decrementAndGet();
		
		//当前值加10，并返回新值
		ai.addAndGet(10);
	}

}
