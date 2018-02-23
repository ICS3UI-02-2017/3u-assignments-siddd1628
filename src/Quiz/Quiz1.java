/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author siddd1628
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //  Create a new city 
         City dstown = new City();
         
         // Create a new robot to pick up the lights
        RobotSE karel = new RobotSE(dstown, 4, -1, Direction.EAST);
         
        // create a staircase in the city with walls
         new Wall (dstown , 4, 1, Direction.WEST);
         new Wall (dstown , 4, 1, Direction.NORTH);
         new Wall (dstown , 3, 2, Direction.WEST);
         new Wall (dstown , 3, 2, Direction.NORTH);
         new Wall (dstown , 2, 3, Direction.WEST);
         new Wall (dstown , 2, 3, Direction.NORTH);
         new Wall (dstown , 2, 4, Direction.NORTH);
         new Wall (dstown , 2, 4, Direction.EAST);
         new Wall (dstown , 3, 5, Direction.NORTH);
         new Wall (dstown , 3, 5, Direction.EAST);
         new Wall (dstown , 4, 6, Direction.NORTH);
         new Wall (dstown , 4, 6, Direction.EAST);
         
         // place lights along the staircase
         new Thing (dstown, 3, 1);
         new Thing (dstown, 2, 2);
         new Thing (dstown, 4, 0);
         new Thing (dstown, 1, 3);
         
         // move karel forward to pick up the lights
         karel.move(1);
         
         // make karel pick up the lights
         karel.pickThing();
         
         karel.turnLeft();
         karel.move(1);
         karel.turnRight();
         karel.move(1);
         karel.pickThing();
         karel.turnLeft();
         karel.move(1);
         karel.turnRight();
         karel.move(1);
         karel.pickThing(); 
          karel.turnLeft();
         karel.move(1);
         karel.turnRight();
         karel.move(1);
         karel.pickThing(); 
         karel.move(1);
         
         // place down all the lights in the correct spots
         karel.putThing();
         karel.move(1);
         karel.turnRight();
         karel.move(1);
         karel.putThing();
         karel.turnLeft();
         karel.move(1);
         karel.turnRight();
         karel.move(1);
         karel.putThing();
         karel.turnLeft();
         karel.move(1);
         karel.turnRight();
         karel.move(1);
         karel.putThing();
         karel.turnLeft();
         karel.move(1);
       
         
        
    }
}
