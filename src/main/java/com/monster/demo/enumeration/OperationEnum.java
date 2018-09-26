package com.monster.demo.enumeration;

/**
 * 
 * @description 测试一下枚举实现接口的用法
 * 参考疯狂JAVA讲义
 * 
 * 枚举在实现接口的时候，每个枚举值在调用该方法的时候都有相同的香味方式，因为方法体完全一样
 * 如果需要每个枚举值在调用该方法的时候呈现出不同的行为方式，则可以让每个枚举值分别来实现该方法
 * 每个枚举值提供不同的实现方式，从而让不同的枚举值调用该方法时候具有不同的行为方式
 * 
 * 
 * @author guokai
 * @date 2018年7月18日
 * @version v1.0
 */
public enum OperationEnum implements BasicOperation {
	//看下这样有什么用,这个方法怎么调用
	PLUS("+"){
		public double apply(double x, double y) {
			return 0;
		}
	};
	
	
	private String symbol;
	
	private OperationEnum(String symbol) {
		this.symbol = symbol;
	}



	@Override
	public double apply(double x, double y) {
		return 0;
	}

}
