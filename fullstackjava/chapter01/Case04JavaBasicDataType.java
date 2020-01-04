package chapter01;

public class Case04JavaBasicDataType {

	public static void main(String[] args) {
		
		// There are 8 kinds of data type in java:
		
		// int: -2^31 ~ 2^31
		int a = 100000;
		int b = 0x168a0;
		int c = 0303240;
		System.out.println(a + b + c);
		
		int i = 5/3;
		System.out.println(i);
		
		int total = 87;
		int error = 23;
		int percent = error/total*100;
		System.out.println(percent);
		
		percent = 100*error/total;
		System.out.println(percent + "%");
		
		// long:-2^63 ~ 2^63-1
		long l2 = 10000000000l;
		
		long distance1 = 10000 * 365 * 24 * 60 * 60;
		System.out.println("distance1: " + distance1);
		System.out.println(distance1 + l2);
		
		long time = System.currentTimeMillis();
		System.out.println(time);
		
		//double:
		double pi = 3.14;
		double r = 8;
		double s = pi * r * r;
		System.out.println(s);
		
		double money = 3.0;
		double price = 2.9;
		System.out.println(money - price);				// 0.10000000000000009
	}

}
