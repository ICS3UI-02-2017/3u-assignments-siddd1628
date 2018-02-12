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

/**
 * Demonstrate how to use robots 
 * @author siddd1628
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //// Create a new city called daniTown
        City daniTown = new City();
        
        // Create a new robot to put into the city
        RobotSE karel = new RobotSE(daniTown, 2, 3, Direction.EAST);
        
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
     
    }
}
