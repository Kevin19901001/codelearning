package unit06.practice;

/**
 * This practice is practice 6.
 * @author Kevin
 * @since 2017-08-07
 */
public class First {

    protected String name;

    public void printName(){
        System.out.println(name);
    }


    public static void main(String[] args){
        First f = new First();
        f.printName();
    }

}

class Second {

    protected String name;

    public void printName(){
        System.out.println(name);
    }


    public static void main(String[] args){
        Second s = new Second();
        s.printName();
    }

}