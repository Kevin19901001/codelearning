package unit05.example;

/**
 * This example is to talk about enum order.
 * @author Kevin
 * @since 2017-08-03
 */
public class EnumOrder {

    public static void main(String[] args){
        for(Spiciness s : Spiciness.values()){
            System.out.println(s + ", ordinal " + s.ordinal());
        }
    }

}
