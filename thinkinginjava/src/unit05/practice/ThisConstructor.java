package unit05.practice;

/**
 * Created by Administrator on 2017/7/28.
 * This practice is practice 9, it is to
 * test calling constructor by 'this'.
 * @author Kevin
 * @since 2017-07-28
 */
public class ThisConstructor {

    int age;
    String name;

    ThisConstructor(int age){
        this.age = age;
        System.out.println("init age");
    }

    ThisConstructor(int age, String name){
        this(age);
        this.name = name;
        System.out.println("init age and name");
    }

    public static void main(String[] args){
        new ThisConstructor(18, "FangFang");
    }

}
