package unit03.example;

import java.util.Random;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/21.
 * This example is for learning logic operators.
 * @author Kevin
 * @since 2017-07-21
 */
public class Bool {

    public static void main(String[] args){
        Random rand = new Random();
        int i = rand.nextInt(100);
        int j = rand.nextInt(100);
        puts("i = " + i);
        puts("j = " + j);
        puts("i > j is " + (i > j));
        puts("i < j is " + (i < j));
        puts("i >= j is " + (i >= j));
        puts("i <= j is " + (i <= j));
        puts("i == j is " + (i == j));
        puts("i != j is " + (i != j));
        puts("(i < 10) && (j < 10) is " + ((i < 10) && (j < 10)));
        puts("(i > 10) || (j > 10) is " + ((i > 10) || (j > 10)));
    }

}
