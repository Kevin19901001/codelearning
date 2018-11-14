package unit03.practice;

import java.util.Random;

/**
 * Created by Administrator on 2017/7/21.
 * This practice is practice 7, it likes throws a coin.
 *
 * @author Kevin
 * @since 2017-07-21
 */
public class ThrowCoin {

    static String throwCoin(int coin) {
        if (coin == 0) {
            return "front";
        }
        if (coin == 1) {
            return "opposite";
        }
        return "";
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(2);
        System.out.println(num);
        String result = throwCoin(num);
        System.out.println(result);
    }

}
