package com.monster.demo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/**
 * 
 * @description 线程池
 * 注意看Executors的源码，底层都是调用ThreadPoolExecutor这个类
 * ThreadPoolExecutor这个类中的构造器参数详解参见《实战高并发程序设计》最好要记住
 * @author guokai
 * @date 2018年8月1日
 * @version v1.0
 */
public class MyThreadPool {
	
	public static void main(String[] args) {
		
		//只有一个线程的线程池,若没有空闲线程，新任务将进入等待队列
		ExecutorService singleThreadPool=Executors.newSingleThreadExecutor();
		for(int i=0; i<10;i++) {
			MyThreadImplementRunable task=new MyThreadImplementRunable();
			Future<?> future=singleThreadPool.submit(task);
		}
		
		//固定个数的线程池，当有新任务提交时，如果线程池中有空闲线程则立即执行，
		//如果没有空闲线程，新任务会被暂存在一个任务队列中，待有空闲线程时便处理队列中的任务
		//这个源码中采用的是无界队列（LinkedBlockingQueue），当任务提交非常频繁时候，该队列会迅速膨胀，从而耗尽资源
		ExecutorService fixedThreadPool=Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++) {
			MyThreadImplementCallable task=new MyThreadImplementCallable();
			Future<String> future=fixedThreadPool.submit(task);
		}
		
		//返回一个可根据实际情况调整线程数量的线程池，线程池的数量不固定，如果有空闲线程可以复用，优先采用可复用的线程
		//如果所有线程都在工作，有新的任务提交，则会创建新的线程处理任务，所有线程在任务执行完毕之后返回线程池进行复用
		//通过源码可以看出这个corePoolSize为0,maximumPoolSize为Integer最大值，空闲线程会在60s内回收，
		//SynchronousQueue这个队列比较特殊，并没有容量，每一个插入操作都要等待一个相应的删除操作
		//如果同时有大量任务被提交，而任务的执行又不那么快时，那么系统会开启等量的线程处理，这样可能会很快耗尽系统的资源
		ExecutorService cachedThreadPool=Executors.newCachedThreadPool();
		
		//只有一个线程的定时线程池，在给定时间或者周期性执行某个任务
		ScheduledExecutorService singleScheduleThreadPool=Executors.newSingleThreadScheduledExecutor();
		
		//具有指定个数的定时线程池，在给定时间或者周期性执行某个任务
		ScheduledExecutorService fixedScheduleThreadPool=Executors.newScheduledThreadPool(10);
		//周期性调度任务一定要处理好异常，因为如果任务遇到异常，那么后续所有的子任务都会停止调度
		//注意，下面这三个方法都只能接受Runable接口参数，不能接受Callable接口参数
		//在给定时间对任务进行调度一次
		MyThreadExtendsThread command1=new MyThreadExtendsThread();
		fixedScheduleThreadPool.schedule(command1, 10, TimeUnit.SECONDS);
		//对任务进行周期性调度，在上一个任务开始后间隔一定时间执行
		MyThreadImplementRunable command2=new MyThreadImplementRunable();
		fixedScheduleThreadPool.scheduleAtFixedRate(command2, 0, 2, TimeUnit.SECONDS);
		//对任务进行周期性调度，在上一个任务执行结束之后间隔一定时间执行,注意这
		MyThreadImplementRunable command3=new MyThreadImplementRunable();
		fixedScheduleThreadPool.scheduleWithFixedDelay(command3, 0, 2, TimeUnit.SECONDS);
		
		Executors.newWorkStealingPool();
		
		
		
		
		
		
	}

}
