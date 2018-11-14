package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/1.
 * This example is to talk about instance initialization.
 * @author Kevin
 * @since 2017-08-01
 */
public class InstanceInitialization {

    Mug mug1;
    Mug mug2;

    {
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        puts("mug1 and mug2 initialized");
    }

    InstanceInitialization(){
        puts("InstanceInitialization()");
    }

    InstanceInitialization(int i){
        puts("InstanceInitialization(int)");
    }

    public static void main(String[] args){
        puts("Inside main()");
        new InstanceInitialization();
        puts("new InstanceInitialization() completed");
        new InstanceInitialization(1);
        puts("new InstanceInitialization(1) completed");
    }

}
