/*
 * Pj ELlis
 * 11/13/2022
 * Module 5
 * While Loop
 */

/*
 * Write a program that uses a while loop to display the following math operations 
 * both in the smaller to larger order and then the larger to smaller order with 
 * the denominator being 3 through 99.  Ensure your application displays the 
 * mathematical results.
 * 1/3.0 + 1/5.0 + 1/7.0 + ··· + 1/95.0 + 1/97.0 + 1/99.0
 * 1/99.0 + 1/97.0 + 1/95.0 + ··· + 1/7.0 + 1/5.0 + 1/3.0
 */

public class MathWhileLoopB {

      //Declaring my variables
      public static void main(String[] args) {
          double sumA = 0;
          double sumB = 0;
          int i = 1;
          int x = 101;
          
          //while loop to calculate sum in order from smallest to largest
          while (i <= 97){
              sumA += 1.0 / (i + 2);
              i+=2;
          }
          
          //while loop to calcule sum in order from largest to smallest
          while (x >= 5){
              sumB += 1.0 / (x - 2);
              x-=2;
          }
          
          //Show results of equations
          System.out.println("The sum from smallest to largest is " + sumA);
          System.out.println("The sum from largest to smallest is " + sumB);
    }
}
