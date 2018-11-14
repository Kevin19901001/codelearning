package unit06.example;

/**
 * This example is to test 'private' modifier.
 * @author Kevin
 * @since 2017-08-05
 */
public class Sundae {

    private Sundae(){

    }


    static Sundae makeSundae(){
        return new Sundae();
    }

}
