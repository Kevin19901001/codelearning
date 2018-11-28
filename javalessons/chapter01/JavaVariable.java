// Java variable:
public class JavaVariable {
    // What is variable:
    int a = 5;
    int b = 6;
    int c = a + b;

    // Variable declaration:
    public static void main(String[] args){
        //d = 1;                          // Syntax error, an undeclared variable can not be used!
        int score = 100;
        //scord = 100;                    // Syntax error, scord has not been declared!
        System.out.println(score);
        
        int e = 1, f = 2;	          // Declare two variables 1 and 2.
        int g,h = 3;
        System.out.println("e: " + e);    // e: 1.
        System.out.println("f: " + f);    // f: 2.
        //System.out.println("g: " + g);  // Syntax error, g has not been declared!
        System.out.println("h: " + h);    // h: 3.


        // Variable initialization:
        int x, y = 10;                    // This declaration just inited 'y', but 'x' has not been
        //int z = x + y;	  	  // Syntax error!
        
        int sum = 0;
        int m = 5;
        int n = 6;
        sum = m + n;
        System.out.println("sum : " + sum);	// sum : 11.
    }


    // Access variable:

}
