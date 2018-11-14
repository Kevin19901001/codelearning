package unit05.practice;

/**
 * Created by Administrator on 2017/8/2.
 * This practice is practice 15.
 * @author Kevin
 * @since 2017-08-02
 */
public class InstanceInit {

    String name;
    String sex;
    String address;

    {
        name = "Kevin";
        sex = "male";
        address = "beijing";
        System.out.println("instance init completed.");
    }

    public static void main(String[] args){
        System.out.println("inside main()");
        InstanceInit kevin = new InstanceInit();
    }

}
