package unit04.example;

import static unit04.util.Print.puts;

/**
 * Created by Administrator on 2017/7/22.
 * This example is for learning procedure control.
 * @author Kevin
 * @since 2017-07-22
 */
public class IfElese {

    static int result = 0;

    static void test(int testVal, int target){
        if(testVal > target){
            result = +1;
        } else if(testVal < target){
            result = -1;
        }else {
            result = 0;
        }
    }

    public static void main(String[] args){
        test(10, 5);
        puts(result);
        test(5, 10);
        puts(result);
        test(5, 5);
        puts(result);
    }

}
