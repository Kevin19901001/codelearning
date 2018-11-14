package unit04.practice;

import static unit04.util.Print.puts;

/**
 * Created by Administrator on 2017/7/25.
 * this practice is practice 6
 * @author Kevin
 * @since 2017-07-25
 */
public class IfElseTest {

    static String test(int testval, int begin, int end){
        if(testval >= begin && testval <= end)
            return "between";
        return "not between";
    }

    public static void main(String[] args){
        puts(test(10, 5, 15));
        puts(test(80, 100, 120));
    }

}
