package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/1.
 * This example is to talk about static data initialization.
 * No matter how many objects have been created, static data
 * only init once. Static data can not be used a s local
 * variable, it can be only used as field. If a field is
 * static primitive data, and it has not been initialed. then
 * it's default value is the same as basic data. If it is a
 * object reference, the default value is null.
 * @author Kevin
 * @since 2017-08-01
 */
public class StaticInitialization {

    static Table table = new Table();
    static CupBoard cupboard = new CupBoard();

    public static void main(String[] args){
        puts("Creating new CupBoard() in main");
        new CupBoard();
        puts("Creating new CupBoard() in main");
        new CupBoard();
        table.f2(1);
        cupboard.f3(1);
    }

}
