package unit04.example;

/**
 * Created by Administrator on 2017/7/24.
 * This example is for learning comma operator in loop.
 * @author Kevin
 * @since 2017-07-28
 */
public class CommaOperator {

    public static void main(String[] args){
        for(int i = 1, j = i + 10; i < 5; i++, j = i * 2){
            System.out.println("i = " + i + ", j = " + j);
        }
    }

}
