package unit03.example;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/21.
 * This example is for learning ternary operator.
 * @author Kevin
 * @since 2017-07-21
 */
public class TernaryIfElse {

    static int ternary(int i){
        return i < 10 ? i * 100 : i * 10;
    }

    static int ifElse(int i){
        if(i < 10){
            return i * 100;
        } else {
            return i * 10;
        }
    }

    public static void main(String[] args){
        puts(ternary(9));
        puts(ternary(10));
        puts(ifElse(9));
        puts(ifElse(10));
    }

}
