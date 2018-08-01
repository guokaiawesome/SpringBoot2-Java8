package com.monster.demo.optional;

public class Insurance {
	
	/**
	 * 只在可能为空的字段上加上Option，一定不能为空的字段上不要加上Option，方便定位问题
	 * 比如： 一种保险必须有名字，没有的话就是数据有问题，应该抛出空指针异常
	 */
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
