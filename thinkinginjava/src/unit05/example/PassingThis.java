package unit05.example;

/**
 * Created by Administrator on 2017/7/28.
 * this example is to talk about passing
 * 'this' to a method as argument.
 * @author Kevin
 * @since 2017-07-28
 */
public class PassingThis {

    public static void main(String[] args){
        new Person().eat(new Apple());
    }

}
