package unit05.practice;

/**
 * Created by Administrator on 2017/8/2.
 * This practice is practice 17, 18.
 * @author Kevin
 * @since 2017-08-02
 */
public class Country {

    String name;

    public Country(String name){
        System.out.println(name);
    }

    public static void main(String[] args){
        Country[] countries;
        countries = new Country[]{new Country("China"), new Country("America"), new Country("Japan")};
    }

}
