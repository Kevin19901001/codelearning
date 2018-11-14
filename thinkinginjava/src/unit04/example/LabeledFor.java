package unit04.example;

import static unit04.util.Print.puts;

/**
 * Created by Administrator on 2017/7/25.
 * this example is for learning label
 * @author Kevin
 * @since 2017-07-25
 */
public class LabeledFor {

    public static void main(String[] args){
        int i = 0;
        outer:
        for(; true; ){
            inner:
            for(; i < 10; i++){
                puts("i = " + i);
                if(i == 2){
                    puts("continue");
                    continue;
                }
                if(i == 3){
                    puts("break");
                    i++;
                    break;
                }
                if(i == 7){
                    puts("continue outer");
                    i++;
                    continue outer;
                }
                if(i == 8){
                    puts("break outer");
                    break outer;
                }
                for(int k = 0; i < 5; k++){
                    if(k == 3){
                        puts("continue inner");
                        continue inner;
                    }
                }
            }
        }
    }

}
