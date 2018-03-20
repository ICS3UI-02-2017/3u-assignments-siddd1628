/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.newpackage;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Wall;
import java.awt.Color;

/**
 * Demonstrate how to use robots 
 * @author siddd1628
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //// Create a new city called daniTown
        City daniTown = new City();
        
        // Create a new robot to put into the city
        RobotSE karel = new RobotSE(daniTown, 2, 3, Direction.EAST);
        
        // put the letter K on karel
        karel.setLabel("DS");
        
        // set the color of the robot
        karel.setColor(Color.YELLOW);
        
        //Create a wall
        new Wall(daniTown, 3, 4, Direction.WEST);
        
        //Create another wall
        new Wall(daniTown, 4, 4, Direction.WEST);
        
        //Create another wall
        new Wall(daniTown, 3, 4, Direction.NORTH);
        
        //Create another wall
        new Wall(daniTown, 3, 5, Direction.NORTH);
        
        //Create another wall
        new Wall(daniTown, 3, 5, Direction.EAST);
        
        //Create another wall
        new Wall(daniTown, 4, 5, Direction.EAST);
        
         //Create another wall
        new Wall(daniTown, 4, 5, Direction.SOUTH);
        
         //Create another wall
        new Wall(daniTown, 4, 4, Direction.SOUTH);
        
        //have karel move
        karel.turnRight();
        
        //have karel go forward
        karel.move(3);
        
        //have karel move
        karel.turnLeft();
        
        //have karel move
        karel.move(3);
        
        //have karel turn
        karel.turnLeft();
        
        //have karel move
        karel.move(3);
        
        //have karel turn
        karel.turnLeft();
        
        //have karel move
        karel.move(3);
    }
}
