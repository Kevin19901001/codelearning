package unit04.example;

/**
 * Created by Administrator on 2017/7/24.
 * This example is for learning for loop.
 * @author Kevin
 * @since 2017-07-24
 */
public class ListCharacters {

    public static void main(String[] args){
        for(char c = 0; c < 128; c++){
            if(Character.isLowerCase('c')){
                System.out.println("value: " + (int)c + " character: " + c);
            }
        }
    }

}
