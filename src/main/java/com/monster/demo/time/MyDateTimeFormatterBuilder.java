package com.monster.demo.time;

import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.Locale;

/**
 * 
 * @description 通过这个类自定义自己想要的DateTimeFormatter
 * @author guokai
 * @date 2018年7月18日
 * @version v1.0
 */
public class MyDateTimeFormatterBuilder {

	public static void main(String[] args) {

		new DateTimeFormatterBuilder().appendText(ChronoField.DAY_OF_MONTH).appendLiteral("-")
				.appendText(ChronoField.MONTH_OF_YEAR).appendLiteral("-").appendText(ChronoField.YEAR)
				.appendLiteral(" ").parseCaseInsensitive().toFormatter(Locale.CHINA);
	}
}
