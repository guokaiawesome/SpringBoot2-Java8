package com.monster.demo.concurrent;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;

/**
 * 
 * @description 无锁数组
 * 内部对int[]类型的封装
 * @author guokai
 * @date 2018年8月5日
 * @version v1.0
 */
public class MyAtomicIntegerArray {
	
	public static void main(String[] args) {
		
		AtomicIntegerArray intArray=new AtomicIntegerArray(100);
		new AtomicLongArray(100);
		new AtomicReferenceArray<>(100);
		
	}

}
