package chapter01excercise;

/**
 *
 * @description Type convertion
 * @author kevin
 * @since 2018/12/10
 *
 */

public class TypeConvertion{

    /**
     *
     * @author kevin
     * @para args
     * @since 2018/12/10
     *
     */
    public static void main(String[] args){

        // 1.Precision lose and overflow:
        long l = 1024L * 1024 * 1024 * 4;
        int j = (int) l;                       // Overflow.
        System.out.println(j);                 // 0.

        double pi = 3.141592653589793;
        float f = (float)pi;                   // Precision lose.
        System.out.println(f);                 // 3.1415927.

        long distance = 10000 * 365 * 24 * 60 * 299792458L;    // Integer into Long automatically.
        double change = 800 - 599.0;           // Integer into Double automatically.
        double present1 = 80 / 100;
        double present2 = 80.0 / 100;
        System.out.println(present1);          // 0.0.
        System.out.println(present2);          // 0.8.

        byte b1 = 28;
        byte b2 = 20;
        // byte b3 = b1 + b2;                  // Systax error! (b1 + b2) is type of Integer.
        // System.out.println(b3);

        byte b4 = 28;
        byte b5 = 20;
        int b6 = b4 + b5;
        System.out.println(b6);
    }

}
