package unit07.example;

/**
 * This example is to talk about inheritance.
 * @author Kevin
 * @since 2017-08-09
 */
public class Detergent extends Cleanser {

    // Change a method:
    public void scrub(){
        append(" Detergent.scrub()");
        super.scrub();
    }


    public void foam(){
        append(" foam()");
    }


    public static void main(String[] args){
        Detergent d = new Detergent();
        d.dilute();
        d.apply();
        d.scrub();
        d.foam();
        System.out.println(d);
        System.out.println("Testing base class");
        Cleanser.main(args);
    }

}



class Cleanser {

    private String s = "Cleanser";

    public void append(String a){
        s += a;
    }


    public void dilute(){
        append(" dilute()");
    }


    public void apply(){
        append(" apply()");
    }


    public void scrub(){
        append(" scrub()");
    }


    public String toString(){
        return s;
    }


    public static void main(String[] args){
        Cleanser x = new Cleanser();
        x.dilute();;
        x.apply();
        x.scrub();
        System.out.println(x);
    }

}