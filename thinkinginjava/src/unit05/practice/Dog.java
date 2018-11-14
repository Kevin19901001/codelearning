package unit05.practice;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/7/28.
 * this practice is practice 5, 6
 * @author Kevin
 * @since 2017-07-28
 */
public class Dog {

    static void bark(String s, int i){
        puts(s + " barks " + i + " times ...");
    }

    static void bark(int i, String s){
        puts(i + " dogs " + s);
    }

    public static void main(String[] args){
        bark("Scott", 3);
        bark(3, "howling ...");
    }

}
