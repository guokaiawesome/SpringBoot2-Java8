package com.monster.demo.concurrent;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/**
 * 
 * @description AtomicIntegerFieldUpdater、AtomicLongFieldUpdater、AtomicReferenceFieldUpdater
 * Updater只能修改它可见范围内的变量，如果变量不可见，比如score为private类型，就不可以（测试一下）
 * 为了保证变量被正确读取，它必须是volatile类型的，
 * 不支持static字段
 * 
 * @author guokai
 * @date 2018年8月5日
 * @version v1.0
 */
public class MyAtomicIntegerFieldUpdater {
	public static void main(String[] args) {
		
		AtomicIntegerFieldUpdater<Candidate> scoreUpdater=AtomicIntegerFieldUpdater.newUpdater(Candidate.class, "score");
		final Candidate candidate=new Candidate();
		
		for(int i=0;i<1000;i++) {
			scoreUpdater.incrementAndGet(candidate);
		}
		
	}

}
