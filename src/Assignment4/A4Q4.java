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
public class A4Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //create a scanner to read information
        Scanner input = new Scanner(System.in);
       
        //Ask for all the amounts of money spent on thing
        System.out.print("How much does the food for prom cost?");
       int promfood = input.nextInt();
       
       System.out.print("How much does the food for dj cost?");
       int dj = input.nextInt();
       
       System.out.print("How much does the hall for prom cost?");
       int hall = input.nextInt();
       
       System.out.print("How much does the decorations for prom cost?");
       int decor = input.nextInt();
       
       System.out.print("How much does the staff for prom cost?");
       int staff = input.nextInt();
       
       System.out.print("How much do the misc items for prom cost?");
       int misc = input.nextInt();
       // add all the costs together
       int cost;
       cost = promfood + dj + hall + decor + staff + misc;
        System.out.println("The sum is: " + cost);
        // dividethe cost by 35 to see how many tickets would be needed to break even
        int ticket;
        ticket = cost / 35;
         System.out.println("You will need " + ticket + " tickets to break even");

    }
}
