package com.monster.demo.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 
 * @description 中间操作flatmap的用法
 * @author guokai
 * @date 2018年7月29日
 * @version v1.0
 */
public class MyMiddleOpsForFlatMap {
	
	public static void main(String[] args) {
		//flatmap方法将流扁平化
		
		String[] words= {"Hello","World"};
		List<String> list=Arrays.asList(words);
		
		//可以看到下面一步collect之后的返回值是List<String[]>，而不是List<String>
		List<String[]> list2=list.stream().map(word -> word.split("")).distinct().collect(Collectors.toList());
		
		//可以看到这一步也没有变成我们想要的List<String>，而是变成了List<Stream<String>>
		List<Stream<String>> list3=list.stream().map(word -> word.split("")).map(Arrays::stream).distinct().collect(Collectors.toList());
		
		
		//变成我们想要的样子
		List<String> list4=list.stream().map(word -> word.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		
	}

}
