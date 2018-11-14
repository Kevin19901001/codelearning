package unit05.example;

import static unit05.unitl.Print.puts;

/**
 * Created by Administrator on 2017/8/1.
 * This exmaple is to test static data.
 * @author Kevin
 * @since 2017-08-01
 */
public class CupBoard {

    Bowl bowl3 = new Bowl(3);

    static Bowl bowl4 = new Bowl(4);

    static Bowl bowl5 = new Bowl(5);

    CupBoard(){
        puts("CupBoard()");
        bowl4.f1(2);
    }

    void f3(int marker){
        puts("f3(" + marker + ")");
    }

}
