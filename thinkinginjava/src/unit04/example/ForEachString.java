package unit04.example;

/**
 * Created by Administrator on 2017/7/24.
 * This example is for learning 'foreach' loop.
 * @author Kevin
 * @since 2017-07-24
 */
public class ForEachString {

    public static void main(String[] args){
        for(char c : "An Afrcan swallow".toCharArray()){
            System.out.print(c + " ");
        }
    }

}
