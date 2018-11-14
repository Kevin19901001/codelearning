package unit04.practice;

/**
 * Created by Administrator on 2017/7/25.
 * this practice is practice 7
 * @author Kevin
 * @since 2017-07-25
 */
public class BreakAndReturn {

    public static void main(String[] args){
        for(int i = 1; i < 100; i++){
            if(i == 99) break;
            System.out.println(i);
        }

        for(int j = 1; j < 100; j++){
            if(j == 99) return;
            System.out.println(j);
        }
    }

}
