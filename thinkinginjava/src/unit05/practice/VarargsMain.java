package unit05.practice;

/**
 * This practice is practice 20.
 * @author Kevin
 * @since 2017-08-03
 */
public class VarargsMain {

    public static void main(String... args){
        for(String s : args){
            System.out.println(s);
        }
    }

}
