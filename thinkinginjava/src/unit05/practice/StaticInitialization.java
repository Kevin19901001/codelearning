package unit05.practice;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/1.
 * This practice is practice 14.
 * @author Kevin
 * @since 201708-01
 */
public class StaticInitialization {

    static String s1 = "haha";

    static String s2;

    static {
        s2 = "hahahaha";
    }

    public static void main(String[] args){
        if(s1 != null && s2 != null){
            puts(s1);
            puts(s2);
        }
    }

}
