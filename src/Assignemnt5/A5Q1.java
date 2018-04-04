/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignemnt5;

import java.util.Scanner;

/**
 *
 * @author siddd1628
 */
public class A5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Enter a word to translate");
        String origWord = input.nextLine(); 
            //santiize the input
            origWord = origWord.toLowerCase();
            if(origWord.startsWith("a") || origWord.startsWith("i") || origWord.startsWith("o") || origWord.startsWith("u") || origWord.startsWith("e")) {
    }
}
