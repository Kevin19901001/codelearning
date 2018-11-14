package unit06.practice;

/**
 * This practice is practice 5.
 * It is to test different access.
 * @author Kevin
 * @since 2017-08-07
 */
public class TestDiffAccess {

    public static void main(String[] args){
        AllAccessModifier aam = new AllAccessModifier();
        aam.name = "haha";
        aam.address = "lala";
        aam.age = 11;
        // private modifier, can not access.
        // aam.password = "12345678";
    }

}
