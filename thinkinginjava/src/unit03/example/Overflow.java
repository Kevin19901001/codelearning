package unit03.example;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/22.
 * This example is for learning data overflow.
 * @author Kevin
 * @since 2017-07-22
 */
public class Overflow {

    public static void main(String[] args){
        int big = Integer.MAX_VALUE;
        puts("big: " + big);
        /*int bigger = big * 4;
        puts("bigger: " + bigger);*/
    }

}
