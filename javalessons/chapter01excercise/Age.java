package chapter01excercise;

import java.util.Scanner;

/**
 *
 * @author kevin
 * @description Age
 * @since 2018/12/12
 *
 */
public class Age{

    /**
     *
     * @author kevin
     * @param args
     * @since 2018/12/12
     *
     */
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please input an age:");
        int age = scanner.nextInt();
        scanner.close();
        System.out.println(age >= 18 && age <= 50);
    }

}
