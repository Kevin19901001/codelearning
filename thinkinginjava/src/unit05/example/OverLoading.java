package unit05.example;

/**
 * Created by Administrator on 2017/7/27.
 * this example is talking about constructor overloading
 * @author Kevin
 * @since 2017-07-27
 */
public class OverLoading {

    public static void main(String[] args){
        for(int i = 0; i < 5; i++){
            Tree t = new Tree(i);
            t.info();
            t.info("overload method");
        }

        // Overload constructor
        new Tree();
    }

}
