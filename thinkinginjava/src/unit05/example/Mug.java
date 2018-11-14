package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/1.
 * This example is to test instance initialization.
 * @author Kevin
 * @since 2017-08-01
 */
public class Mug {

    Mug(int marker){
        puts("Mug(" + marker + ")");
    }

    void f(int marker){
        puts("f(" + marker + ")");
    }

}
