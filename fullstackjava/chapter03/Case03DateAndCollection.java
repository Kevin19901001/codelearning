package chapter03;

import java.util.Date;

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
		
	}

}
