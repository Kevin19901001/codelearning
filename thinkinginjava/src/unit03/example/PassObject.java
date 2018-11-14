package unit03.example;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/20.
 * This example is for alias in method calling.
 * @author Kevin
 * @since 2017-07-20
 */
public class PassObject {

    static void f(Letter y){
        y.c = 'z';
    }

    public static void main(String[] args){
        Letter x = new Letter();
        x.c = 'a';
        puts("1: x.c: " + x.c); // 'a'
        f(x);
        puts("2: x.c: " + x.c); // 'z'
    }

}

