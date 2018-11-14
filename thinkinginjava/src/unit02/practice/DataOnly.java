package unit02.practice;

/**
 * Created by Administrator on 2017/7/18.
 * @author Kevin
 * @since 2017-07-18
 */
public class DataOnly {

    int i;

    double d;

    boolean b;

    public static void main(String[] args){
        DataOnly da = new DataOnly();
        da.i = 15;
        da.d = 148.8;
        da.b = false;
        System.out.println("Age of da is " + da.i);
        System.out.println("Height of da is " + da.d);
        System.out.println("Is da a girl? " + da.b);
    }

}
