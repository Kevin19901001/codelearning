package unit03.example;

import java.util.Random;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/20.
 * This examples is for Math operators learning.
 * @author Kevin
 * @since 2017-07-20
 */
public class MathOps {

    public static void main(String[] args){
        // Create a seeded random number generator:
        Random rand = new Random(28);
        int i, j, k;
        // Choose value from 1 to 100:
        j = rand.nextInt(100) + 1;
        puts("j: " + j);
        k = rand.nextInt(100) + 1;
        puts("k: " + k);
        i = j + k;
        puts("j + k: " + i);
        i = j - k;
        puts("j - k: " + i);
        i = k / j;
        puts("k / j: " + i);
        i = k * j;
        puts("k * j: " + i);
        i = k % j;
        puts("k % j: " + i);
        j %= k;
        puts("j %= k: " + j);

        // Floating-point number test:
        float u, v, w;
        v = rand.nextFloat();
        puts("v: " + v);
        w = rand.nextFloat();
        puts("w: " + w);
        u = v + w;
        puts("v + w: " + u);
        u = v - w;
        puts("v - w: " + u);
        u = v * w;
        puts("v * w: " + u);
        u = v / w;
        puts("v / w: " + u);

        // The following also works for char, byte, long, short, int and double:
        u += v;
        puts("u += v: " + u);
        u -= v;
        puts("u -= v: " + u);
        u *= v;
        puts("u *= v: " + u);
        u /= v;
        puts("u /= v: " + u);
    }

}