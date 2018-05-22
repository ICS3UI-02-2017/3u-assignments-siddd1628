/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment7;

import java.util.Scanner;

/**
 *
 * @author siddd1628
 */
public class A7Q1 {

    /**
     * @param args the command line arguments
     */
    
       
       public static double circleArea() {
        // TODO code application logic here
        
        //create a scanner to scan the information that is input
        Scanner input = new Scanner(System.in);
        
        // create a double that will store the radius 
        double radius = input.nextDouble();
        // create another double that will store the calculated number
        double answer = 3.14 * (Math.pow(radius,2)); 
        // return the answer double
        return answer; 
    }
        
   
        public static void main(String[] args) {
            // ask for the radius
            System.out.println("What is the radius?");
            circleArea();
            System.out.println("The are of the circle is" + circleArea());
        }
    }


                    
            
        
         
    

