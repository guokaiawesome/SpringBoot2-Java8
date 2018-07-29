package com.monster.demo.stream;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @description 构建流的几种方式
 * @author guokai
 * @date 2018年7月29日
 * @version v1.0
 */
public class MyBuildStream {

	public static void main(String[] args) {
		
		//由值直接创建流
		Stream<String> stream1=Stream.of("a","b","c");
		stream1.map(String::toUpperCase).forEach(System.out::println);
		
		//由数组创建流
		int[] numbers1= {1,2,3,4,5};
		IntStream stream2=Arrays.stream(numbers1);
		double[] numbers2= {1.1,2.2,3.3,4.4,5.5};
		DoubleStream stream3=Arrays.stream(numbers2);
		//数值流可以直接执行sum,count等方法
		stream2.sum();
		stream2.count();
		stream2.average();

		//由文件生产流
		try {
			Stream<String> lines=Files.lines(Paths.get("D:/a.txt"), Charset.defaultCharset());
			lines.flatMap( line -> Arrays.stream(line.split(" "))).distinct().count();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//由函数生产流
		Stream.iterate(0, n -> n+2).limit(10).forEach(System.out::println);
		//一般来说在需要依次生成一系列值的时候应该用iterate
		
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
		//Stream.generate(() -> Math.random());
		
	}
	
	
	
	
}
