package unit04.example;

import static unit04.util.Print.put;
import static unit04.util.Print.puts;
import static unit04.util.Range.range;

/**
 * Created by Administrator on 2017/7/24.
 * This example is for learning 'foreach' loop.
 * @author Kevin
 * @since 2017-07-24
 */
public class ForEachInt {

    public static void main(String[] args){
        // This class has not completed.
        for(int i : range(10)){
            put(i + " ");
        }

        puts("");

        for(int i : range(5, 10)){
            put(i + " ");
        }

        puts("");

        for(int i : range(5, 20, 3)){
            put(i + " ");
        }
    }

}
