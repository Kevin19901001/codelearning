package unit07.practice;

/**
 * Created by Administrator on 2017/8/10.
 */
public class ExportClass extends BasicClass {

    ExportClass(){
        super(" constructor.");
        System.out.println(ExportClass.class + " constructor.");
    }


    ExportClass(String s){
        super(s);
        System.out.println(ExportClass.class + s);
    }


    public static void main(String[] args){
        new ExportClass();
        new ExportClass(" constructor.");
    }

}



class BasicClass {

    BasicClass(String s){
        System.out.println(BasicClass.class + s);
    }

}