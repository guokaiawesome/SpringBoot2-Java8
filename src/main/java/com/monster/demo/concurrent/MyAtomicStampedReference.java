package com.monster.demo.concurrent;

import java.util.concurrent.atomic.AtomicStampedReference;

/**
 * 
 * @description 带时间戳的对象引用
 * AtomicReference在对象的修改过程中丢失了状态信息
 * AtomicStampedReference内部不仅维护了对象的值，还维护了一个时间戳（实际上并不一定是时间），当AtomicStampedReference对应的数值被修改
 * 的时候，除了更新对象本身的值，还必须要更新时间戳
 * @author guokai
 * @date 2018年8月5日
 * @version v1.0
 */
public class MyAtomicStampedReference {
	
	public static void main(String[] args) {
		
		AtomicStampedReference<Integer> asr=new AtomicStampedReference<Integer>(100, 0);
		
		asr.getReference();
		
		asr.getStamp();
		
		asr.set(1000, 1);
		
		//只有当旧值为100，旧时间戳为0时候才将新值设置为1000，新时间戳设置为1
		asr.compareAndSet(100, 1000, 0, 1);
		
		
	}

}
