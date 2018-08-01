package com.monster.demo.thread;
/**
 * 
 * @description 读写锁
 * 读写锁可以有效的帮助减少锁竞争
 * 读-读之间不阻塞
 * 读阻塞写，写阻塞读
 * 写-写相互阻塞
 * @author guokai
 * @date 2018年8月1日
 * @version v1.0
 */

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;

public class MyReentrantReadWriteLock {
	
	ReadWriteLock readWriteLock =new ReentrantReadWriteLock();
	Lock readLock=readWriteLock.readLock();
	Lock writeLock=readWriteLock.writeLock();

}
