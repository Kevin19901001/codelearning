package unit03.example;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/22.
 * This example is for learning casting number rounding.
 * @author Kevin
 * @since 2017-07-22
 */
public class RoundingNumbers {

    public static void main(String[] args){
        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        puts("Math.round(above): " + Math.round(above));
        puts("Math.round(fabove): " + Math.round(fabove));
        puts("Math.round(below): " + Math.round(below));
        puts("Math.round(fbelow): " + Math.round(fbelow));
    }

}
