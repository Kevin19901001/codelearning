package unit02.example;

import org.junit.Test;

/**
 * Created by Administrator on 2017/7/18.
 * Test static.
 */
public class Case04 {

    static int i = 47;

    public static void increment(){
        Case04.i++;
    }

    @Test
    public void testStatic(){
        Case04 c1 = new Case04();
        Case04 c2 = new Case04();
        System.out.println(c1.i);
        System.out.println(c2.i);
        System.out.println(Case04.i);

        // Test static method.
        Case04 c3 = new Case04();
        // Use object to call the static method.
        c3.increment();
        System.out.println(Case04.i);
        // Use className to call the static method.
        Case04.increment();
        System.out.println(Case04.i);
    }

}
