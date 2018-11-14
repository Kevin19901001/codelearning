package unit03.practice;

import static unit03.util.Print.puts;

/**
 * Created by Administrator on 2017/7/20.
 * This practice is practice 3, it is for alias test i method.
 * @author Kevin
 * @since 2017-07-20
 */
public class AliasInMethod {

    static void t(ValueForFloat f){
        f.digit = 0.123f;
    }

    public static void main(String[] args){
        ValueForFloat vff = new ValueForFloat();
        vff.digit = 123.456f;
        puts("1: vff.digit: " + vff.digit); // 123.456

        t(vff);
        puts("2: vff.digit: " + vff.digit); // 0.123
    }

}
