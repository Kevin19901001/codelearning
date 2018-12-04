package chapter01;

/**
 * 
 * @description Operator and expression
 * @author kevin
 * @since 2018/12/01
 * 
 */
public class OperatorAndExpression {

	/**
	 * @author kevin
	 * @param args
	 * @since 2018/12/01
	 */
	public static void main(String[] args) {
		// Arithmetic operation:
		// Include "+", "-", "*", "/", "%", "++".
		// '%' operation:
		int n = 255;
		System.out.println(n % 8);															// 7.
		
		// "++" and "--" operation:
		int a = 10, b = 20;
		int c1 = a++;
		int c2 = ++b;
		System.out.println("a = " + a + ", b = " + b + ", c1 = " + c1 + ", c2 = " + c2);	// a = 11, b = 21, c1 = 10, c2 = 21.
		
		
		// Relation operation:
		// Include ">", "<", ">=", "<=", "==", "!=".
		int max = 10;
		int num = 9;
		boolean b1 = max > 15;
		boolean b2 = num % 2 == 1;
		System.out.println(b1);																// false.
		System.out.println(b2);																// true.
		
		
		// LOgic opersation:
		// Include "&&", "||", "!".
		// "&&":
		int score = 80;
		boolean eligibility = score >= 60 && score < 90;
		System.out.println(eligibility);													// true.
		
		// Use "||" operator:
		boolean flag = true;
		int number = 200;
		boolean bool = flag || (number >= 0 && number < 100);
		System.out.println(bool);															// true.
		
		// Use "!" operator:
		boolean flag1 = true;
		int number1 = 200;
		boolean bool1 = !flag1 || (number1 >= 0 && number1 < 100);
		System.out.println(bool1);															// flase.

                // Logic short:
		int number3 = 100;
		int number4 = 200;
		boolean logicShort1 = (number3 > number4) && (number3++ > 100);
		System.out.println(logicShort1);													// false.
		System.out.println(number3);														// 100. Because "number3++" would not be executed.
		
		boolean logicShort2 = number3 > 0 || number4++ > 200;
		System.out.println(logicShort2);													// true.
		System.out.println(number4);														// 200. Because "number4++" would not be executed.
	}

}
