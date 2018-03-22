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
public class A4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // use a SCANNER to read info
            Scanner sc = new Scanner(System.in);
        // ask for the numbers to be entered
            System.out.print("Please enter four numbers: ");

        // hae all the numbers entered and placed on seperate lines
            int a = sc.nextInt(); 
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
        // output all the numbers on the same line
            System.out.println("Your numbers were: " + a + "," + b + "," + c + "," + d); 
}
    }

