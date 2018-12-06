package chapter01excercise;

/**
 * 
 * @description
 * @author kevin
 * @since 2018/12/06
 * 
 */
public class IntegerTypeErrors {

	/**
	 * 
	 * since 2018/12/06
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// Int literal overflow:
		// int d = 10000000000;						// The literal 10000000000 of type int is out of range.
		
		// Decimal devision:
		int c = 5/3;
		System.out.println(c);						// 1.
		
		// Decimal operation overflow:
		int a = 2147483647;
		int b = -2147483648;
		a = a + 1;
		System.out.println(a);						// -2147483648.
		b = b - 1;
		System.out.println(b);						// 2147483647.
		
		
		// Long literal ends with "L" or "l":
		// long l1 = 10000000000;					// Syntax error!
		// long l2 = 10000000000L;
	}

}
