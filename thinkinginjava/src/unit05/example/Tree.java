package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/7/27.
 * this class is to test constructor overloading
 * @author Kevin
 * @since 2017-07-27
 */
public class Tree {

    int height;

    Tree(){
        puts("Planting a seedling");
        height = 0;
    }

    Tree(int initialHeight){
        height = initialHeight;
        puts("Creating new Tree that is " + height + " feet tall");
    }

    void info(){
        puts("Tree is " + height +" feet tall");
    }

    void info(String s){
        puts(s + ": Tree is " + height + " feet tall");
    }

}
