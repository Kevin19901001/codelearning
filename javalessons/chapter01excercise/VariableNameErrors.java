package chapter01excercise;

/**
 * 
 * @description Variable name errors
 * @author kevin
 * @since 2018/12/04
 *
 */
public class VariableNameErrors {

	/**
	 * 
	 * @param args
	 * @author kevin
	 * @since 2018/12/04
	 * 
	 */
	public static void main(String[] args) {
		// 1.Use variables which have not been declared:
		//a = 1;																// Syntax error, "a" has not been declared.
		int score = 0;
		//scord = 100;															// Syntax error, "scord" is not "score", it has not been declared.
		System.out.println(score);												// 0.
		
		
		// 2.Use variables which were not fit Java name rules:
		//int 123go = 100;														// Syntax error, variable could not starts with decimal.
		//int 成绩 = 60;															// Chinise is not suggested.
		//int break = 200;														// Syntax error, the key words are not allowed.
		//int score = 80;
		//System.out.println(Score);											// Systax error, Java is sensitive to uppercase and lowercase of letters.
		
		
		// 3.Use variables which have not been inited:
		//int x, y = 10;														// "x" has not been inited!
		//int z = x + y;														// Syntax error!
		//System.out.println(z);												
		//int sum;
		//int m = 20;
		//int n = 10;
		//if(m > 0){
		//	sum = 0;
		//	sum = m + n;
		//}
		//System.out.println(sum);												// Syntax error! "sum" may not have been inited.
		
		
		// 4.The value of variables were incorrect type:
		//int salary;
		//salary = 15000.50;													// Syntax error! Type mismatch!

	}

}
