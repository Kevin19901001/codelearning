package chapter03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
		
		
		// 1.3 Calendar
		// 1.3.1 Calendar简介
		// java.util.Calendar类用于封装日历信息，其主要作用在于其方法可以对时间分量进行运算；
		// Calendar是抽象类，其具体子类针对不同国家的日历系统，其中应用最广泛的是GregorianCalendar（通用的阳历），对应世界上绝大多数国家或地区使用的标准日历系统。
		
		
		// 2. 集合框架
		// 2.1 Collection
		// 在实际开发中，需要将实际的对象存储于特定数据结构的容器中。JDK提供了这样的容器---集合（Collection）
		// Collection是一个接口，定义了集合相关的操作方法。其有两个字接口，List和Set
		// List：可重复集
		// Set：不可重复集
		
		
		// 2.1.2 集合持有对象的引用
		// 集合中存储的都是引用类型元素，并且集合只保存每个元素对象的引用，而并非将元素对象本身存入集合。
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
	
	/**
	 * 1.3.2 getInstance()方法
	 * Calendar提供了一个类方法getInstance()，以获得此类型的一个通用的对象
	 * Calendar的getInstance()方法返回一个Calendar对象，其日历字段已由当前日期和时间初始化。
	 */
	@Test
	public void testGetInstance() {
		Calendar c = Calendar.getInstance();
		System.out.println(c.getClass().getName());

		System.out.println(c.getTime());
		
		GregorianCalendar gc = new GregorianCalendar(2020, Calendar.MARCH, 23);
		System.out.println(gc.getTime());
	}
	
	/**
	 * 1.3.3 设置日期及时间分量
	 */
	@Test
	public void testSet() {
		Calendar clndr = Calendar.getInstance();
		clndr.set(Calendar.YEAR, 2020);
		clndr.set(Calendar.MONTH, Calendar.MARCH);
		clndr.set(Calendar.DATE, 24);
		System.out.println(clndr.getTime());		// Tue Mar 24 20:49:40 CST 2020
		
		clndr.set(Calendar.DATE, 32);
		System.out.println(clndr.getTime());		// Wed Apr 01 20:49:40 CST 2020
	}
	
	/**
	 * 1.3.4 获取日期及时间分量
	 */
	@Test
	public void testGet() {
		Calendar clndr = Calendar.getInstance();
		clndr.set(Calendar.YEAR, 2020);
		clndr.set(Calendar.MONTH, Calendar.MARCH);
		clndr.set(Calendar.DATE, 25);
		
		int day = clndr.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
	}
	
	/**
	 * 1.3.5 getActualMaximum方法
	 * int getActualMaximum(int field)给定此Calendar的时间值，返回指定日历字段可能拥有的最大值
	 */
	@Test
	public void testGetActualMaximum() {
		int year = 2020;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.DATE, 1);
		
		for(int month=Calendar.JANUARY; month<=Calendar.DECEMBER; month++) {
			c.set(Calendar.MONTH, month);
			System.out.println(year + "年" + (month + 1) + "月" + c.getActualMaximum(Calendar.DATE) + "天");
		}
	}
	
	/**
	 * 1.3.6 add方法
	 * void add(int field, int mount)为给定的时间分量的值加上给定的值，若给定的值为负数，则是减去给定的值
	 * 输出1年后再减去3个月的日期
	 */
	@Test
	public void testAdd() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.YEAR, 1);
		calendar.add(Calendar.MONTH, -3);
		System.out.println("year:" + calendar.get(Calendar.YEAR));
		System.out.println("month:" + calendar.get(Calendar.MONTH));
		System.out.println("day:" + calendar.get(Calendar.DAY_OF_MONTH));
	}
	
	/**
	 * 1.3.7 setTime与getTime方法
	 * Date getTime():使用Date描述Calendar表示日期并返回
	 * void setTime(Date d):使用Calendar表示Date所描述的日期
	 */
	@Test
	public void testGetTimeAndSetTime() {
		Calendar calendar = Calendar.getInstance();
		Date date = new Date();
		System.out.println(date);
		
		calendar.setTime(date);
		date = calendar.getTime();
		System.out.println(date);
	}
	
	/**
	 * 2.1.3 add方法
	 */

}
