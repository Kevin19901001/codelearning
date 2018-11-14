package unit05.example;

/**
 * Created by Administrator on 2017/7/28.
 * this simple class is to talk about 'this'
 * @author Kevin
 * @since 2017-07-28
 */
public class Person {

    public void eat(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }

}
