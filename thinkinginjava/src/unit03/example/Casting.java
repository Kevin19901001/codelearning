package unit03.example;

/**
 * Created by Administrator on 2017/7/22.
 * This example is for learning type casting.
 * @author Kevin
 * @since 2017-07-22
 */
public class Casting {

    public static void main(String[] args){
        int i = 200;
        long lng = (long)i;
        lng = i;
        long lng2 = (long)200;
        lng2 = 200;
        i = (int)lng2;
    }

}
