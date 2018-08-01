package com.monster.demo.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 
 * @description 可重入锁
 * 可重入锁必须在finally中人为显式释放
 * 可重入锁意思是一个线程可以对已经被枷锁的ReentrantLock锁再次加锁，也就是一个线程连续两次获得同一把锁
 * 如果不允许这么做的话，那么同一个线程在第二次获得锁的时候将会和自己产生死锁
 * 
 * Condition用于协调线程之间的通信
 * @author guokai
 * @date 2018年8月1日
 * @version v1.0
 */
public class MyReentrantLock {
	
	private final ReentrantLock lock=new ReentrantLock();
	//private final ReentrantLock lock2=new ReentrantLock(true);  //公平锁

	
	//使用Lock的时候不能使用wait、notify、notifyAll方法，这三个方法是跟synchronized关键字一起使用的
	//采用condition的await、signal、signalAll方法来协调线程之间的通信
	private final Condition cond=lock.newCondition();
	
	public void test() {
		
		System.out.println("---a---");
		lock.lock();
		
		try {
			System.out.println("---b---");
			//让当前线程等待（挂起）
			cond.await();
			// ... some ops
			
			//唤醒其他线程
			cond.signalAll();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
		
		
		
		
	}

}
