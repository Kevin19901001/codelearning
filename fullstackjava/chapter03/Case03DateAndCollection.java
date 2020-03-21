package chapter03;

import java.util.Date;

public class Case03DateAndCollection {

	public static void main(String[] args) {
		// 1. 日期操作
		// 1.1 Date及其常用API
		// 1.1.1 Java中的时间
		// Java中的时间使用标准类库的Date类表示，是用一个距离固定时间点的毫秒数（可正可负，long类型）表达一个特定的时间点
		
		// 1.1.2 Date类简介
		// java.util.Date类封装日期及时间信息
		// Date类的大多数用于时间分量计算的方法已经被Calendar取代
		Date date = new Date();
		System.out.println(date);
		
		long time = date.getTime();
		System.out.println(time);
		
	}

}
