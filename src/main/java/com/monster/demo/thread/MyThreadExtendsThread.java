package com.monster.demo.thread;

public class MyThreadExtendsThread extends Thread{
	
	public MyThreadExtendsThread() {
		super();
	}

	public MyThreadExtendsThread(String name) {
		super(name);
	}

	public MyThreadExtendsThread(ThreadGroup group, String name) {
		super(group, name);
	}

	@Override
	public void run() {
		System.out.println(this.getName());
		this.getThreadGroup().getName();
		
		super.run();
	}

	
	
}
