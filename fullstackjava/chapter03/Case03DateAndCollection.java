package chapter03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

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
		
		
		// 1.2 SimpleDateFormat
		// 1.2.1 SimepleDateFormat简介
		// java.text.SimpleDateFormat是一个以与语言环境有关的方式来格式化和解析日期的具体类。
		// 构造方法：
		// SimpleDateFormat(); SimpleDateFormat(String pattern)
		// 方法：
		// final String format(Date date) Date => String
		// Date parse(String source) throw ParseException String => Date
	}
	
	/**
	 * 1.1.3 setTime()和getTime()方法
	 */
	@Test
	public void testSetTime() {
		Date date = new Date();
		System.out.println(date);
		
		long time = date.getTime();
		time += 60 * 60 * 24 * 1000;
		
		date.setTime(time);
		System.out.println(date);
	}
	
	/**
	 * 1.1.4 Date重写toString()方法
	 */
	@Test
	public void testDateToString() {
		// Date重写了toString()方法，用一个字符串来描述当前Date对象所表示的时间
		Date date = new Date();
		System.out.println(date.toString());
	}
	
	/**
	 * 1.2.3 将Date转换为String
	 */
	@Test
	public void testDateFormat() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		
		Date date = new Date();
		String formatedDate = format.format(date);
		
		System.out.println(formatedDate);
	}
	
	/**
	 * 1.2.4 将String解析为Date
	 */
	@Test
	public void testFormat() {
		String str = "1990-10-01";
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		System.out.println(date);
	}

}
