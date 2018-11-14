package unit06.Test;

import unit06.example.base.Cookie;

/**
 * This example is to test 'public' modifier.
 * @author Kevin
 * @since 2017-08-05
 */
public class Dinner {

    public static void main(String[] args){
        Cookie c = new Cookie();
        // Can't access from outside package.
        // c.bite();
    }

}
