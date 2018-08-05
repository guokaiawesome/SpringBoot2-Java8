package com.monster.demo.optional;
/**
 * 
 * @description Optional工具类
 * @author guokai
 * @date 2018年8月2日
 * @version v1.0
 */

import java.util.Optional;

public class OptionalUtil {
	
	public static Optional<Integer> stringToInteger(String str){
		
		try {
			return Optional.of(Integer.parseInt(str));
		} catch (NumberFormatException e) {
			//这里的异常可以不打印，没有什么用
			return Optional.empty();
		}
		
	}

}
