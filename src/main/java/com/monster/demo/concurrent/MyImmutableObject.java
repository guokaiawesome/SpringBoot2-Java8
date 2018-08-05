package com.monster.demo.concurrent;
/**
 * 
 * @description 模拟不可变对象
 * Java中的不可变对象比如Integer、String、Boolean等(8个大的类)这些都是
 * 要点：
 * 1.类不可以被继承
 * 2.不能有set方法
 * 3.属性设置为final，表示不可以修改
 * 有一个可以创建完整对象的构造函数
 * @author guokai
 * @date 2018年8月5日
 * @version v1.0
 */
public final class MyImmutableObject {
	private final Integer id;
	
	private final String name;

	public MyImmutableObject(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

}
