/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment1.newpackage;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
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
        
         City daniTown = new City();
        
        // Create a new robot to put into the city
        RobotSE karel = new RobotSE(daniTown, 0, 0, Direction.SOUTH);
        
        //Create a wall
        new Wall(daniTown, 1, 1, Direction.WEST);
        
        //Create a wall
        new Wall(daniTown, 0, 1, Direction.WEST);
        
         //Create a wall
        new Wall(daniTown, 0, 1, Direction.NORTH);
    }
}
