package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/7/28.
 * This example is to talk about using
 * 'this' to call one constructor in
 * another constructor.
 * @author Kevin
 * @since 2017-07-28
 */
public class Flower {

    int petalCount = 0;
    String s = "initil value";

    Flower(int petals){
        petalCount = petals;
        puts("Constructor w/ String arg only, petalCount = " + petalCount);
    }

    Flower(String ss){
        puts("Constructor w/ String arg only, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals){
        this(petals);
        this.s = s;
        puts("String and int args");
    }

    Flower(){
        this("hi", 47);
        puts("Default constructor (no args)");
    }

    void printPetalCount(){
        puts("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args){
        Flower x = new Flower();
        x.printPetalCount();
    }

}
