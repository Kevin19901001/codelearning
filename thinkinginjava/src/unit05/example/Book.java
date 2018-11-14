package unit05.example;

/**
 * Created by Administrator on 2017/7/29.
 * This example is to talk about 'finalize()'.
 * @author Kevin
 * @since 2017-07-29
 */
public class Book {

    boolean checkout = false;

    Book(boolean checkout){
        checkout = checkout;
    }

    void checkIn(){
        checkout = false;
    }

    @Override
    protected void finalize(){
        if(checkout){
            System.out.println("Error: checked out");
            // Normally, you'll also do this.
            /*
            try {
                super.finalize();
            } catch (Throwable throwable) {
                throwable.printStackTrace();
            }
            */
        }
    }

}
