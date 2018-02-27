/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;

/**
 *
 * @author siddd1628
 */
public class ForLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        City helo = new City();
        RobotSE karel = new RobotSE(helo, 0, 1, Direction.EAST);


        // counted while loop
        int numberOfMoves = 5;
        // if there arwe still moves to do
        while (numberOfMoves > 0) {
            karel.move();
            numberOfMoves = numberOfMoves - 1;
        }
        karel.turnAround();

        //counting the other way
        numberOfMoves = 0;
        while (numberOfMoves < 5) {
            karel.move();
            numberOfMoves = numberOfMoves + 1;
        }
        karel.turnAround();
        // use a for loop to move
        for (int count = 0; count < 5; count++) {
            karel.move();
        }

        
        for (int i = 0; i < 10; i++) {
            
        }
        int x = 10;
        x = x +5; // add 5
        x += 5; // adds five
        
        if(karel.frontIsClear()) {
            if(karel.canPickThing())
                karel.move();
        }
    }
    
    if(karel.frontIsClear() && karel.canPickThing
    
        
      
    

