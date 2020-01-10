package chapter01;

public class Case05OperatorAndExpression {
	
	public static void main(String[] args) {
		// %:
		int n = 225;
		System.out.println(n%8);							// 1
		
		// ++ and --:
		int aa = 10, bb = 20;
		int cc1 = aa++;
		int cc2 = ++bb;
		System.out.println("aa:" + aa + " bb:" + bb + " cc1:" + cc1 + " cc2:" + cc2);	// aa:11 bb:21 cc1:10 cc2:21
	}

}
