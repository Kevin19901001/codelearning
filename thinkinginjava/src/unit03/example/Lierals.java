package unit03.example;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/21.
 * This example is for learning literals.
 * @author Kevin
 * @since 2017-07-21
 */
public class Lierals {

    public static void main(String[] args){
        int i1 = 0x2f;
        puts("i1: " + Integer.toBinaryString(i1));

        int i2 = 0X2F;
        puts("i2: " + Integer.toBinaryString(i2));

        int i3 = 0177;
        puts("i3: " + Integer.toBinaryString(i3));

        char c = 0xffff;
        puts("c: " + Integer.toBinaryString(c));

        byte b = 0x7f;
        puts("b: " + Integer.toBinaryString(b));

        short s = 0x7fff;
        puts("s: " + Integer.toBinaryString(s));

        long n1 = 200L;
        long n2 = 200l;
        long n3 = 200;

        float f1 = 1;
        float f2 = 1F;
        float f3 = 1f;

        double d1 = 1d;
        double d2 = 1D;
    }

}