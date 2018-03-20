/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.newpackage;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

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
         City daniTown = new City();
        
        // Create a new robot to put into the city
        RobotSE karel = new RobotSE(daniTown, 0, 0, Direction.SOUTH);
        
          // set the color of the robot
        karel.setColor(Color.BLUE);
        
         // Create a new robot to put into the city
        RobotSE susan = new RobotSE(daniTown, 0, 1, Direction.SOUTH);
        
          // set the color of the robot
        susan.setColor(Color.PINK);
        
        //Create a wall
        new Wall(daniTown, 1, 1, Direction.WEST);
        
        //Create a wall
        new Wall(daniTown, 0, 1, Direction.WEST);
        
         //Create a wall
        new Wall(daniTown, 1, 1, Direction.SOUTH);
        
         //have karel go forward
        karel.move(2);
        
         //have susan go forward
        susan.move(1);
        
          // turn susan around
        susan.turnLeft();
        
        //have susan go forward
        susan.move(1);
        
          // turn susan around
        susan.turnRight();
        
         // turn karel around
        karel.turnLeft();
        
         //have susan go forward
        susan.move(1);
        
          // turn susan around
        susan.turnRight();
        
          //have susan go forward
        susan.move(1);
        
          //have karel go forward
        karel.move(1);
        
         

    }
}
