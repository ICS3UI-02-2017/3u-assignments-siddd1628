/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author siddd1628
 */
public class InpuitOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // print a line of text
            System.out.println("Hello World");
            System.out.println("Another Line!");
            // print a blank line
            System.out.print("I Like ");
            System.out.println("cake!");
            
            // special characters
            // quaotation mark
            System.out.println("\"I'm inside quotation marks\"");
            
            //slash \\
            System.out.println("A slash \\");
            // a tab \t
            System.out.println("pop\tpizaa\tfries");
            
            // a new line \n
            System.out.println("One Line\nSecond Line");
            
            // make an integer storing 10
            int number = 10;
            System.out.println(number);
            System.out.println("number = " + number);
            System.out.println("number =" + number + ".YAY!");
            
            // use a SCANNER to read info
            Scanner input = new Scanner(System.in);
            
            System.out.println("Please enter your name");
            
            //make a String to store a name
            String name = input.nextLine() ;
            
            //say hello
           System.out.println(" Hello " + name); 
           
           System.out.println("What year were you born?");
           
           // make a variable to store the year
           int birthYear = input.nextInt();
           int age = 2018 - birthYear;
           
           // tell the user
           System.out.println("You are " + age + " years old!");
           
           if(age < 30) {
               System.out.println("YEET");
           }else if(age > 30){
           }
           

            
    }
}
