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
public class A4Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // use a SCANNER to read info
            Scanner input = new Scanner(System.in);
        // ask for the numbers to be entered
            System.out.print("Please enter your name ");
            String name = input.nextLine() ;
            System.out.print("What was the first test out of?");
       int firsttest = input.nextInt();
       System.out.print("What mark did you get?");
       int firsttestmark = input.nextInt();
            
       System.out.print("What was the second test out of?");
       int secondtest = input.nextInt();
       System.out.print("What mark did you get?");
       int secondtestmark = input.nextInt();
       
       System.out.print("What was the third test out of?");
       int thirdtest = input.nextInt();
       System.out.print("What mark did you get?");
       int thirdtestmark = input.nextInt();
       
       System.out.print("What was the fourth test out of?");
       int fourthtest = input.nextInt();
       System.out.print("What mark did you get?");
       int fourthtestmark = input.nextInt();
       
       System.out.print("What was the fifth test out of?");
       int fifthtest = input.nextInt();
       System.out.print("What mark did you get?");
       int fifthtestmark = input.nextInt();
       
        System.out.println("Test scores for " + name);
        
        int firstresult = firsttestmark / firsttest ;
        
        System.out.println("Test 1:" +  );
    }
}
