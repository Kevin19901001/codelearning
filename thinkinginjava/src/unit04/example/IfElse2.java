package unit04.example;

import static unit04.util.Print.puts;

/**
 * Created by Administrator on 2017/7/25.
 * this example is for learning return
 * @author Kevin
 * @since 2017-07-25
 */
public class IfElse2 {

    static int test(int testval1, int testval2){
        if(testval1 > testval2)
            return +1;
        else if(testval1 < testval2)
            return -1;
            return 0;
    }

    public static void main(String[] args){
        puts(test(10, 5));
        puts(test(5, 10));
        puts(test(5, 5));
    }

}
