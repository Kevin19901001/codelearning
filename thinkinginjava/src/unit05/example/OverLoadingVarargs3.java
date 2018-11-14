package unit05.example;

/**
 * This example is to talk about var args.
 * @author Kevin
 * @since 2017-08-03
 */
public class OverLoadingVarargs3 {

    static void f(float i, Character... args){
        System.out.println("first");
    }

    static void f(char c, Character... args){
        System.out.println("second");
    }

    public static void main(String[] args){
        f(1, 'a');
        f('a', 'b');
    }

}
