/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/**
 *Learning how to use the robots.
 * @author siddd1628
 */
public class RobotExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for our robot
        City daniTown = new City();
        
        // put a robot in daniTown
        RobotSE karel = new RobotSE(daniTown, 2, 3, Direction.EAST);
        
        // create a wall
        new Wall(daniTown, 2, 5, Direction.WEST);
        
        // create a thing
        new Thing(daniTown, 2, 4);
        
        // move the robot forward 1 space
        karel.move();
        
        // move the robot n number of spaces
        //karel.move(2);
        // turn the robot to the left
        karel.turnLeft();
        
        //put the letter K on karel
        karel.setLabel("K");
        
        //set the color of the robot
        karel.setColor(Color.PINK);
        
        // pick up the thing
        karel.pickThing();
        
        // move once again
        karel.move();
        
        //put the thing down
        karel.putThing();
        karel.move();
       // ??
        
        
     
    }
}
