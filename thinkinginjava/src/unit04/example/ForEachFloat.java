package unit04.example;

import java.util.Random;

/**
 * Created by Administrator on 2017/7/24.
 * This example is for learning 'foreach' loop.
 * @author Kevin
 * @since 2017-07-24
 */
public class ForEachFloat {

    public static void main(String[] args){
        Random rand = new Random();
        float f[] = new float[10];
        for(int i = 0; i < 10; i++){
            f[i] = rand.nextFloat();
        }
        for(float x : f){
            System.out.println(x);
        }
    }

}
