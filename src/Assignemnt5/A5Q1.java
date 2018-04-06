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
      


        Scanner scan = new Scanner(System.in);
        System.out.println("type in a phrase you would like to convert to Ubbi Dubbi");

        String phrase = scan.nextLine();
        StringBuilder result = new StringBuilder();
        boolean prevVowel = false; //is our vowel part of a cluster?

        for (int i = 0; i < phrase.length(); i++) {
        if (isVowel(phrase.charAt(i))) {
            if(prevVowel==false)
                result.append("ub");

            prevVowel=true;
        }
        else
            prevVowel=false;
        result.append(phrase.charAt(i)); //should be added anyway

        }
        System.out.println(result);    

                
            
            
            }
            
            
}
