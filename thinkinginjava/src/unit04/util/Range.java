package unit04.util;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 2017/7/24.
 * This class is for generating an array.
 * @author Kevin
 * @since 2017-07-24
 */
public class Range {

    public static int[] range(int x){
        int[] arr = new int[x];
        for(int i = 0; i < x; i++){
            arr[i]  = i;
        }
        return arr;
    }

    public static int[] range(int x, int y){
        int[] arr = new int[y - x];
        for(int i = x; i < y; i++){
            arr[i - x] = i;
        }
        return arr;
    }

    public static int[] range(int x, int y, int z){
        // This class has not completed.
        int[] arr = new int[y/z - x/z];
        arr[0] = x;
        for(int i = 1; i < arr.length; i++){
            x += z;
            arr[i] = x;
        }
        return arr;
    }

}
