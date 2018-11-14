package unit03.example;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/20.
 * This example is for assignment learning.
 * @author Kevin
 * @since 2017-07-20
 *
 */
public class Assignment {

    public static void main(String[] args){
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 18;
        t2.level = 29;
        puts("1: t1.level: " + t1.level + ", t2.level: " + t2.level);   // 18, 29

        t1 = t2;
        puts("2: t1.level: " + t1.level + ", t2.levle: " + t2.level);   // 29, 29

        t1.level = 88;
        puts("3: t1.level: " + t1.level + ", t2.levle: " + t2.level);   // 88, 88
    }

}


