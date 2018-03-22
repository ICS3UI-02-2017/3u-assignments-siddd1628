/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

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
        
        //  Create a new city 
         City kw = new City();

        // Create a new robot to put into the city
        RobotSE karel = new RobotSE(kw, 0, 3, Direction.WEST);
        
        // Place the thi
        new Thing(kw, 1 , 1);
        new Thing(kw, 1 , 1);
        new Thing(kw, 1 , 1);
        new Thing(kw, 1 , 1);
        new Thing(kw, 1 , 1);
        new Thing(kw, 1 , 1);
        new Thing(kw, 1 , 1);
        new Thing(kw, 1 , 1);
        new Thing(kw, 1 , 1);
        new Thing(kw, 1 , 1);
        
        
        
    }
}
