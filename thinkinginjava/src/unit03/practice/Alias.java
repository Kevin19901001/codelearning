package unit03.practice;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/20.
 * This practice is practice 2, it is for testing alias in java.
 * @author Kevin
 * @since 2017-07-20
 */
public class Alias {

    public static void main(String[] args){
        Value v1 = new Value();
        Value v2 = new Value();
        v1.number = 2.356f;
        v2.number = 7.891f;

        puts("1: v1.number: " + v1.number + ", v2.number: " + v2.number);   // 2.356, 7.891

        v1 = v2;
        puts("2: v1.number: " + v1.number + ", v2.number: " + v2.number);   // 7.891, 7.891

        v1.number = 1.234f;
        puts("3: v1.number: " + v1.number + ", v2.number: " + v2.number);   // 1.234, 1.234
    }

}


