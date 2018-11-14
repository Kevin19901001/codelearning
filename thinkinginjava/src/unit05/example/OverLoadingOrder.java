package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/7/27.
 * this example is to talk about method overload
 * @author Kevin
 * @since 2017-07-27
 */
public class OverLoadingOrder {

    static void f(String s, int i){
        puts("String: " + s + " int: " + i);
    }

    static void f(int i, String s){
        puts("int : " + i + " String: " + s);
    }

    public static void main(String[] args){
        f("String first: ", 99);
        f(99, "int first");
    }

}
