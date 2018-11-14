package unit05.practice;

/**
 * This practice is practice 21.
 * @author Kevin
 * @since 2017-08-04
 */
public class EnumValues {

    public static void main(String[] args){
        for(EnumPractice ep : EnumPractice.values()){
            System.out.println(ep + ",ordinal " + ep.ordinal());
        }
    }

}
