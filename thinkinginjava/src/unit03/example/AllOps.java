package unit03.example;

/**
 * Created by Administrator on 2017/7/22.
 * This example is for suming up operators.
 * @author Kevin
 * @since 2017-07-22
 */
public class AllOps {

    // To zccept result of boolean test:
    void func(boolean b){

    }

    void boolTest(boolean x, boolean y){
        // Relational and lgic
        func(x == y);
        func(x != y);
        func(!y);
        x = x && y;
        x = x || y;

        // Bitwise operators
        x = x & y;
        x = x | y;
        x = x ^ y;

        // Compound assignment
        x &= y;
        x ^= y;
        x |= y;

    }

    void charTest(char x, char y){
        // AtithMetic operators
        x = (char)(x * y);
        x = (char)(x / y);
        x = (char)(x % y);
        x = (char)(x + y);
        x = (char)(x - y);
        x++;
        x--;
        x = (char)+y;
        x = (char)-y;

        // Relational and logical
        func(x > y);
        func(x >= y);
        func(x < y);
        func(x <= y);
        func(x == y);
        func(x != y);

        // Bitwise operators
        x = (char)~y;
        x = (char)(x & y);
        x = (char)(x | y);
        x = (char)(x ^ y);
        x = (char)(x << 1);
        x = (char)(x >> 1);
        x = (char)(x >>> 1);

        // Compound assignment
        x += y;
        x -= y;
        x *= y;
        x %= y;
        x /= y;
        x <<= 1;
        x >>= 1;
        x >>>= 1;
        x &= y;
        x |= y;
        x ^= y;

        // casting
        byte b = (byte)x;
        short s = (short)x;
        int i = (int)x;
        long l = (long)x;
        float f = (float)x;
        double d = (double)x;
    }

    public static void main(String[] args){

    }

}
