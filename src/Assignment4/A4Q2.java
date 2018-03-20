/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment4;

import java.util.Scanner;

/**
 *
 * @author siddd1628
 */
public class A4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // enter the primitives
        double HeightInch = 0, HeightCm;
        
        // use a SCANNER to read info
        Scanner input = new Scanner(System.in);
        
        // ask for a measurment to be entered 
        System.out.println("Enter a measurment in inches");
        HeightInch = input.nextDouble();
        input.close();
        // calculate the numbers that have been input 
        HeightCm = HeightInch * 2.54;
        System.out.println("The measurment in cm is " + HeightCm);
        
        
        
    }
}
