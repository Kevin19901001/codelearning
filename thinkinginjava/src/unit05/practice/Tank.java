package unit05.practice;

/**
 * Created by Administrator on 2017/7/31.
 * This practice is practice 12.
 * @author Kevin
 * @since 2017-07-31
 */
public class Tank {

    String state = "empty";

    Tank(String state){
        state = state;
    }

    void checkState(){
        state = "full";
    }

    protected void finalize(){
        if(state.equals("empty")){
            System.out.println("Empty!");
        }
    }

}
