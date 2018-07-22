package com.monster.demo.other;

import java.io.File;
import java.io.FileFilter;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class MyDoubleColonUsage {
	
	public static void main(String[] args) {
		File[] hiddenFiles=new File(".").listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.isHidden();
			}
		});
		
		hiddenFiles.toString();
		
		//双冒号意思是把这个方法作为值？ 就是把File的isHidden()方法作为参数传入
		//但是不太理解，isHidden()的返回值是boolean类型,和入参应该对应不上
		//这里的理解应该是不是把函数返回值作为入参
		//FilenameFilter这个类上面有个函数式接口注解
		//这里::相当于lamda表达式
		File[] hiddenFilesAnother=new File(".").listFiles(File::isHidden);
	
		//Consumer s=File::isHidden;
		
		//Predicate<File> p=File::isHidden;
		
	}

}
