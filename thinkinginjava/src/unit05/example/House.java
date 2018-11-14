package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/7/31.
 * This example is to talk about constructor initialization.
 * @author Kevin
 * @since 2017-07-31
 */
public class House {

    // Before constructor
    Window w1 = new Window(1);

    House(){
        // Show that we are in the constructor.
        puts("House()");
        w3 = new Window(33);
    }

    Window w2 = new Window(2);

    void f(){
        puts("f()");
    }

    Window w3 = new Window(3);

}
