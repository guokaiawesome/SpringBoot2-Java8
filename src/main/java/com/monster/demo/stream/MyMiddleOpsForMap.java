package com.monster.demo.stream;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


/**
 * 
 * @description 流的中间操作map方法
 * @author guokai
 * @date 2018年7月29日
 * @version v1.0
 */
public class MyMiddleOpsForMap {

	public static void main(String[] args) {
		
		//流的map方法，接收一个函数作为参数，这个函数会被应用到每个元素上，并将其映射成一个新的元素
		String[] sa= {"Java 8","Lambda","Stream"};
		List<String> list=Arrays.asList("Java 8");
		
		//map方法输入为string   输出为字符串的长度
		List<Integer> lengthList=list.stream().map(String::length).collect(Collectors.toList());
		
		
	}
}
