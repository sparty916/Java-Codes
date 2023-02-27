/* Pj Ellis - Module 9 - Array Assignment
 * 12/4/2022
 * Write a program that reads and fills an array with 20 integers. 
 * Then, using the array elements, calculate the data to find and display:
 * 1- The highest value entered.
 * 2- The lowest value entered.
 * 3- The average of the numbers entered.
 * 4- The sum of the numbers entered.
 * Display this information in a readable display making the data easy to understand.
 */

import java.util.Random; //to get random numbers for the program to input

public class ArrayDemo {
    
    public static void main(String[] args) {
        
        //declare and initailize my array
        int[] myArray = new int[20];
        
        //assign random numbers to myArray
        Random rand = new Random();
        int upper = 100;
        for(int i = 0; i < myArray.length; i++) {
            myArray[i] = rand.nextInt(upper);
        }//end of for loop
        
        //find the highest value entered
        int max = myArray[0];
        for(int i = 1; i < myArray.length; i++) {
            if(myArray[i] > max) max = myArray[i];
        }//end of for loop
        
        //find the lowest value entered
        int min = myArray[0];
        for(int i = 1; i < myArray.length; i++) {
            if(myArray[i] < min) min = myArray[i];
        }//end of for loop
        
        //find the average of the values entered
        double sum1 = 0;
        for(int i = 0; i < myArray.length; i++) {
            sum1 += myArray[i];
        }
        double avg = sum1 / myArray.length;
        
        //find the sum of the values entered
        int sum2 = 0;
        for(int i = 0; i < myArray.length; i++) {
            sum2 += myArray[i];
        }//end of for loop
        
        /* Display this information in a readable display
         * making the data easy to understand
        */
        
        //Display all values entered
        System.out.println("The random values enetered are as follows:");
        for(int i = 0; i < myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }//end of for loop
        
        // Display highest value
        System.out.println();
        System.out.println("\nThe highest value entered was: " + max);
        
        //Display the lowest value
        System.out.println("The lowest value entered was: " + min);
        
        //Display the average of all the values entered
        System.out.println("The average of all values entered is: " + avg);
        
        //Display the sum of all numbers entered
        System.out.println("The sum of all values entered is: " + sum2);        
    }//end of main
}//end of class
