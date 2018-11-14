package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/1.
 * This example is to test explicit static initialization.
 * @author Kevin
 * @since 2017-08-01
 */
public class Cup {

    Cup(int marker){
        puts("Cup(" + marker + ")");
    }

    void f(int marker){
        puts("f(" + marker + ")");
    }

}
