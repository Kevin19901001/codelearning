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
public class MovieTestDrive {
    
    public static void main(String[] args){
        Movie one = new Movie();
        one.title = "Gone with the Stock";
        one.genre = "Tragic";
        one.rating = -2;
        
        Movie two = new Movie();
        two.title = "Lost in Cubicle Space";
        two.genre= "Comedy";
        two.rating = 5;
        two.playIt();
        
        Movie three = new Movie();
        three.title = "byteClub";
        three.genre = "Tragic but ultimately uplifting";
        three.rating = 127;
    }
    
}
