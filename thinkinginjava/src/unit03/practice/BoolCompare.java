package unit03.practice;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/22.
 * This practice is practice 14.
 * @author Kevin
 * @since 2017-07-20
 */
public class BoolCompare {

    static void testBool(String s, String t){
        puts(Integer.parseInt(s) > Integer.parseInt(t));    // false
        puts(Integer.parseInt(s) >= Integer.parseInt(t));   // false
        puts(Integer.parseInt(s) < Integer.parseInt(t));    // true
        puts(Integer.parseInt(s) <= Integer.parseInt(t));   // true
        puts(s == t);   // false
        puts(s != t);   // true
        puts(s.equals(t));  //false
    }

    public static void main(String[] args){
        testBool("7", "10");
    }

}
