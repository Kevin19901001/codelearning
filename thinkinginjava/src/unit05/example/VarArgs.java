package unit05.example;

/**
 * Created by Administrator on 2017/8/2.
 * This example is to talk about varargs.
 * @author Kevin
 * @since 2017-08-02
 */
public class VarArgs {

    static void printArray(Object[] args){
        for(Object o: args){
            System.out.print(o);
            System.out.println();
        }
    }

    public static void main(String[] args){
        printArray(new Object[]{new Integer(11), new Float(3.14), new Double(5.67)});
        printArray(new Object[]{"one", "two", "three"});
        printArray(new Object[]{new Dog(), new Dog(), new Dog()});
    }

}
