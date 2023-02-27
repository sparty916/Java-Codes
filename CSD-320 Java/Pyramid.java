/*
Pj Ellis
Module 6
Palindrome Pyramid
11/20/2022
 */

/*
Code to have a palidrome pyramid output
*/
public class Pyramid {
    
    public static void main(String[] args){
        //declaring variables
        int i, j, k, rows;
        
        rows = 12;
        
        //outer loop to handle the rows)
        for(i = 0; i <= rows; i++)
        {
            //inner loop to handle spaces
            for(j=0;j<=rows;j++)
                System.out.print("  "); //print spaces
                      
            //inner loop to handle counting UP
            for(k=0;k<=i;k++)     
                System.out.print((int)Math.pow(2,k) + " "); //print values
            
            //inner loop to handle couning back down
            for(k=k-2;k>=0;k--)        
                System.out.print((int)Math.pow(2,k) + " "); //print values
            
            //inner loop to handle adding spaces after numbers before "@"
            for(j=7;j<=rows;j++)
                System.out.print("  "); //print spaces
            
            System.out.println("@"); //add @ to end of line
            rows--;
        }
    }
}