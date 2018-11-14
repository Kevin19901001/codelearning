package unit06.example;

import unit06.example.base.Cookie;

/**
 * This example is to talk about 'protected' modifier.
 * @author Kevin
 * @since 2017-08-07
 */
public class ChocolateChip extends Cookie {

    public ChocolateChip(){
        System.out.println("ChocolateChip constructor");
    }


    public void chomp(){
        bite();
    }


    public static void main(String[] args){
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }

}
