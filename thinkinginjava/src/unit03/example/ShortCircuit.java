package unit03.example;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/21.
 * This example is for learning short circuit.
 * Demonstrates short-circuit behavior with
 * logic operators.
 * @author Kevin
 * @since 2017-07-21
 */
public class ShortCircuit {

    static boolean test1(int val){
        puts("test1(" + val + ")");
        puts("result: " + (val < 1));
        return val < 1;
    }

    static boolean test2(int val){
        puts("test2(" + val + ")");
        puts("result: " + (val < 2));
        return val< 2;
    }

    static boolean test3(int val){
        puts("test1(" + val + ")");
        puts("result: " + (val < 3));
        return val < 3;
    }

    public static void main(String[] args){
        boolean b = test1(1) && test2(2) && test3(2);
        puts("expression is " + b);
    }

}
