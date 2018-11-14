package unit06.example;

import java.io.PrintStream;

/**
 * This exmaple is to talk about customized toll lib.
 * @author Kevin
 * @since 2017-08-05
 */
public class Print {

    // Print with new line:
    public static void print(Object obj){
        System.out.println(obj);
    }


    // Print a new line by itself:
    public static void print(){
        System.out.println();
    }


    // Print with no line break:
    public static void printb(Object obj){
        System.out.print(obj);
    }


    // The new Java SE5 printf() (from C):
    public static PrintStream printf(String format, Object... args){
        return System.out.printf(format, args);
    }

}
