/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;

/**
 *
 * @author siddd1628
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //  Create a new city 
         City dstown = new City();
        
         
       
        new Wall(dstown, 1, 1, Direction.NORTH);
        new Wall(dstown, 1, 1, Direction.EAST);
        new Wall(dstown, 1, 1, Direction.WEST);
        new Wall(dstown, 1, 1, Direction.SOUTH);
        new Wall(dstown, 2, 2, Direction.WEST);
        new Wall(dstown, 3, 2, Direction.WEST);
        new Wall(dstown, 3, 2, Direction.SOUTH);
        new Wall(dstown, 2, 2, Direction.NORTH);
        new Wall(dstown, 2, 3, Direction.NORTH);
        new Wall(dstown, 3, 3, Direction.EAST);
        new Wall(dstown, 2, 3, Direction.EAST);
        new Wall(dstown, 3, 3, Direction.SOUTH);
        
        
        
        
        
    
        
        
   
    }
    
    
}
