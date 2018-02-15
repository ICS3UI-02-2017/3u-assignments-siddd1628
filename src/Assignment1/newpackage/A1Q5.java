/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.newpackage;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *
 * @author siddd1628
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //  Create a new city 
         City dstown = new City();
        
        // Create a new robot to put into the city
        RobotSE karel = new RobotSE(dstown, 0, 1, Direction.WEST);
        
          // set the color of the robot
        karel.setColor(Color.BLUE);
        
        // place a label on tina
        karel.setLabel("Karel");
         // Create a new robot to put into the city
        RobotSE maria = new RobotSE(dstown, 3, 3, Direction.EAST);
        
          // set the color of the robot
        maria.setColor(Color.RED);
         
        // place a label on tina
        maria.setLabel("Maria");
        
          //Create a wall
        new Wall(dstown, 2, 3, Direction.WEST);
        
        //Create a wall
        new Wall(dstown, 2, 3, Direction.NORTH);
        
        //Create a wall
        new Wall(dstown, 2, 3, Direction.EAST);
        
           //Create a wall
        new Wall(dstown, 3, 3, Direction.EAST);
        
           //Create a wall
        new Wall(dstown, 3, 3, Direction.SOUTH);
        
        // Place karel's dropped groceries
         new Thing(dstown, 0, 0);
         
         // Place karel's dropped groceries
         new Thing(dstown, 1, 0);
         
         // Place karel's dropped groceries
         new Thing(dstown, 1, 1);
         
         // Place karel's dropped groceries
         new Thing(dstown, 1, 2);
         
         // Place karel's dropped groceries
         new Thing(dstown, 2, 2);
         
          // have maria turn around
        maria.turnLeft();
        
         // have maria turn around
        maria.turnLeft();
       
        //have karel go forward
        karel.move(1);
        
         // have karel pick up the thing
        karel.pickThing();
        
        // have karel turn around
        karel.turnLeft();
        
        // have maria move forward
        maria.move(1);
        
        // have maria turn right
        maria.turnRight();
        
          // have maria move forward
        maria.move(1);
        
         // have maria pick up the thing
        maria.pickThing();
        
        // have maria move forward
        maria.move(1);
        
        // have maria pick up the thing
        maria.pickThing();
        
          // have maria turn left
        maria.turnLeft();
        
        

         
        

        
    }
}
