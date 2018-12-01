/**
 * 
 * @decription Java types
 * @author kevin
 * @since 2018/11/25
 * 
 */
public class JavaTypes {

    // Decimal : byte short int long    
    // Float   : float  double
    // Char    : char
    // Boolean : boolean

    public static void main(String[] args){
        // int type:
        // (-2^21) ~ (2^31-1)
        int a = 100;										// Decimal.
        int b = 0x186a0;									// Hex.
        int c = 0303240;									// Octal.
        //int d = 10000000000;									// Syntax error! Too big Integer!

        // Division operation of integer type returns integer:
        int e = 5/3;
        System.out.println(e);									// 1.

        int total = 87;
        int error = 23;
        int percent = error/total * 100;
        System.out.println(percent + "%");							// 0%.
    
        percent = 100 * error/total;
        System.out.println(percent + "%");							// 26%.

        // Avoid verflowing when operating:
        int f = 2147483647;
        int g = -2147483648;
        f = f + 1;
        g = g - 1;
        System.out.println("f = " + f);								// f = -2147483648
        System.out.println("g = " + g);								// g = 2147483647


        // Long type:
        // Long as literal, add 'l' in the end:
        //long h = 10000000000;									// Syntax error
        long i = 10000000000l;		

        long distance1 = 10000 * 365 * 24 * 60 * 299792458l;
        System.out.println("distance1 = " + distance1);
        long distance2 = 10000 * 365 * 24 * 60 * 299792458;
        System.out.println("distance2 = " + distance2);						// Overflow.

        // Use time millis to store date and time:
        long time = System.currentTimeMillis();
        System.out.println(time);								// 1543584137195


        // Double type:
        double money = 3.0;
        double price = 2.9;
        System.out.println(money - price);							// 0.10000000000000009, double oprator would occur round-off error.

        double pi = 3.14;
        //float f1 = 3.14;									// Syntax error! Double to float might have precision lose.
        

        // Char type:
        char c1 = 'C';
        char c2 = '\u4e2d';
        System.out.println(c1);									// C.
        System.out.println(c2);									// 中

        char c3 = 65;
        char c4 = 'A';
        char c5 = '\u0041';
        char c6 = '\\';
        char c7 = '\'';
        System.out.println(c3);									// A.
        System.out.println(c4);									// A.
        System.out.println(c5);									// A.
        System.out.println(c6);									// \.
        System.out.println(c7);									// '


        // Boolean type:
    }
}
