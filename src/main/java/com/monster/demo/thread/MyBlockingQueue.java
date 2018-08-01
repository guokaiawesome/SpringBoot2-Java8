package com.monster.demo.thread;

/**
 * 
 * @description BlockingQueue
 * 它的主要作用并不是作为容器，而是作为线程同步的工具
 * 当生产者线程试图向BlockingQueue中放入元素时，如果该队列已满，则该线程被阻塞
 * 当消费者线程试图试图从BlockingQueue中取出元素时，如果该队列已空，则该线程被阻塞
 * 实现类有ArrayBlockingQueue、LinkedBlockingQueue、SynchronousQueue等
 * @author guokai
 * @date 2018年8月1日
 * @version v1.0
 */
public class MyBlockingQueue {

}
