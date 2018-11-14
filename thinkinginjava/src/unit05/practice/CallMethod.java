package unit05.practice;

/**
 * Created by Administrator on 2017/7/28.
 *
 * This practice is practice 8. The code
 * means that we can use 'this' to call
 * a method in the same class, we can
 * also don't use 'this', the effect are
 * the same. So it is unneeded to use
 * 'this' when calling a method in the
 * same class.
 *
 * @author Kevin
 * @since 2017-07-28
 */
public class CallMethod {

    void sayHi(){
        System.out.println("Hello!");
        sing();
        this.sing();
    }

    void sing(){
        System.out.println("wow ... wow ...");
    }

    public static void main(String[] args){
        CallMethod cm = new CallMethod();
        cm.sayHi();
    }

}
