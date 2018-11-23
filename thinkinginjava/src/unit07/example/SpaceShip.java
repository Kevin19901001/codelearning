package unit07.example;

/**
 * This example is to talk about proxy.
 * @author Kevin
 * @since 2017-08-11
 */
public class SpaceShip extends SpaceShipControls {

    private String name;

    public SpaceShip(String name){
        this.name = name;
    }


    public String toString(){
        return name;
    }


    public static void main(String[] args){
        SpaceShip protector = new SpaceShip("NSEA Protector");
        protector.forward(11);
    }

}