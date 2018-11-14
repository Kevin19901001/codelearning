package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/1.
 * This example is to test explicit static initialization.
 * @author Kevin
 * @since 2017-08-01
 */
public class Cups {

    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }

    Cups(){
        puts("Cups");
    }

}
