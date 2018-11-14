package unit07.practice;

/**
 * This practice is practice 11.
 * @author Kevin
 * @since 2017-08-11
 */
public class DetergentProxy {

    String name = "Detergent";
    Cleanser clean = new Cleanser();

    public void append(String s){
        clean.append(s);
    }


    public void dilute(){
        clean.dilute();
    }


    public void apply(){
        clean.apply();
    }


    public void scrub(){
        clean.scrub();
    }


    public static void main(String[] args){
        DetergentProxy delegate = new DetergentProxy();
        delegate.append("aha");
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