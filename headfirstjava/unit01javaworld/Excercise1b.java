/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit01javaworld;

/**
 *
 * @author Administrator
 */
public class Excercise1b {

    // Compile success, but dead loop.
    public static void main(String[] args){
        int x = 1;
        while(x < 10){
            if(x > 3){
                System.out.println("big x");
            }
        }
    }
    
}
