package unit04.practice;

import static unit04.util.Print.put;

/**
 * Created by Administrator on 2017/7/26.
 * this practice is practice 9
 * @author Kevin
 * @since 2017-07-21
 */
public class Fibonacci {

    public static int[] fibonacci(int x){
        int[] arr = new int[x];
        arr[0] = 1;
        arr[1] = 1;
        for(int j = 2; j < arr.length; j++){
            arr[j] = arr[j - 1] + arr[j - 2];
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = fibonacci(12);
        put(arr.length + " ");
        for(int i : arr){
            put(i + " ");
        }
    }

}
