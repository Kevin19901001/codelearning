package unit05.example;

import java.util.Arrays;

/**
 * Created by Administrator on 2017/8/2.
 * This example is to talk about Array init.
 * @author Kevin
 * @since 2017-08-02
 */
public class ArrayInit {

    public static void main(String[] args){
        Integer[] a = {new Integer(1), new Integer(2), 3,};
        Integer[] b = {new Integer(1), 2, new Integer(3)};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }

}
