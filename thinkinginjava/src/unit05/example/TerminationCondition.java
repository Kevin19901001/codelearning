package unit05.example;

/**
 * Created by Administrator on 2017/7/29.
 * This example is to Talk about 'finalize()'.
 * @author Kevin
 * @since 2017-07-29
 */
public class TerminationCondition {

    public static void main(String[] args){
        Book novel = new Book(true);
        // Proper clean up.
        novel.checkIn();

        // Drop the reference, forget to clean up.
        new Book(true);

        // Force garbage collection & finalization.
        System.gc();
    }

}
