package unit02.practice;

import org.junit.Test;

/**
 * Created by Administrator on 2017/7/18.
 * @author Kevin
 * @since 2017-07-18
 */
public class TestStorage {

    int storage(String s){
        return s.length() * 2;
    }

    @Test
    public void test(){
        String d = "Good Morning!";
        int length = storage(d);
        System.out.println(length);
    }

}
