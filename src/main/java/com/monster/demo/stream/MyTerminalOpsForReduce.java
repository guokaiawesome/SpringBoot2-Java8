package com.monster.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * 
 * @description 流的终端操作reduce
 * @author guokai
 * @date 2018年7月29日
 * @version v1.0
 */
public class MyTerminalOpsForReduce {
	
	public static void main(String[] args) {
		
		Integer[] aa= {1,2,3,4,5,6,7,8,9};
		List<Integer> numbers=Arrays.asList(aa);
		
		Optional<Integer> first=numbers.stream().map(x -> x*x).filter(x -> x%3==0).findFirst();
		
		//0表示初始值
		int sum=numbers.stream().reduce(0,(a,b) -> a+b);
		//也可以写成
		sum=numbers.stream().reduce(0, Integer::sum);
		
		
		Optional<Integer> max=numbers.stream().reduce(Integer::max);
		
		
		
		
		
		
		
	}

}
