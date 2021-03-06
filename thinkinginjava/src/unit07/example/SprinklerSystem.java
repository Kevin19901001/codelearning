package unit07.example;

/**
 * This example is to talk about composition for code reuse.
 * @author Kevin
 * @since 2017-08-09
 */
public class SprinklerSystem {

    private String value1, value2, value3, value4;
    private WaterSource source = new WaterSource();
    private int i;
    private float f;

    public String toString(){
        return "value1 = " + value1 + " value2 = " + value2 +
                " value3 = " + value3 + " value4 = " + value4 + "\n" +
                "i = " + i + " f = " + f + " source = " + source;
    }


    public static void main(String[] args){
        SprinklerSystem sprinkler = new SprinklerSystem();
        System.out.println(sprinkler);
    }

}


class WaterSource {

    private String s;

    WaterSource(){
        System.out.println("WaterSource()");
        s = "constructed";
    }


    public String toString(){
        return s;
    }

}