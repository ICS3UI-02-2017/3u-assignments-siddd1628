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
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         // scanner for input
        Scanner input = new Scanner(System.in);  
        
        // make an array to store expenses
        double[] expenses = new double[6];
        // array to store expense names
        String[] names = {"food", 
                            "DJ", 
                   "hall rental", 
                   "decorations", 
                         "staff",  
                           "misc."};
        
        
        // let the user know to get the costs
        System.out.println("Please enter the six costs for prom");
        // use a for loop for input
        for(int i = 0; i < expenses.length; i++){
            // get the name of the expense
            String costName = names[i];
            // ask them for that expense
            System.out.println("How much did " + costName + " cost?");
            expenses[i] = input.nextDouble();
        }
        
        // adding all the expenses
        double sum = 0;
        for (int i = 0; i < expenses.length; i++) {
            // get the expense
            double expense = expenses[i];
            // add it to the sum
            sum = sum + expense;
        }
               
        // output stuff
        System.out.println("Prom costs"
                + " " + sum);
        // take the sum, divide by 35, always round up
        double ticketsNeeded = Math.ceil(sum/35);
        System.out.println("Need to sell " + ticketsNeeded + " tickets");
        
    }
}
