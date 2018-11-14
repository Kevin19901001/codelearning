package unit05.example;

/**
 * Created by Administrator on 2017/8/3.
 * This example is to talk about autobox var args.
 * @author Kevin
 * @since 2017-08-03
 */
public class AutoBoxingVarargs {

    public static void f(Integer... args){
        for(Integer i : args){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        f(new Integer(1), new Integer(2));
        f(4, 5, 6, 7, 8, 9);
        f(10, new Integer(11), 12);
    }

}
