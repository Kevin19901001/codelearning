package unit05.practice;

/**
 * Created by Administrator on 2017/7/31.
 * This practice is practice 12.
 * @author Kevin
 * @since 2017-07-31
 */
public class TestTank {

    public static void main(String[] args){
        Tank tank = new Tank("full");
        tank.checkState();
        new Tank("full");
        System.gc();
    }

}
