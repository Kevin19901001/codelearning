package unit05.practice;

/**
 * Created by Administrator on 2017/7/26.
 * this practice is practice 2
 * @author Kevin
 * @since 2017-07-26
 */
public class Player {

    private String name = "James";

    /*public Player(String name){
        this.name = name;
    }*/

    public static void main(String[] args){
        Player p1 = new Player();
        System.out.println(p1.name); // James

        // Player p2 = new Player("Irving");
        // System.out.println(p2.name);    // Irving
    }

}
