package unit05.example;

/**
 * Created by Administrator on 2017/8/3.
 * This exmaple is to talk about var args in java 5.
 * @author Kevin
 * @since 2017-08-03
 */
public class NewVarArgs {

    static void printArray(Object... args){
        for(Object o : args){
            System.out.print(o);
            System.out.println();
        }
    }

    public static void main(String[] args){
        // Can take individual elements:
        printArray(new Integer(47), new Float(3.14), new Double(11.11));
        printArray("one", "two", "three");
        printArray(new Dog(), new Dog(), new Dog());
    }

}
