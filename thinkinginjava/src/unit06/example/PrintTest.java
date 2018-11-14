package unit06.example;

import static unit06.example.Print.print;

/**
 * This example is to test print().
 * @author Kevin
 * @since 2017-08-05
 */
public class PrintTest {

    public static void main(String[] args){
        print("Available from now on!");
        print(100);
        print(100L);
        print(3.14159);
    }

}
