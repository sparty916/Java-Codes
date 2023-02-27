/*
Pj Ellis
10/28/2022
Module 3 Assignment
Rock Paper Scissors
 */

/*
Write a program that is similar to the popular game titled Rock-Paper-Scissors. 
The program randomly generates the number of 1, 2, or 3 with 1 being Rock, 2 
being Paper, and 3 being Scissors. Then, the program is to prompt the user to 
enter a value of 1, 2, or 3. Next, the program displays a clear readable message 
displaying both the computers selection, the users selection, and the results.
 */

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    //Generate a random integer for the computer of 1, 2, or 3
    int compChoice = (int)(Math.random() * 3 + 1);
    
    //Prompt the user to enter their choice of number 1, 2, or 3
    System.out.print("Rock - 1, Paper - 2, Scissors - 3 \nChoose a number to "
            + "represent your choice: ");
    int userChoice = input.nextInt();
    
    System.out.print("The computer chose ");
    switch (compChoice)
    {
        case 1: System.out.print("rock."); break;
        case 2: System.out.print("paper."); break;
        case 3: System.out.print("scissors."); break;
    }
    
    System.out.print(" You chose ");
    switch (userChoice)
    {
        case 1: System.out.print("rock"); break;
        case 2: System.out.print("paper"); break;
        case 3: System.out.print("scissors"); break;
    }
    
    //Display results of the game
    if (compChoice == userChoice)
        System.out.println(" too. It's A DRAW!");
    else
    {
        boolean win = (userChoice == 1 && compChoice == 3) || 
                (userChoice == 3 && compChoice == 2) || 
                (userChoice == 2 && compChoice == 1);
        if (win)
            System.out.println(".  YOU WON!");
        else
            System.out.println(". Sorry, YOU LOST!");        
    }
}
}
