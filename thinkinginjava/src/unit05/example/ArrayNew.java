package unit05.example;

import java.util.Arrays;
import java.util.Random;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/2.
 * This example is to talk about using 'new' to init array.
 * @author Kevin
 * @since 2017-08-02
 */
public class ArrayNew {

    public static void main(String[] args){
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        puts("length of a: " + a.length);
        puts(Arrays.toString(a));
    }

}
