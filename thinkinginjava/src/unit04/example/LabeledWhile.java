package unit04.example;

import static unit04.util.Print.puts;

/**
 * Created by Administrator on 2017/7/25.
 * this exmaple is for learning label in while loop
 * @author Kevin
 * @since 2017-07-25
 */
public class LabeledWhile {

    public static void main(String[] args){
        int i = 0;
        outer:
        while(true){
            puts("outer while loop");
            while(true){
                i++;
                puts("i = " + i);
                if(i == 1){
                    puts("continue");
                    continue;
                }
                if(i == 3){
                    puts("continue outer");
                    continue outer;
                }
                if(i == 5){
                    puts("break");
                    break outer;
                }
                if(i == 7){
                    puts("break outer");
                    break outer;
                }
            }
        }
    }

}
