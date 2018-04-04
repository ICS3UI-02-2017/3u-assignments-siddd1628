/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/**
 *
 * @author siddd1628
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //  Create a new city 
         City kw = new City();
         
           
        // Create a new robot to put into the city
        RobotSE karel = new RobotSE(kw, 0, 3, Direction.WEST);
        
        // Create a square
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 1, 2, Direction.WEST);
        
        // create an algorithm to make karel go around the square twice
            
        int numberOfMoves = 4;
        while (numberOfMoves > 0) {
            karel.move();
            
          
            
            
        
        
    
// when the front is not clear
        karel.turnLeft(); 

        }
    }
}


