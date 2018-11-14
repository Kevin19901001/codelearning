package unit07.practice;

import unit07.example.Detergent;

/**
 * This practice is practice 2.
 * @author Kevin
 * @since 2017-08-10
 */
public class ExtendsSuper extends Detergent {

    public void scrub(){
        super.scrub();
    }


    public void sterilize(){
        append(" sterilize()");
    }

}
