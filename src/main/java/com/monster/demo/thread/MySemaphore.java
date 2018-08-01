package com.monster.demo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * 
 * @description 信号量
 * 信号量可以指定多个线程同时访问某一个资源
 * @author guokai
 * @date 2018年8月1日
 * @version v1.0
 */
public class MySemaphore {


	public static void main(String[] args) {
		SemaphoreDemo demo= new SemaphoreDemo();
		ExecutorService exec=Executors.newFixedThreadPool(20);
		for(int i=0;i<20;i++) {
			exec.submit(demo);
		}
	}
	

}

class  SemaphoreDemo implements Runnable {
	//后面一个参数表示是否公平，可以省略
	private Semaphore semaphore=new Semaphore(5,true);
	
	@Override
	public void run() {
		
		try {
			semaphore.acquire();  //若无法获得，会进行等待
			//semaphore.tryAcquire();  //不会进行等待
			
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getId()+":done");
			semaphore.release();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
