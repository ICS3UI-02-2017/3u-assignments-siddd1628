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

/**
 *
 * @author siddd1628
 */
public class ConditionsExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kitchenerwaterlooo = new City();

        // Create a new robot to put into the city
        RobotSE karel = new RobotSE(kitchenerwaterlooo, 2, 1, Direction.EAST);

        //Create a wall
        new Wall(kitchenerwaterlooo, 2, 5, Direction.EAST);

        // Create a new thing
        new Thing(kitchenerwaterlooo, 2, 2);

        // Create a new thing
        new Thing(kitchenerwaterlooo, 2, 4);


        // move untill front is not clear
        while (karel.frontIsClear()) {
            // if the front is clear do this thing
            karel.move();
            // is there something to pick up
            if (karel.canPickThing()) {
                karel.pickThing();
            }
        }
        // when the front is not clear
        karel.turnRight();

        // do you have 1 thing in your backpack
        if(karel.countThingsInBackpack()==1){
            
            karel.move();
    }else if (karel.countThingsInBackpack()==2){
        karel.move(2);
        
    }else{
        karel.turnAround();
    }
        
        { 
    }

