package unit06.example.base;

/**
 * This example is to talk about access modifier 'public'.
 * @author Kevin
 * @since 2017-08-05
 */
public class Cookie {

    public Cookie(){
        System.out.println("Cookie constructor");
    }

    protected void bite(){
        System.out.println("bite");
    }

}
