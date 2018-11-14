package unit03.example;

import unit03.practice.Value;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/20.
 * This exampe is to test equals() method.
 * @author Kevin
 * @since 2017-07-20
 */
public class EqualsMethod {

    public static void main(String[] args){
        Integer n1 = new Integer(47);
        Integer n2 = new Integer(47);
        puts(n1.equals(n2));    // true

        Value v1 = new Value();
        Value v2 = new Value();
        v1.number = v2.number = 0.123f;
        puts(v1.equals(v2));    // false

        /*
         *  The result is false because that the default equals() compares the quote of two object.
         *  So it is needed to override a new equals() in your own class.
         *
         */
    }

}
