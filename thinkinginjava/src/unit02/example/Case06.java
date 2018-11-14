package unit02.example;

import org.junit.Test;

/**
 * Created by Administrator on 2017/7/18.
 */
public class Case06 {

    @Test
    public void test(){
        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }

}
