/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment2;

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
        RobotSE karel = new RobotSE(kw, 0, 0, Direction.EAST);
        
    
         new Thing(kw, 0, 1);
         new Thing(kw, 0, 2);
         new Thing(kw, 0, 3);
         new Thing(kw, 0, 4);
         new Thing(kw, 0, 5);
         new Thing(kw, 0, 6);
         new Thing(kw, 0, 7);
         new Thing(kw, 0, 8);
         new Thing (kw, 0, 9);
         new Thing (kw, 0, 10);
         
         // create an algorithm that will make karel walk forward and pick up the things
       
            if(karel.countThingsInBackpack()==0){
            
            karel.move();
            karel.pickThing();
            
            if(karel.countThingsInBackpack()==1){
                 
            karel.move();
            karel.pickThing();
            if(karel.countThingsInBackpack()==2){
            
            karel.move();
            karel.pickThing();
            
             if(karel.countThingsInBackpack()==3){
            
            karel.move();
            karel.pickThing();
            
            if(karel.countThingsInBackpack()==4){
            
            karel.move();
            karel.pickThing();
            
             if(karel.countThingsInBackpack()==5){
            
            karel.move();
            karel.pickThing();
            
             if(karel.countThingsInBackpack()==6){
            
            karel.move();
            karel.pickThing();
            
           karel.move(4);
            
             }
         
         
         
        
    }
}
