/* P.j. Ellis - Module 2 - Recursion - 3/22/2023
 * Program with a recursive method to return a sum of:
 * m(i) = 1/2 + 2/3 + 3/4 + 4/5 + 5/6 … i/(i + 1)
*/

import java.util.Random;

public class RecursionMethod {
    
    //recursive method
    public static double solve(int i) {
        //base case
        if (i == 1)
            return 1.0 / 2;
        //recursive case
        else
            return solve(i - 1) + i * 1.0 / (i + 1);
    }
    
    //main
    public static void main(String[] args) {
        
        //values for testing
        Random rand = new Random();
        int[] values = new int[3];
        for(int i = 0; i < values.length; i++) {
            values[i] = rand.nextInt(50);
        }
        
        //display of results
        for (int i = 0; i < values.length; i++)
        System.out.println("solve(" + values[i] + ") = " + solve(values[i]));
    }    
}
