package unit07.example;

/**
 * This example is to talk about proxy.
 * To avoid exposing methods of super class in
 * sub class, use delegation is a good way.
 * @author Kevin
 * @since 2017-08-11
 */
public class SpaceShipDelegation {

    private String name;
    private SpaceShipControls controls = new SpaceShipControls();

    public SpaceShipDelegation(String name){
        this.name = name;
    }


    public void back(int velocity){
        controls.back(velocity);
    }


    public void down(int velocity){
        controls.down(velocity);
    }


    public void forward(int velocity){
        controls.forward(velocity);
    }


    public void left(int velocity){
        controls.left(velocity);
    }


    public void right(int velocity){
        controls.right(velocity);
    }


    public void turboBoost(){
        controls.turboBoost();
    }


    public void up(int velocity){
        controls.up(velocity);
    }


    public static void main(String[] args){
        SpaceShipDelegation delegate = new SpaceShipDelegation("NSEA Protector");
        delegate.forward(120);
    }
}
