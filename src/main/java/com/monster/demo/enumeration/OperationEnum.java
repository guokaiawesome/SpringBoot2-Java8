package com.monster.demo.enumeration;

/**
 * 
 * @description 测试一下枚举实现接口的用法
 * 主要是看到ChronoField实现了一个接口，所以想试一下
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
