package unit04.example;

import static unit04.util.Range.range;

/**
 * Created by Administrator on 2017/7/25.
 * this example is for learning 'break' and continue
 * @author Kevin
 * @since 2017-07-25
 */
public class BreakAndContinue {

    public static void main(String[] args){
        for(int i = 0; i < 100; i++){
            if(i == 74) break;
            if(i % 9 != 0) continue;
            System.out.println(i);
        }

        System.out.println();

        for(int i : range (100)){
            if(i == 74) break;
            if(i % 9 != 0) continue;
            System.out.println(i);
        }

        System.out.println();

        int i = 0;
        while(true){
            i++;
            int j = i * 27;
            if(j == 1269) break;
            if(i % 10 != 0) continue;
            System.out.println(i + " ");
        }
    }

}