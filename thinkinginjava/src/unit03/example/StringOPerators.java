package unit03.example;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/21.
 * This example is for learning String operators.
 * @author Kevin
 * @since 2017-07-21
 */
public class StringOPerators {

    public static void main(String[] args){
        int x = 0, y = 1, z = 2;
        String s = "x, y, z ";
        puts(s + x + y + z);    //  x, y, z 012
        puts(x + " " + s);  //  0 x, y, z
        s += "(sumed) = ";
        puts(s + (x + y + z));  //  x, y, z (sumed) = 3
        puts("" + x);   //  0
    }

}
