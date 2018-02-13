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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //// Create a new city called daniTown
        City daniTown = new City();
        
        // Create a new robot to put into the city
        RobotSE karel = new RobotSE(daniTown, 2, 4, Direction.SOUTH);
        
        // Create a new thing
        new Thing(daniTown, 3, 4);
      
        // put the letter K on karel
        karel.setLabel("DS");
        
        // set the color of the robot
        karel.setColor(Color.YELLOW);
        
        //Create a wall
        new Wall(daniTown, 2, 3, Direction.WEST);
        
         //Create a wall
        new Wall(daniTown, 3, 3, Direction.WEST);
        
         //Create a wall
        new Wall(daniTown, 3, 3, Direction.SOUTH);
        
               //Create a wall
        new Wall(daniTown, 2, 4, Direction.SOUTH);
        
               //Create a wall
        new Wall(daniTown, 2, 4, Direction.EAST);
        
               //Create a wall
        new Wall(daniTown, 2, 3, Direction.NORTH);
        
            //Create a wall
        new Wall(daniTown, 2, 4, Direction.NORTH);
        
       // turn karel around
        karel.turnRight();
        
        //move karel forward
        karel.move(1);
        
        // turn karel around
        karel.turnLeft();
        
        // move karel forward
        karel.move(1);
        
        // turn karel around
        karel.turnLeft();
        
        // move karel forward
        karel.move(1);
        
         // have karel pick up the thing
        karel.pickThing();
        
        // turn karel around
        karel.turnLeft();
        
        // turn karel around
        karel.turnLeft();
        
        // move karel forward
        karel.move(1);
        
        // turn karel around
        karel.turnRight();
        
        // move karel forward
        karel.move(1);
        
        // turn karel around
        karel.turnRight();
        
        // move karel forward
        karel.move(1);
        
        // turn karel around
        karel.turnRight();
        
        // make karel drop the thing he's carrying
        karel.putThing();


    }
}
