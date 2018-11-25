/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit02classandobject;

/**
 *
 * @author Administrator
 */
public class DogTestDrive {
    
    public static void main(String[] args){
        Dog d = new Dog();
        d.size = 40;
        d.bark();
        System.out.println(d.size);
    }
    
}
