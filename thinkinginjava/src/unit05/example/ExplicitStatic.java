package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/1.
 * This example is to talk about explicit static initialization.
 * @author Kevin
 * @since 2017-08-01
 */
public class ExplicitStatic {

    public static void main(String[] args){
        puts("inside main()");
        //Cups.cup1.f(99);
    }

    // Practice 13.
    static Cups cups1 = new Cups();

}
