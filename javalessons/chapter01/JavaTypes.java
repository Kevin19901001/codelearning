public class JavaTypes {
//		    Java basic data type
//			        |
//			        |
//    	  Integer            Float        char        boolean
//            |		        |
//            |		        |
//  byte short int long    float  double

    public static void main(String[] args){
        // int type:
        // (-2^21) ~ (2^31-1)
        int a = 100;		// Decimal.
        int b = 0x186a0;		// Hex.
        int c = 0303240;		// Octal.
        //int d = 10000000000;	// Syntax error! Too big Integer!


        int e = 5/3;
        System.out.println(e);	// 1.

        int total = 87;
        int error = 23;
        int percent = error/total * 100;
        System.out.println(percent + "%");		// 0%.
    
        percent = 100 * error/total;
        System.out.println(percent + "%");		// 26%.		
    }
}
