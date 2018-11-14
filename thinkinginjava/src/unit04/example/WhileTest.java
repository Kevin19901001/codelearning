package unit04.example;

/**
 * Created by Administrator on 2017/7/24.
 * This example is for learning while loop.
 * @author Kevin
 * @since 2017-07-24
 */
public class WhileTest {

    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.print(result + ", ");
        return result;
    }

    public static void main(String[] args){
        while(condition()){
            System.out.println("Inside while...");
        }
        System.out.println("Exit while...");
    }

}
