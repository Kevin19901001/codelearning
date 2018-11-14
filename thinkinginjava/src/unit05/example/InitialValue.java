package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/7/31.
 * This example is to talk about class member initialization.
 * @author Kevin
 * @since 2017-07-31
 */
public class InitialValue {

    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValue reference;

    void printInitialValues(){
        puts("Data type         Initial values");
        puts("boolean           " + t); // false
        puts("char              " + c); //
        puts("byte              " + b); // 0
        puts("short             " + s); // 0
        puts("int               " + i); // 0
        puts("long              " + l); // 0
        puts("float             " + f); // 0.0
        puts("double            " + d); // 0.0
        puts("reference         " + reference); // null
    }

    public static void main(String[] args){
        InitialValue init = new InitialValue();
        init.printInitialValues();
    }
}
