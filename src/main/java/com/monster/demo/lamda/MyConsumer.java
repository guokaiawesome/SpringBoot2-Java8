package com.monster.demo.lamda;

import java.util.function.Consumer;

public class MyConsumer {

	public static void main(String[] args) {
		
		//Consumer<T>定义了一个accept方法，返回值为空，如果有此种需求可以直接用
	
		Consumer<Integer> myConsumer = (Integer i) -> System.out.println(i);
		
		//这里没有判断空指针，仅做演示作用
		Consumer<MyCommodity> myConsumer2=(MyCommodity myCommodity) -> {int i;i=myCommodity.getNumber()*myCommodity.getPrice();System.out.println(i);};
	}

}
