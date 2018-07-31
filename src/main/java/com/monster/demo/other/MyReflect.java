package com.monster.demo.other;

import java.lang.reflect.Method;

public class MyReflect {
	
	public static void main(String[] args) throws Exception {
		
		Class<String> cls1=String.class;
		
		Method method1=cls1.getMethod("compareTo", String.class);
		Method method2=cls1.getMethod("indexOf", String.class,int.class);
		
		String target="abc";
		//相当于执行abc.compareTo(bcd)  
		int a=(int) method1.invoke(target, "bcd");
		//target一般是一个对象，如果是静态方法，obj可以等于null
		int b=(int) method2.invoke(target,"a", 0);
		
		System.out.println(a);
		System.out.println(b);
		
		//这一行代码会执行Driver中的静态块代码
		//Class.forName("com.mysql.jdbc.Driver");
		
		
		
	}

}
