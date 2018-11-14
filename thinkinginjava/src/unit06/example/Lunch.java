package unit06.example;

/**
 * This example is to talk ahout creating object
 * in static method by private constructor.
 * @author Kevin
 * @since 2017-08-07
 */
public class Lunch {

    void testPrivate(){
        // private constructor, can not create an object here;
        // Soup1 soup = new Soup1();
    }


    void testStatic(){
        Soup1 soup = Soup1.makeSoup();
    }


    void testSingleton(){
        Soup2.access().f();
    }

}

class Soup1 {

    private Soup1(){

    }


    public static Soup1 makeSoup(){
        return new Soup1();
    }

}

class Soup2 {

    private static Soup2 ps1 = new Soup2();

    private Soup2(){

    }


    public static Soup2 access(){
        return ps1;
    }


    public void f(){

    }

}