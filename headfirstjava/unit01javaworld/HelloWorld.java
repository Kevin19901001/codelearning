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
public class HelloWorld {
    
    public static void main(String[] args){
        
        System.out.println("Hello, World!");
        
        testSentence();
        
        testForAndWhile();
        
        testIfElse();
    }
    
    public static void testSentence(){
        int x = 3;
        String name = "Dirk";
        x = x * 17;
        System.out.println("x is " + x);
        System.out.println("name : " + name);
        double d = Math.random();
        System.out.println(d);
    }
    
    public static void testForAndWhile(){
        int x = 15;
        while(x > 12){
            System.out.println("x is " + x);
            x = x -1;
        }
        
        for(int y = 0; y < 10; y = y + 1){
            System.out.println("y is now " + y);
        }
    }
    
    public static void testIfElse(){
        int x = 10;
        String name = "Duke";
        if(x == 10){
            System.out.println("x must be 10");
        } else {
            System.out.println("x isn't 10");
        }
        
        if((x < 3) & name.equals("Duke")){
            System.out.println("Gently");
        }
        System.out.println("This line runs no matter what");
    }
    
}
