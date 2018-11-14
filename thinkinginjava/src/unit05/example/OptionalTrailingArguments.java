package unit05.example;

/**
 * Created by Administrator on 2017/8/3.
 * This example is to talk about var args.
 * @author Kevin
 * @since 2017-08-03
 */
public class OptionalTrailingArguments {

    static void f(int required, String... trailing){
        System.out.print("required " + required + " ");
        for(String s : trailing){
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        f(1, "one");
        f(2, "two", "three");
        f(0);
    }

}
