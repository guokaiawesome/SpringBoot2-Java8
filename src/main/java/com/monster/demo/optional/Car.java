package com.monster.demo.optional;

import java.util.Optional;

public class Car {
	
	/**
	 * 只在可能为空的字段上加上Option，一定不能为空的字段上不要加上Option，方便定位问题
	 * 比如： 一个车可能有保险也可能没有保险
	 */
	private Optional<Insurance> insurance;

	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}
	
	
	

}
