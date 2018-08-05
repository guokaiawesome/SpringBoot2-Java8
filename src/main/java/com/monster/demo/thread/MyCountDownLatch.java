package com.monster.demo.thread;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @description 倒计时器
 * 内部源码使用了CAS
 * @author guokai
 * @date 2018年8月1日
 * @version v1.0
 */
public class MyCountDownLatch {

	private static final CountDownLatch latch=new CountDownLatch(100);

	public static void main(String[] args) throws InterruptedException {
		MyCountDownLatch cdl=new MyCountDownLatch();
		CountDownLatchDemo demo=cdl.new CountDownLatchDemo();
		ExecutorService exec=Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++) {
			//submit有返回值，也方便异常处理，execute没有返回值，建议采用submit
			exec.submit(demo);
			//exec.execute(demo);
		}
		
		//主线程等待所有线程任务执行完毕
		latch.await();
		System.out.println("---end---");
		exec.shutdown();
		
	}
	
	 class CountDownLatchDemo implements Runnable{
		

		@Override
		public void run() {
			try {
				Thread.sleep(new Random().nextInt(10)*1000);
				System.out.println("check complete");
				latch.countDown();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}

