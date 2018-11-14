package unit02.practice;

/**
 * Created by Administrator on 2017/7/19.
 * @author Kevin
 * @since 2017-07-19
 */
public class TestWrapper {

    public static void main(String[] args){

        // practice 9.
        int i = 11;
        char c = 's';
        double d = 3.14;
        long l = 1234567890;

        Integer integer = new Integer(i);
        System.out.println(integer);

        Character character = new Character(c);
        System.out.println(character);

        Double doub = new Double(d);
        System.out.println(doub);

        Long longW = new Long(l);
        System.out.println(longW);
    }

}
