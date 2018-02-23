/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author siddd1628
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //  Create a new city 
         City waterloo = new City();
        
        //Create a wall
        new Wall(waterloo, 3, 1, Direction.SOUTH);
        new Wall(waterloo, 3, 2, Direction.SOUTH);
        new Wall(waterloo, 3, 3, Direction.SOUTH);
        new Wall(waterloo, 3, 4, Direction.SOUTH);
        new Wall(waterloo, 3, 5, Direction.SOUTH);
        new Wall(waterloo, 3, 6, Direction.SOUTH);
        new Wall(waterloo, 3, 7, Direction.SOUTH);
        new Wall(waterloo, 3, 8, Direction.SOUTH);
        new Wall(waterloo, 3, 9, Direction.SOUTH);
        new Wall(waterloo, 3, 1, Direction.EAST);
        new Wall(waterloo, 3, 2, Direction.EAST);
        new Wall(waterloo, 3, 4, Direction.EAST);
        new Wall(waterloo, 3, 7, Direction.EAST);
         new Thing(waterloo, 1, 2);
         
        
        
        
        
    }
}
