package unit02.example;

import org.junit.Test;

/**
 * Created by Administrator on 2017/7/17.
 * Use quotation to operate object.
 */
public class Case01 {

    @Test
    public void test() {

        String s;
        // Error! 's' is just an quotation, not an object.
        // System.out.println(s.length());

        String t = "asdf";
        /* Use quotation, we can operate object easyly. */
        System.out.println(t.length());

    }

}
