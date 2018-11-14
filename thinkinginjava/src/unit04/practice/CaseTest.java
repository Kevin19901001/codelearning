package unit04.practice;

import static unit04.util.Print.puts;

/**
 * Created by Administrator on 2017/7/26.
 * this practice is practice 8
 * @author Kevin
 * @since 2017-07-26
 */
public class CaseTest {

    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            switch(i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    puts(i + " less than 5");
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    puts(i + " less than 10");
            }
        }
    }

}
