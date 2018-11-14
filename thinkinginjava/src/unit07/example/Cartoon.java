package unit07.example;

/**
 * This example is to talk about basic class constructor.
 * @author Kevin
 * @since 2017-07-10
 */
public class Cartoon extends Drawing {

    Cartoon(){
        System.out.println("Cartoon constructor");
    }


    public static void main(String[] args){
        Cartoon cartoon = new Cartoon();
    }

}



class Drawing extends Art {
    Drawing(){
        System.out.println("Drawing constructor");
    }
}



class Art {
    Art(){
        System.out.println("Art contructor");
    }
}