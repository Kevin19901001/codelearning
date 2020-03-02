﻿package chapter03;

import org.junit.Test;

/**
 * Java API文档和字符串基本操作
 * @author HuanQing
 * @since 2020-02-23
 */
public class Case01APIDocAndStringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 1.1 JDK API
		 * 1.1.1 什么是JDK API：JDK中包含大量的API类库，JDK中包含的类库功能强大，经常使用的有：
		 * 字符串操作，集合操作，文件操作，输入输出操作，网络操作，多线程等等。
		 * 1.1.2 JDK包结构：java.lang, java.util, java.io, java.net, java.math, java.security, java.sql, java.text...
		 */
		
		
		/**
		 * 1.2 文档注释规范：
		 * 1.2.1 文档注释
		 * 1.2.2 文档注释规范
		 * 1.2.3 javadoc命令生成文档
		 */
		
		
		/**
		 * 2.1 String及其常用API：
		 * 2.1.1 String是不可变对象：String使用了final修饰，不可被继承；
		 * 字符串底层封装了字符数组及针对字符数组的操作算法；
		 * 字符串一旦创建，对象永远无法改变，但字符串引用可以重新赋值；
		 * Java字符串在内存中采用Unicode编码方式，任何一个字符对应两个字节的定长编码。
		 */
		
		
		/**
		 * 2.1.2 String常量池：
		 * Java为了提高性能，静态字符床（字面量、常量、常量连接的结果）在常量池中创建，并尽量使用同一个对象，重用静态字符串。
		 */
	}
	
	/**
	 * 2.1.2 测试String常量池
	 */
	@Test
	public void testConstantPool() {
		String str1 = "Hello";
		
		// 不会创建新的对象，而是创建常量池中已有的"Hello":
		String str2 = "Hello";
		System.out.println(str1 == str2);		// true
		
		// 使用new关键字会创建新的String对象：
		String str3 = new String("Hello");
		System.out.println(str1 == str3);		// false
	}
	
	/**
	 * 2.1.3 内存编码及长度
	 * String在内存中采用unicode编码，每个字符占用2个字节，任何一个字符（不论中文还是英文），都算一个字符长度，占用两个字节。
	 */
	@Test
	public void testLength() {
		String str1 = "Hello";
		System.out.println(str1.length());		// 5
		
		String str2 = "你好，String!";
		System.out.println(str2.length());		// 10
	}
	
	/**
	 * 2.1.4 使用indexOf()方法实现检索
	 * indexOf方法用于在字符串中检索另一个字符串
	 */
	@Test
	public void testIndexOf() {
		String str = "I can because I think I can";
		int index = str.indexOf("can");
		System.out.println(index);				// 2
		
		index = str.lastIndexOf("can");			// 24
		System.out.println(index);
		
		index = str.indexOf("can", 6);
		System.out.println(index);				// 18
		
		index = str.indexOf("Can");
		System.out.println(index);				// -1
	}
	
	/**
	 * 2.1.5 使用substring获取子串
	 */
	@Test
	public void testSubstring() {
		String str = "http://www.oracle.com";
		String subString = str.substring(11, 17);
		System.out.println(subString);			// oracle
		
		subString = str.substring(7);
		System.out.println(subString);			// www.oracle.com
	}
	
	/**
	 * 2.1.6 trim()
	 * 去掉一个字符串的前导和后续空字符
	 */
	@Test
	public void testTrim() {
		String userName = "  good man ";
		userName = userName.trim();
		System.out.println(userName.length());	// 8
		System.out.println(userName);			// good man
	}
	
	/**
	 * 2.1.7 cahrAt()
	 * 遍历一个字符串中的字符序列
	 */
	@Test
	public void testCahrAt() {
		String str = "Whatisjava";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			System.out.print(c + " ");
		}
	}
	
	/**
	 * 2.1.8 startsWith()和endsWith()
	 */
	@Test
	public void testStartWithAndEndWith() {
		String str = "Think in Java";
		System.out.println(str.startsWith("Think"));	// true
		System.out.println(str.endsWith("Java"));		// true
		System.out.println(str.endsWith("in"));			// false
	}
	
	/**
	 * 2.1.9 大小写转换
	 */
	@Test
	public void testToUpperCaseAndToLowerCase() {
		String str = "我喜欢Java";
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}
	
	/**
	 * 2.1.10 valueOf()
	 */
	@Test
	public void testValueOf() {
		double pi = 3.1415926;
		int value = 132;
		char[] charArr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		
		String str = String.valueOf(pi);
		System.out.println(str);
		
		str = String.valueOf(value);
		System.out.println(str);
		
		str = String.valueOf(charArr);
		System.out.println(str);
		
	}
	
	
	/**
	 * 2.2 StringBuilder及其API
	 * 2.2.1 StringBuilder封装可变字符串
	 * 对象创建后，可以通过调用方法改变其封装的字符序列
	 * 常用的构造方法：
	 * public StringBuilder()
	 * public StringBuilder(str)
	 */
	
	/**
	 * 2.2.2 常用方法：
	 * StringBuilder append(str)
	 * StringBuilder insert(int dstoffset, String s)
	 * StringBuilder delete(int start, int end)
	 * StringBuilder replace(int start, int end, String str)
	 * StringBuilder reaverse()
	 */
	
	/**
	 * 2.2.3 StringBuilder
	 * 
	 */
}
