package com.monster.demo.lamda;

import java.util.function.Predicate;

public class MyPredicate {
	
	public static void main(String[] args) {
		//Predicate<T>定义了一个test方法，返回值为Boolean，如果有此种需求可以直接用
		
		
		Predicate<String> predicate= (String s) -> s.isEmpty();
		
		
	}

}
