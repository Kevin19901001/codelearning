package unit07.practice;

/**
 * This practice is practice 1.
 * @author Kevin
 * @since 2017-08-09
 */
public class Second {

    private First first;

    public Second(){
        first = new First();
    }


    public String toString(){
        return "first = " + first + "\nsecond = " + (new Second().getClass().getName());
    }


    public static void main(String[] args){
        Second second = new Second();
        System.out.println(second);
    }

}



class First {

    private String name;

    public First(){
        name = "first";
    }


    public String toString(){
        return name;
    }

}