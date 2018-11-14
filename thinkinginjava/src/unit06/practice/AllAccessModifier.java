package unit06.practice;

/**
 * This practice is practice 5.
 */
public class AllAccessModifier {

    public String name;
    protected String address;
    int age;
    private String password;

    public void printName(){
        System.out.println("name");
    };


    protected void printAddress(){
        System.out.println("address");
    }


    void printAge(){
        System.out.println("age");
    }


    private void printPassword(){
        System.out.println("password");
    }

}
