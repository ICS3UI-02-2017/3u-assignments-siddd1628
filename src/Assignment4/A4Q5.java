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
       double firsttest = input.nextDouble();
       System.out.print("What mark did you get?");
       double firsttestmark = input.nextDouble();
            
       System.out.print("What was the second test out of?");
       double secondtest = input.nextDouble();
       System.out.print("What mark did you get?");
       double secondtestmark = input.nextDouble();
       
       System.out.print("What was the third test out of?");
       double thirdtest = input.nextDouble();
       System.out.print("What mark did you get?");
       double thirdtestmark = input.nextDouble();
       
       System.out.print("What was the fourth test out of?");
       double fourthtest = input.nextDouble();
       System.out.print("What mark did you get?");
       double fourthtestmark = input.nextDouble();
       
       System.out.print("What was the fifth test out of?");
       double fifthtest = input.nextDouble();
       System.out.print("What mark did you get?");
       double fifthtestmark = input.nextDouble();
           
        // calculate the numbers that have been input 
      double firsttestresult = firsttest / firsttestmark; 
        System.out.println("Test results for " + name);
        System.out.println("Test 1 " + firsttestresult);
        double secondtestresult = secondtest / secondtestmark;
        System.out.println("Test 2 " + secondtestresult);
        double thirdtestresult = thirdtest / thirdtestmark;
        System.out.println("Test 3 " + thirdtestresult);
        double fourthtestresult = fourthtest / fourthtestmark ; 
        System.out.println("Test 4 " + fourthtestresult);
        double fifthtestresult = fifthtest / fifthtestmark;
        System.out.println("Test 5 " + fifthtestresult);
        double sum = firsttestresult + secondtestresult + thirdtestresult + fourthtestresult + fifthtestresult;
        double average = sum / 5;
        System.out.println("The average is: " + average);
        
        
        
    }
}
