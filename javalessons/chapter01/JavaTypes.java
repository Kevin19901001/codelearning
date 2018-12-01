package chapter01;

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
        @SuppressWarnings("unused")
		int a = 100;											// Decimal.
        @SuppressWarnings("unused")
		int b = 0x186a0;										// Hex.
        @SuppressWarnings("unused")
		int c = 0303240;										// Octal.
        //int d = 10000000000;									// Syntax error! Too big Integer!

        // Division operation of integer type returns integer:
        int e = 5/3;
        System.out.println(e);									// 1.

        int total = 87;
        int error = 23;
        int percent = error/total * 100;
        System.out.println(percent + "%");						// 0%.
    
        percent = 100 * error/total;
        System.out.println(percent + "%");						// 26%.

        // Avoid verflowing when operating:
        int f = 2147483647;
        int g = -2147483648;
        f = f + 1;
        g = g - 1;
        System.out.println("f = " + f);							// f = -2147483648
        System.out.println("g = " + g);							// g = 2147483647


        // Long type:
        // Long as literal, add 'l' in the end:
        //long h = 10000000000;									// Syntax error
        @SuppressWarnings("unused")
		long i = 10000000000l;		

        long distance1 = 10000 * 365 * 24 * 60 * 299792458l;
        System.out.println("distance1 = " + distance1);
        long distance2 = 10000 * 365 * 24 * 60 * 299792458;
        System.out.println("distance2 = " + distance2);			// Overflow.

        // Use time millis to store date and time:
        long time = System.currentTimeMillis();
        System.out.println(time);								// 1543584137195


        // Double type:
        double money = 3.0;
        double price = 2.9;
        System.out.println(money - price);						// 0.10000000000000009, double oprator would occur round-off error.

        @SuppressWarnings("unused")
		double pi = 3.14;
        //float f1 = 3.14;										// Syntax error! Double to float might have precision lose.
        

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
        int age = 18;
        boolean isChild = age < 16;
        System.out.println(isChild);
        @SuppressWarnings("unused")
		boolean running = true;
        @SuppressWarnings("unused")
		boolean closed = false;


        // Type convertion:
        int j = 100;
        int k = 200;
        @SuppressWarnings("unused")
		long l = j + k;											// Convert int to lng automatically.
        long l1 = 2014l;
        @SuppressWarnings("unused")
		int l2 = (int)l1;
        long l3 = 1024L * 1024 * 1024 * 4;
        int j2 = (int)l3;										// Overflow.
        System.out.println(j2);									// 0
        
        double dpi = 3.1415926535897932384;
        float fl = (float)dpi;									// This operation will cause the precision lose!
        System.out.println(fl);									// 3.1415927


        // Auto oonvertion when data operating:
        long longDistance = 10000 * 365 * 24 * 60 * 60 * 299792458l;	// Bebause of long type literal, the result is long type.
        System.out.println(longDistance);
        double change = 800 - 599.0;
        System.out.println(change);
        
        double percent1 = 80/100;
        System.out.println(percent1);							// 0.0.
        
        double percent2 = 80.0/100;								
        System.out.println(percent2);							// 0.8.
        
        
        // Type byte, char, short convert into int:
        // Literal of int can be valued to byte, chat and short.
        // In operation, byte, char, short will be conveted int int first.
    }
}

