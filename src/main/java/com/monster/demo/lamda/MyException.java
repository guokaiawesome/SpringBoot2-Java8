package com.monster.demo.lamda;

public class MyException {
	
	//任何函数式接口都不允许抛出checked异常，如果你需要lamda表达式来抛出异常，有两种方法
	//一种是自定义一个自己的函数式接口，在接口方法红申请抛出checked异常
	//或者把lambda表达式包裹在一个try catch中，然后catch中抛出一个runtime异常
	
	public static void main(String[] args) {
		
	}

}
