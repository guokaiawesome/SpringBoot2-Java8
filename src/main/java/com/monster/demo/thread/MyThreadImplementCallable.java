package com.monster.demo.thread;

import java.util.concurrent.Callable;

/**
 * 
 * @description 实现Callable接口创建线程
 * Callable接口是一个函数式接口，可以通过lambda表达式来创建
 * @author guokai
 * @date 2018年8月1日
 * @version v1.0
 */
public class MyThreadImplementCallable implements Callable<String>{

	/**
	 * call方法相对于run方法而言，两个最主要的区别
	 * 1.Call方法可以有返回值
	 * 2.call方法可以声明抛出异常
	 */
	@Override
	public String call() throws Exception {
		return null;
	}

}
