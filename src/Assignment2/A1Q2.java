/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author siddd1628
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //  Create a new city 
         City kw = new City();
         
           
        // Create a new robot to put into the city
        RobotSE karel = new RobotSE(kw, 0, 0, Direction.EAST);
        
         // Place things in front of karel
         new Thing(kw, 0, 1);
         
         // Place things in front of karel
         new Thing(kw, 0, 2);
         
         // Place things in front of karel
         new Thing(kw, 0, 3);
         
         // Place things in front of karel
         new Thing(kw, 0, 4);
         
         // Place things in front of karel
         new Thing(kw, 0, 5);
         
         // Place things infront of karel
         new Thing(kw, 0, 6);
         
         // Place new thing in front of karel
         new Thing(kw, 0, 7);
         
         // Place new thing in front of karel
         new Thing(kw, 0, 8);
         
         // Place new thing in front of karel
         new Thing (kw, 0, 9);
         
         
        
    }
}
