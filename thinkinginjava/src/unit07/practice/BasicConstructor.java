package unit07.practice;

/**
 * This practice is practice 3, 4, 5, 6.
 * @author Kevin
 * @since 2017-08-10
 */
public class BasicConstructor extends B {

    // Practice 6:
    BasicConstructor(int i){
        super(i);
        System.out.println("BasicConstructor constructor.");
    }


    public static void main(String[] args){
        BasicConstructor cons = new BasicConstructor(10);
    }

}



class B extends A {

    /*
    B(){
        System.out.println("B constructor.");
    }
    */


    // Practice 6:
    B(int i){
        super(i);
        System.out.println("B constructor.");
    }

}



class A {

    /*
    A(){
        System.out.println("A constructor.");
    }
    */


    // Practice 6:
    A(int i){
        System.out.println("A constructor.");
    }

}