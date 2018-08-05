package com.monster.demo.concurrent;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 
 * @description ThreadLocal简单使用
 * 如果使用线程池，就意味着线程未必会退出，如果这样，将一些大的对象设置到ThreadLocal中，
 * 可能会使系统出现内存泄露，如果你希望及时回收对象，最好使用ThrealLocal.remove()方法将这个变量移除，
 * 也可以使用==null这种方式来让系统来回收对应的所有线程的局部变量
 * 这个例子还有待完善
 * @author guokai
 * @date 2018年8月5日
 * @version v1.0
 */
public class MyThreadLocal {
	static ThreadLocal<Random> threadLocal=new ThreadLocal<>();
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		Task task=new Task();
		ExecutorService exec=Executors.newFixedThreadPool(10);
		//Future<Long> future=exec.submit(task);
		//注意这里的写法，因为ThreadLocal的key是当前对象，所以如果用一个task的话应该起不到作用
		Future<Long> future=exec.submit(new Task());
		if(future.isDone()) {
			future.get();
		}
		
		
	}
	
	static class Task implements Callable<Long>{

		@Override
		public Long call() throws Exception {
			if(threadLocal.get()==null) {
				threadLocal.set(new Random());
			}
			Random random=threadLocal.get();
			return random.nextLong();
		}
		
	}

}


