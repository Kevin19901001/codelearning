package unit03.practice;

/**
 * Created by Administrator on 2017/7/20.
 * This practice is practice 4, use constant to calculate speed.
 * @author Kevin
 * @since 2017-07-20
 */
public class CalcSpeed {

    static final long s = 4200;
    static final float t = 66.66f;

    static float calc(long l, float f){
        return l/f;
    }

    public static void main(String[] args) {
        float v = calc(s, t);
        System.out.println("The spped on foot is " + v + " meters/hour.");
    }

}
