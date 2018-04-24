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
public class NewMain1 {
    
     // The hello world method to say hello
    public static void helloWorld() { 
        System.out.println("Hello world!");
    }
    public static void sayHello(String name){
        System.out.println("Hello" + name);
    }
    // calculate the positive root of quadratic formula 
    public static double [] QuadFormula(double a, double b, double c) {
        // create the array to store both roots
        double[] roots = new double [2];
        //calcualte the roots
        
            double discrim = b*b - 4*a*c;
            roots[0] = (-b + Math.sqrt(discrim))/(2*a);
            roots[1] = (-b + Math.sqrt(discrim))/(2*a);
            //send back the root 
            return roots;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
        // call the helloWorld method 
        helloWorld();
        
        
        System.out.println("What is your name?");
        String user = in.nextLine();
        sayHello(user); 
        
        // calculate the root of 3x^2+7x+1.5
        double proot = posQuadFormula(1,-5,-50);
        System.out.println("The positive root is " + proot);
        
        double[] roots = QuadFormula(1,-5,-50);
        System.out.println("The roots are" + roots[0] + " and " + roots[1]);
    }
}
