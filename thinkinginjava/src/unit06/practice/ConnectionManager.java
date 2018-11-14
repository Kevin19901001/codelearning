package unit06.practice;

/**
 * This practice is practice 8.
 * @author Kevin
 * @since 2017-08-07
 */
public class ConnectionManager {


    public static void main(String[] args){
        Connection con = Connection.getConnection();
        System.out.println(con);
    }

}

class Connection {

    private Connection(){

    }


    static Connection getConnection(){
        return new Connection();
    }

}