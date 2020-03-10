package chapter03;

import java.util.Arrays;

import org.junit.Test;

public class Case02RegExpAndWrapperClass {

	public static void main(String[] args) {
		// 1. 正则表达式
		// 1.1 基本正则表达式
		// 1.1.1 正则表达式简介：
		// “[a-z]”表示'a'到'z'的任意一个字符；
		// “[a-z]+”表示由1个或多个a-z字符组成的字符串；
		// “[abc]”表示abc中任意一个字符；
		// “{^abc}”表示出abc之外的任意字符；
		// “[a-zA-Z0-9]”表示a~z、A~Z、0～9中任意一个字符；
		//  “[a-z&&[^bc]]”表示a~z中除了bc外的任意一个字符；
		// “.”表示任意一个字符；
		// “\d”任意一个数字字符，相当于[0-9]；
		//  “\w”单词字符，相当于[a-zA-Z0-9_]；
		// “\s”表示空白字符，相当于：[\t\n\x0B\f\r]
		// “\D”表示非数字字符；
		// “\W”表示非单词字符；
		// “\S”表示非空白字符；
		// “X?”表示0个或1个X；
		// “X*”表示0个或多个X；
		// “X+”表示1个或多个X；
		// “X{n}”表示n个X；
		// “X{n, }”表示n到任意多个X；
		// “X{n, m}”表示n到m个X
		// 检索邮政编码：\d{6}
		
		// 1.1.2 分组()：()表示分组，可以将一系列正则表达式看作是一个整体，分组时可以使用“|”表示“或”关系。
		// 匹配手机号码前面的区号：(+86|0086)?\s?\d{11}

		// 1.1.3 ^和$：
		// ^代表字符串开始
		// $代表字符串结尾
		// 匹配用户名规则-从头到尾连续8~10个单词字符：
		System.out.println("abcd1234_abcd".matches("^\\w{8,10}$"));		// true
		System.out.println("abcd1234_abcd".matches("\\w{8,10}"));			// false
		
		
		// 2. Object
		// 2.1 Object
		// 2.1.1 Object：在Java类继承结构中，java.lang.Object类位于顶端。如果定义一个Java类时，没有使用extends关键字声明其父类，则其父类默认为java.lang.Object类。
		// Object类型的引用变量可以指向任何类型的对象。
		
		// 2.2 toString()方法
		// 2.2.1 如何重写toString()方法：Object类中的重要方法，用来表示对象值的字符串表示；原则上建议重写，格式大多数遵循“类的名字[域值]”
		
		// 2.2.2 String重写toString()方法：
		// public String toString() {
		//	 return this;
		// }
		// Java语言中很多地方会默认调用对象的toString()方法：1、字符串+对象，自动调用对象的toString()方法；2、System.out.println(对象)，自动调用对象的toString()方法
		// 如果不重写toString()方法，将使用Object的toString()方法，其逻辑为类名+散列码。
		// toString()方法是非常有用的调试工具；
		// 强烈建议为自定义的所有类添加toString()方法。
		
		// String的toString()方法，就是将其自身返回：
		// public String toString() {
		// 	return this;
		// }
		
	}
	
	/**
	 * 1.2 String正则API：
	 * 1.2.1 match(String regexp)方法
	 */
	@Test
	public void email() {
		String emailRegexp = "^[a-zA-Z0-9_.-]+@([a-zA-Z0-9-]+\\.)+[a-zA-Z0-9] {2,4}$";
		String email = "abc@souhu.com.cn";
		System.out.println(email.matches(emailRegexp));								// true
	}
	
	/**
	 * 1.2.2 String[] split(String regexp)方法
	 */
	@Test
	public void testSplit() {
		// 按空格拆分
		String langs = "java cpp php c# objective-c";
		String[] langsArr = langs.split("\\s");
		System.out.println(Arrays.toString(langsArr));
		
		// 按"+"、"-"、"="拆分
		String line = "100+200-150-150";
		String[] arr = line.split("[\\+\\-=]");
		System.out.println(Arrays.toString(arr));
	}
	
	/**
	 * 1.2.3 String replaceAll(String regexp, String replacement)方法
	 */
	@Test
	public void testReplaceAll() {
		String words = "abc123def456ghi89";
		String newWords = words.replaceAll("\\d+", "数字");
		System.out.println(newWords);
	}
}
