package unit05.practice;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/7/27.
 * this practice is practice 4
 * @author Kevin
 * @since 2017-07-27
 */
public class OneArgConstructor {

    OneArgConstructor(String s){
        puts(s + "one-arg constructor.");
    }

    public static void main(String[] args){
        new OneArgConstructor("This is a ");
    }

}
