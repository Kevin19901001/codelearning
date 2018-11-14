package unit02.example;

import org.junit.Test;

/**
 * Created by Administrator on 2017/7/17.
 * Basic data type.
 */
public class Case03 {

    @Test
    public void testWapper() {
        char c = 'x';
        /* Every basic data type has a wapper type, it means an object can be created. */
        Character ch = new Character(c);
        System.out.println(ch);
    }

    @Test
    public void testHighPrecision(){
        // BigInteger supports any precision int.
        //BigDecimal supports any precision float.
    }

}
