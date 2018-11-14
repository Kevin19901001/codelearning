package unit03.practice;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/21.
 * This practice is practice 8.
 * @author Kevin
 * @since 2017-07-21
 */
public class LongToBinary {

    public static void main(String[] args){
        long l1 = 0x1fff;
        long l2 = 01234567;
        puts("l1: " + Long.toBinaryString(l1));
        puts("l2: " + Long.toBinaryString(l2));
    }

}
