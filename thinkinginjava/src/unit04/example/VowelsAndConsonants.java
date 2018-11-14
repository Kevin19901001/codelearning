package unit04.example;

import java.util.Random;

import static unit04.util.Print.put;
import static unit04.util.Print.puts;

/**
 * Created by Administrator on 2017/7/25.
 * this example is for learning 'switch ... case ... ' sentence
 * @author Kevin
 * @since 2017-07-25
 */
public class VowelsAndConsonants {

    public static void main(String[] args){
        Random rand  = new Random();
        for(int i = 0; i < 100; i++){
            int index = rand.nextInt(26);
            puts(index);
            int c = index + 'a';
            put((char)c + ", " + c + ": ");
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': puts("vowel");
                break;
                case 'y':
                case 'w': puts("Some times a vowel");
                break;
                default: puts("consonant");
            }
        }
    }

}
