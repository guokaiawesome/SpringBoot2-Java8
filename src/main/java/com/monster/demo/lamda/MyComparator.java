package com.monster.demo.lamda;

import java.util.Comparator;

public class MyComparator {
	
	public static void main(String[] args) {
		
		//(String s1,String s2) ->s1.compareTo(s2);
		
		
		Comparator co=	new Comparator<MyCommodity>() {

			@Override
			public int compare(MyCommodity o1, MyCommodity o2) {
				// TODO Auto-generated method stub
				return o1.getNumber().compareTo(o2.getNumber());
			}
		};
		
		//了解一下reverse和then这些，比如第一个参数相同的情况下，第二个参数如何排序
		co.reversed().thenComparing(co);
		
	}

}
