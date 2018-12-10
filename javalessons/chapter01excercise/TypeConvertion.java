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

    }

}
