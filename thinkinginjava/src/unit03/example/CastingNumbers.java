package unit03.example;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/22.
 * This example is for learning number casting.
 * @author Kevin
 * @since 2017-07-22
 */
public class CastingNumbers {

    public static void main(String[] args){

        double above = 0.7, below = 0.4;
        float fabove = 0.7f, fbelow = 0.4f;
        puts("(int)above: " + (int)above);
        puts("(int)fabove: " + (int)fabove);
        puts("(int)below: " + (int)below);
        puts("(int)fbelow: " + (int)fbelow);
    }

}
