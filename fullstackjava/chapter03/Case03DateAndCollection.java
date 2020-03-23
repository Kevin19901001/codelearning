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

}
