package unit05.practice;

/**
 * Created by Administrator on 2017/8/3.
 * This practice is practice 19.
 * @author Kevin
 * @since 2017-08-03
 */
public class StringVarargs {

    static void printArray(String... args){
        for(String s : args){
            System.out.println(s + " ");
        }
    }

    public static void main(String[] args){
        printArray("one", "two", "three");
    }

}
