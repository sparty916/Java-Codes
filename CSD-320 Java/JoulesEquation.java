/*
* PJ Ellis
* 10/25/2022
* Module 2 - Joules Equation
 */

import java.util.Scanner; // inport the use of Scanner for inputs

public class JoulesEquation {
    //Equation to determine Joules required to heat water
    public static void main(String[] args) {
        //Create a Scanner Object
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter input data
        System.out.print("Enter amount of water in kilograms: ");
        double waterMass = input.nextDouble();
        System.out.print("Enter the intial temperature of water in Celcius: ");
        double initTemp = input.nextDouble();
        System.out.print("Enter the final temperature of water in Celcius: ");
        double finalTemp = input.nextDouble();
        
        //Compute Jules Equation
        double joules = waterMass * (finalTemp - initTemp) * 4184;
        
        //Display results
        System.out.println("The amount of Joules required to heat " + waterMass 
        + "kg of water from " + initTemp + " degrees Celcius to " + finalTemp + 
        " degrees Celcius is " + joules + " Joules.");
    }
}