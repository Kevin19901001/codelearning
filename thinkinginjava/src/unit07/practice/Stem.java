package unit07.practice;

/**
 * This practice is practice 9, 10.
 * @author Kevin
 * @since 2017-08-10
 */
public class Stem extends Root {

    Stem(){
        super(" constructor.");
        System.out.println(Stem.class + "constructor.");
    }


    Stem(String s){
        super(" constructor.");
        System.out.println(Stem.class + s);
    }

}



class Root {

    private Componnet1 comp1 = new Componnet1(" constructor.");
    private Componnet2 comp2 = new Componnet2(" constructor.");
    private Componnet3 comp3 = new Componnet3(" constructor.");

    /*
    Root(){
        System.out.println(Root.class + " constructor.");
    }
    */


    Root(String s){
        System.out.println(Root.class + s);
    }

}



class Componnet1 {

    /*
    Componnet1(){
        System.out.println(Componnet1.class + " constructor.");
    }
    */


    Componnet1(String s){
        System.out.println(Componnet1.class + s);
    }

}



class Componnet2 {

    /*
    Componnet2(){
        System.out.println(Componnet2.class + " constructor.");
    }
    */


    Componnet2(String s){
        System.out.println(Componnet2.class + s);
    }

}



class Componnet3 {

    /*
    Componnet3(){
        System.out.println(Componnet3.class + " constructor.");
    }
    */


    Componnet3(String s){
        System.out.println(Componnet3.class + s);
    }

}
