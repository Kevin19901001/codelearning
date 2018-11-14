package unit05.example;

import java.util.Arrays;
import java.util.Random;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/2.
 * This example is to talk about array of classes.
 * @author Kevin
 * @since 2017-08-02
 */
public class ArrayClassObject {

    public static void main(String[] args){
        Random rand = new Random(47);
        Integer[] a = new Integer[rand.nextInt(20)];
        puts("length of a: " + a.length);
        puts(Arrays.toString(a));
        for(int i = 0; i < a.length; i++){
            a[i] = rand.nextInt(200);
        }
        puts(Arrays.toString(a));
    }

}
