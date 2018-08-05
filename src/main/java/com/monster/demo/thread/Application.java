package com.monster.demo.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Application {
	
	public static void main(String[] args) throws Exception {
		
		
		//主线程的名字
		Thread.currentThread().getThreadGroup().getName();
		
		//线程的几种构造器，一般包括三种，默认构造器，带名字的构造器，带线程组的构造器
		
		//不要轻易调用线程组的stop方法，它会停止线程组中的所有的线程
		ThreadGroup group =new ThreadGroup("group1");
		
		MyThreadExtendsThread thread1=new MyThreadExtendsThread();
		new MyThreadExtendsThread("");
		//new MyFirstThread(group, name);
		//可以设置为后台线程，比如GC线程就是属于后台线程
		//thread1.setDaemon(true);
		thread1.start();
		
		//总是返回当前正在执行的线程对象
		Thread.currentThread();
		
		//实现runable接口启动多线程的时候要注意，如果有锁的话，
		//那么Thread构造器中的target要么指向同一个对象，要么在锁对应的方法上加上static,加上static之后就相当于请求当前类的锁，而不是对象的锁
		MyThreadImplementRunable thread2=new MyThreadImplementRunable();
		new Thread(thread2);
		new Thread(thread2,"RunableThread1");
		//new Thread(group, target, name);
		
		//Runable接口是一个函数式接口，从java8以后可以使用lambda表达式来创建Runable对象
		new Thread(() -> {});
		new Thread(() -> {},"");
		
		
		MyThreadImplementCallable thread3=new MyThreadImplementCallable();
		//这里的FutureTask实现了Runable接口
		FutureTask<String> task=new FutureTask<String>(thread3);
		new Thread(task, "");
		//取消关联的Callable任务
		task.cancel(true);
		//返回Callable任务里面call方法的返回值，此方法阻塞,并且会抛出异常
		task.get();
		//返回Callable任务里面call方法的返回值，该方法最多阻塞10秒，如果指定时间内依然没有返回值，将抛出异常
		task.get(10, TimeUnit.SECONDS);
		//如果在Callable任务正常完成前被取消，则返回true
		task.isCancelled();
		//如果Callable任务已经完成，则返回true
		task.isDone();
		
		//Callable接口也是一个函数式接口，从java8以后可以使用lambda表达式来创建Callable对象
		//FutureTask<String> task2=new FutureTask<String>((Callable<String>)() -> { return null;});
		FutureTask<String> task2=new FutureTask<String>(() -> { return null;});

		
	}

}
