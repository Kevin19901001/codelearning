package unit05.example;

/**
 * Created by Administrator on 2017/7/28.
 * this example is to talk about 'this'
 * @author Kevin
 * @since 2017-07-28
 */
public class Leaf {

    int i = 0;

    Leaf increment(){
        i++;
        return this;
    }

    void print(){
        System.out.println("i = " + i);
    }

    public static void main(String[] args){
        Leaf x = new Leaf();
        x.increment().increment().increment().increment().print();
    }

}