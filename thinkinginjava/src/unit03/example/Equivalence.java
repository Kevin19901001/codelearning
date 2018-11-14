package unit03.example;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/20.
 * This example is to test equivalence between objects.
 * @author Kevin
 * @since 2017-07-20
 */
public class Equivalence {

    public static void main(String[] args) {

        Integer in1 = new Integer(47);
        Integer in2 = new Integer(47);
        puts(in1 == in2);   // false
        puts(in1 != in2);   // true

        in2 = in1;
        puts(in1 == in2);   // true
    }

}
