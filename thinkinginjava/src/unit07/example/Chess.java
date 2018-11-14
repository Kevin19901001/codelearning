package unit07.example;

/**
 * This example is to talk about basic class constructor with args.
 * @author Kevin
 * @since 2017-08-10
 */
public class Chess extends BoardGame {

    // Practice 6:
    /* error! Using super to call basic constructor is the first thing!
    Chess(int i){
        System.out.println("Chess constructor");
        super(i);
    }
    */


    Chess(int i){
        super(i);
        System.out.println("Chess constructor.");
    }


    public static void main(String[] args){
        new Chess(11);
    }

}



class BoardGame extends Game {

    BoardGame(int i){
        super(i);
        System.out.println("BoardGame constructor.");
    }

}



class Game {

    Game(int i){
        System.out.println("Game constructor.");
    }

}