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
	}

}
