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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           //// Create a new city called daniTown
      
        City daniTown = new City();
        
        // Create a new robot to put into the city
        RobotSE karel = new RobotSE(daniTown, 3, 0, Direction.EAST);
        
        // set the color of the robot
        karel.setColor(Color.BLUE);
        
          // Create a new thing
        new Thing(daniTown, 3, 1);
        
      //Create a wall
        new Wall(daniTown, 3, 2, Direction.WEST);
        
         //Create a wall
        new Wall(daniTown, 3, 2, Direction.NORTH);
        
        //Create a wall
        new Wall(daniTown, 2, 3, Direction.WEST);
        
         //Create a wall
        new Wall(daniTown, 1, 3, Direction.WEST);
        
           //Create a wall
        new Wall(daniTown, 1, 3, Direction.NORTH);
        
         //Create a wall
        new Wall(daniTown, 1, 3, Direction.EAST);
        
         //Create a wall
        new Wall(daniTown, 2, 4, Direction.NORTH);
        
          //Create a wall
        new Wall(daniTown, 2, 4, Direction.EAST);
        
         //Create a wall
        new Wall(daniTown, 3, 4, Direction.EAST);
        
         //have karel go forward
        karel.move(1);
        
         // have karel pick up the flag
        karel.pickThing();
        
          // turn karel around
        karel.turnLeft();
        
         //have karel go forward
        karel.move(1);
        
        // turn karel around
        karel.turnRight();
        
        //have karel go forward
        karel.move(1);
        
        // turn karel around
        karel.turnLeft();
        
        //have karel go forward
        karel.move(2);
        
        // turn karel around
        karel.turnRight();
    
         //have karel go forward
        karel.move(1);
        
        // make karel drop the flag he's carrying
        karel.putThing();
        
        //have karel go forward
        karel.move(1);
        
         // turn karel around
        karel.turnRight();
        
         //have karel go forward
        karel.move(1);
        
        // turn karel around
        karel.turnLeft();
        
         //have karel go forward
        karel.move(1);
        
          // turn karel around
        karel.turnRight();
        
         //have karel go forward
        karel.move(2);
        
         // turn karel around
        karel.turnLeft();
        
        
        
        
        
}}
