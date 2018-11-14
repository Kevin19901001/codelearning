package unit03.practice;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/21.
 * This practice is practice 5.
 * @author Kevin
 * @since 2017-07-21
 */
public class Dog {

    String name;
    String say;

    public static void main(String[] args){
        Dog spot = new Dog();
        Dog scruffy = new Dog();
        spot.name = "spot";
        spot.say = "Ruff";
        scruffy.name = "scruffy";
        scruffy.say = "Wurf";
        puts(spot.name);
        puts(spot.say);
        puts(scruffy.name);
        puts(scruffy.say);

        // Practice 6.
        Dog buity = new Dog();
        buity = spot;
        puts(buity == spot);    // true /*false*/
        puts(buity.equals(spot));   // true
    }

}
