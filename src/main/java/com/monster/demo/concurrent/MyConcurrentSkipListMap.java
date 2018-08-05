package com.monster.demo.concurrent;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * 
 * @description 跳表的实现，这是一个Map,使用跳表的数据结构进行快速查找
 * 跳表是一种可以用来快速查找的数据结构，有点类似于平衡树，他们都可以对元素进行快速的查找
 * 但是一个重要的区别，平衡树的插入和删除往往很可能导致平衡树进行一次全局的调整，
 * 而对跳表的插入和删除只需要对整个数据结构的局部进行操作即可
 * 跳表的本质是同时维护了多个链表，并且链表是分层的
 * 跳表内的所有链表的元素都是排序的，查找时，可以从顶级链表开始查找，一旦发现被查找的元素大于当前链表中的值，就会转入下一层链表继续查找
 * @author guokai
 * @date 2018年8月3日
 * @version v1.0
 */
public class MyConcurrentSkipListMap {

	public static void main(String[] args) {
		
		//测试一下ConcurrentSkipListMap的有序性
		//经过验证ConcurrentSkipListMap和下面的TreeMap输出结果一样
		Map<String,String> map1=new HashMap<>();
		Map<String,String> map2=new ConcurrentSkipListMap<>();
		Map<String,String> map3=new TreeMap<>((a,b) ->a.compareTo(b) );
		
		for(int i=0;i<30;i++) {
			map1.put(i+"", i+"");
			map2.put(i+"", i+"");
			map3.put(i+"", i+"");
		}
		
		for(Map.Entry<String, String> entry : map1.entrySet()) {
			System.out.print(entry.getKey()+",");
		}
		System.out.println("-------");
		
		for(Map.Entry<String, String> entry : map2.entrySet()) {
			System.out.print(entry.getKey()+",");
		}
		System.out.println("-------");
		
		for(Map.Entry<String, String> entry : map3.entrySet()) {
			System.out.print(entry.getKey()+",");
		}
		System.out.println("-------");

	}
}
