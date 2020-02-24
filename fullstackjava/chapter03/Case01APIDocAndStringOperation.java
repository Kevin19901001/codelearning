package chapter03;

import org.junit.Test;

/**
 * Java API�ĵ����ַ�����������
 * @author HuanQing
 * @since 2020-02-23
 */
public class Case01APIDocAndStringOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 1.1 JDK API
		 * 1.1.1 ʲô��JDK API��JDK�а���������API��⣬JDK�а�������⹦��ǿ�󣬾���ʹ�õ��У�
		 * �ַ������������ϲ������ļ��������������������������������̵߳ȵȡ�
		 * 1.1.2 JDK���ṹ��java.lang, java.util, java.io, java.net, java.math, java.security, java.sql, java.text...
		 */
		
		
		/**
		 * 1.2 �ĵ�ע�͹淶��
		 * 1.2.1 �ĵ�ע��
		 * 1.2.2 �ĵ�ע�͹淶
		 * 1.2.3 javadoc���������ĵ�
		 */
		
		
		/**
		 * 2.1 String���䳣��API��
		 * 2.1.1 String�ǲ��ɱ����Stringʹ����final���Σ����ɱ��̳У�
		 * �ַ����ײ��װ���ַ����鼰����ַ�����Ĳ����㷨��
		 * �ַ���һ��������������Զ�޷��ı䣬���ַ������ÿ������¸�ֵ��
		 * Java�ַ������ڴ��в���Unicode���뷽ʽ���κ�һ���ַ���Ӧ�����ֽڵĶ������롣
		 */
		
		
		/**
		 * 2.1.2 String�����أ�
		 * JavaΪ��������ܣ���̬�ַ��������������������������ӵĽ�����ڳ������д�����������ʹ��ͬһ���������þ�̬�ַ�����
		 */
	}
	
	/**
	 * 2.1.2 ����String������
	 */
	@Test
	public void testConstantPool() {
		String str1 = "Hello";
		
		// ���ᴴ���µĶ��󣬶��Ǵ��������������е�"Hello":
		String str2 = "Hello";
		System.out.println(str1 == str2);		// true
		
		// ʹ��new�ؼ��ֻᴴ���µ�String����
		String str3 = new String("Hello");
		System.out.println(str1 == str3);		// false
	}
	
	/**
	 * 2.1.3 �ڴ���뼰����
	 * String���ڴ��в���unicode���룬ÿ���ַ�ռ��2���ֽڣ��κ�һ���ַ����������Ļ���Ӣ�ģ�������һ���ַ����ȣ�ռ�������ֽڡ�
	 */
	@Test
	public void testLength() {
		String str1 = "Hello";
		System.out.println(str1.length());		// 5
		
		String str2 = "��ã�String!";
		System.out.println(str2.length());		// 10
	}
	
	/**
	 * 2.1.4 ʹ��indexOf()����ʵ�ּ���
	 * indexOf�����������ַ����м�����һ���ַ���
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
	 * 2.1.5 ʹ��substring��ȡ�Ӵ�
	 */
	@Test
	public void testSubstring() {
		String str = "http://www.oracle.com";
		String subString = str.substring(11, 17);
		System.out.println(subString);			// oracle
		
		subString = str.substring(7);
		System.out.println(subString);			// www.oracle.com
	}
}
