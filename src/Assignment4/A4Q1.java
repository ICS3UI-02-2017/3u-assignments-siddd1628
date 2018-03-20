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
public class A4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // use a SCANNER to read info
        Scanner input = new Scanner(System.in);
            
        // program to ask for the persons name
        System.out.println("Please enter your name");
        
        //make a String to store a name
        String name = input.nextLine();
            
        //Ask how they are today
        System.out.println(" Hello " + name + ". How are you today? "); 
            
    }
}
