package chapter03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.Test;

public class Case03DateAndCollection {

	public static void main(String[] args) {
		// 1. ���ڲ���
		// 1.1 Date���䳣��API
		// 1.1.1 Java�е�ʱ��
		// Java�е�ʱ��ʹ�ñ�׼����Date���ʾ������һ������̶�ʱ���ĺ������������ɸ���long���ͣ����һ���ض���ʱ���
		
		// 1.1.2 Date����
		// java.util.Date���װ���ڼ�ʱ����Ϣ
		// Date��Ĵ��������ʱ���������ķ����Ѿ���Calendarȡ��
		Date date = new Date();
		System.out.println(date);
		
		long time = date.getTime();
		System.out.println(time);
		
		
		// 1.2 SimpleDateFormat
		// 1.2.1 SimepleDateFormat���
		// java.text.SimpleDateFormat��һ���������Ի����йصķ�ʽ����ʽ���ͽ������ڵľ����ࡣ
		// ���췽����
		// SimpleDateFormat(); SimpleDateFormat(String pattern)
		// ������
		// final String format(Date date) Date => String
		// Date parse(String source) throw ParseException String => Date
		
		
		// 1.3 Calendar
		// 1.3.1 Calendar���
		// java.util.Calendar�����ڷ�װ������Ϣ������Ҫ���������䷽�����Զ�ʱ������������㣻
		// Calendar�ǳ����࣬�����������Բ�ͬ���ҵ�����ϵͳ������Ӧ����㷺����GregorianCalendar��ͨ�õ�����������Ӧ�����Ͼ���������һ����ʹ�õı�׼����ϵͳ��
		
		
		// 2. ���Ͽ��
		// 2.1 Collection
		// ��ʵ�ʿ����У���Ҫ��ʵ�ʵĶ���洢���ض����ݽṹ�������С�JDK�ṩ������������---���ϣ�Collection��
		// Collection��һ���ӿڣ������˼�����صĲ������������������ֽӿڣ�List��Set
		// List�����ظ���
		// Set�������ظ���
		
		
		// 2.1.2 ���ϳ��ж��������
		// �����д洢�Ķ�����������Ԫ�أ����Ҽ���ֻ����ÿ��Ԫ�ض�������ã������ǽ�Ԫ�ض�������뼯�ϡ�
	}
	
	/**
	 * 1.1.3 setTime()��getTime()����
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
	 * 1.1.4 Date��дtoString()����
	 */
	@Test
	public void testDateToString() {
		// Date��д��toString()��������һ���ַ�����������ǰDate��������ʾ��ʱ��
		Date date = new Date();
		System.out.println(date.toString());
	}
	
	/**
	 * 1.2.3 ��Dateת��ΪString
	 */
	@Test
	public void testDateFormat() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
		
		Date date = new Date();
		String formatedDate = format.format(date);
		
		System.out.println(formatedDate);
	}
	
	/**
	 * 1.2.4 ��String����ΪDate
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
	 * 1.3.2 getInstance()����
	 * Calendar�ṩ��һ���෽��getInstance()���Ի�ô����͵�һ��ͨ�õĶ���
	 * Calendar��getInstance()��������һ��Calendar�����������ֶ����ɵ�ǰ���ں�ʱ���ʼ����
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
	 * 1.3.3 �������ڼ�ʱ�����
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
	 * 1.3.4 ��ȡ���ڼ�ʱ�����
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
	 * 1.3.5 getActualMaximum����
	 * int getActualMaximum(int field)������Calendar��ʱ��ֵ������ָ�������ֶο���ӵ�е����ֵ
	 */
	@Test
	public void testGetActualMaximum() {
		int year = 2020;
		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, year);
		c.set(Calendar.DATE, 1);
		
		for(int month=Calendar.JANUARY; month<=Calendar.DECEMBER; month++) {
			c.set(Calendar.MONTH, month);
			System.out.println(year + "��" + (month + 1) + "��" + c.getActualMaximum(Calendar.DATE) + "��");
		}
	}
	
	/**
	 * 1.3.6 add����
	 * void add(int field, int mount)Ϊ������ʱ�������ֵ���ϸ�����ֵ����������ֵΪ���������Ǽ�ȥ������ֵ
	 * ���1����ټ�ȥ3���µ�����
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
	 * 1.3.7 setTime��getTime����
	 * Date getTime():ʹ��Date����Calendar��ʾ���ڲ�����
	 * void setTime(Date d):ʹ��Calendar��ʾDate������������
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
	 * 2.1.3 add����
	 */

}
