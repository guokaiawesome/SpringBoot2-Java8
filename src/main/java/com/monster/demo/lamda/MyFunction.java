package com.monster.demo.lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class MyFunction {
	
	private static <T,R> List<R> map(List<T> list , Function<T, R> f){
		List<R> result =new ArrayList<>();
		for(T t : list) {
			result.add(f.apply(t));
		}
		return result;
	}
	
	public static void main(String[] args) {
		//Function<T,R>定义了一个apply方法，返回值为泛型R，如果你需要定义一个lambda，将输入对象的信息映射到输出，
		//就可以直接使用这个接口
		
		List<Integer> list=map(Arrays.asList("a","b","c"),(String s) -> s.length());
		
		//还有很多比如IntToDoubleFunction这些，自己看源码

	}

}
