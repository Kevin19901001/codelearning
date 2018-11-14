package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/2.
 * This example is to talk about array initialization.
 * @author Kevin
 * @since 2017-08-02
 */
public class ArrayOfPrimitives {

    public static void main(String[] args){
        int[] a1 = {1, 2, 3, 4, 5};
        int[] a2;
        a2 = a1;
        for(int i= 0; i < a2.length; i++){
            a2[i] = a2[i] + 1;
        }
        for(int i = 0; i < a1.length; i++){
            puts("a1[" + i + "] = " + a1[i]);
        }
    }

}
