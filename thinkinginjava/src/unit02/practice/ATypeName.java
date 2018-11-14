package unit02.practice;

/**
 * Created by Administrator on 2017/7/18.
 * @author Kevin
 * @since 2017-07-18
 */
public class ATypeName {

    String name = "Apple";
    int age = 22;

    public static void main(String[] args){
        ATypeName a = new ATypeName();
        System.out.println("Hello, I am " + a.name + ". I am " + a.age + " years old.");
    }

}
