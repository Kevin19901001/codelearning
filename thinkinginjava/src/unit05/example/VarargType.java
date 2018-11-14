package unit05.example;

/**
 * Created by Administrator on 2017/8/3.
 * This example is to talk about var args.
 * @author Kevin
 * @since 2017-08-03
 */
public class VarargType {

    static void f(Character... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    static void g(int... args){
        System.out.print(args.getClass());
        System.out.println(" length " + args.length);
    }

    public static void main(String[] args){
        f('a');
        f();
        g(1);
        g();
        System.out.println("int[]: " + new int[0].getClass());
    }

}
