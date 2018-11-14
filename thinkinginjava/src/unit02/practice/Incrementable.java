package unit02.practice;

/**
 * Created by Administrator on 2017/7/19.
 * @author Kevin
 * @since 2017-07-19
 */
public class Incrementable {

    static int i;

    static void increment(){
        Incrementable.i++;
    }

    /**
     * practice 7 and practice 8.
     * @param args
     */
    public static void main(String[] args){
        // practice 7.
        Incrementable ica = new Incrementable();
        ica.increment();
        System.out.println(i);

        // practice 8.
        System.out.println(ica.i);
        Incrementable ict = new Incrementable();
        System.out.println(ict.i);
    }

}
