/*
* Pj Ellis
* 11/2/2022
* Module 4 - Strings and Substrings
 */

import java.util.Scanner; //inport use scanner for inpute

public class StringSubstring {
    /* 
    * Write a program that prompts a user to enter two strings and then checks
    * the strings entered and reports if either the first string is a substring 
    * of the second string, or if the second string is a substring of the first string.
    */
    
    public static void main(String[] args) {
        //create scanner input
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter strings
        System.out.print("Enter string s1: ");
        String s1 = input.nextLine();
    
        System.out.print("Enter string s2: ");
        String s2 = input.nextLine();
    
        //If/Else to determine if s1 contains s2 and vice versa and display results
        if (s2.indexOf(s1) != -1) {
          System.out.println(s1 + " is a substring of " + s2);
        }
        else {
          System.out.println(s1 + " is not a substring of " + s2);
        }
    
        if (s1.indexOf(s2) != -1) {
          System.out.println(s2 + " is a substring of " + s1);
        }
        else {
          System.out.println(s2 + " is not a substring of " + s1);
        }
  }
}
