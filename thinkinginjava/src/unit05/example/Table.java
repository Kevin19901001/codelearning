package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/1.
 * This example is to test static data.
 * @author Kevin
 * @since 2017-08-01
 */
public class Table {

    static Bowl bowl1 = new Bowl(1);

    static Bowl bowl2 = new Bowl(2);

    Table(){
        puts("Table()");
        bowl2.f1(1);
    }

    void f2(int marker){
        puts("f2(" + marker + ")");
    }

}
