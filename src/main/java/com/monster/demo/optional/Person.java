package com.monster.demo.optional;

import java.util.Optional;

public class Person {
	
	/**
	 * 只在可能为空的字段上加上Option，一定不能为空的字段上不要加上Option，方便定位问题
	 * 比如： 一个人可能有车也可能没有车
	 */
	private Optional<Car> car;

	public Optional<Car> getCar() {
		return car;
	}

	public void setCar(Optional<Car> car) {
		this.car = car;
	}
	
	

}
