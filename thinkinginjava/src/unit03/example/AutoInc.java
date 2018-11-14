package unit03.example;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/20.
 * This example is for learning auto increment and decrement.
 * @author Kevin
 * @since 2017-07-20
 */
public class AutoInc {

    public static void main(String[] ars){
        int i = 0;
        puts("i: " + i);    // 0
        puts("++i: " + ++i);    // 1
        puts("i++: " + i++);    // 1
        puts("--i: " + --i);    // 1
        puts("i--: " + i--);    // 1
        puts("i: " + i);    // 0
    }

}
