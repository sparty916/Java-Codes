
/* Pj Ellis - Module 5 - ArrayList of Strings
 * Write a program that uses an ArrayList filled with a minimum of 10 Strings. 
 * Use a ‘for-each’ loop to print the ArrayList collection. Then ask a user which 
 * element they would like to see again. Then, attempt printing the element in a 
 * try/catch format which will result in the element being display. If the element
 * value received is invalid, display a message that an Exception has been thrown 
 * displaying “Out of Bounds”. In this program, include the use of Autoboxing/
 * Auto-Unboxing, working with a user String input.
*/

import java.io.*; 
import java.util.*;

public class ArrayListStrings {
    
    public static void main(String[] args)throws IOException {
        
        //create an empty ArrayList
        ArrayList<String> strings = new ArrayList<>(10);
        
        //assign random strings to ArrayList
        for(int i = 0; i < 10; i++) {
            strings.add(RandomString.CreateString(10));
        }//end of for loop
                
        //Display out ArrayList using 'for-each' loop
        System.out.println("The ArrayList consists of: ");
        for(String i : strings) {
            System.out.print(i + " ");
        }//end of for loop
        
        //declare input 
        Scanner input = new Scanner(System.in);
        
        //Ask user to select with element they would like to choose
        System.out.println();
        System.out.println("\nEnter an array index to display it's value: ");
        int indexValue = input.nextInt();
        
        //Display element they chose unless it is "Out of Bounds"
        boolean choice = false;
        
        while (!choice) {
            try {
                System.out.println("\nString from the array index you chose: " + 
                    strings.get(indexValue));
                choice = true;
            }//end of try 
            catch (IndexOutOfBoundsException ex) {
                System.out.println("\n --- Value is 'Out Of Bounds' ---  \nPlease try a "
                        + "different array index: ");
                indexValue = input.nextInt();
            }//end of catch
            
        }//end of while
        
    }//End of Main
    
}//End of Class

//class to create Random Strings for ArrayList
class RandomString {
    
    //define a function to generate a random string of length n
    public static String CreateString(int n){
        
    //chose a Character random from this String
    String options = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvxyz";
        
    //create StringBuffer
    StringBuilder newWord = new StringBuilder(n);
    
    //generating a random string by using a random number to choose a Character
    for ( int y = 0; y < n; y++) {
        int index = (int)(options.length()* Math.random());
        // add that random Character one by one to end of s
        newWord.append(options.charAt(index));
    }//end of for
    
    return newWord.toString();
    }//end of method
        
}//end of class

/* Random String Generator Code adapted from: 
 * https://www.edureka.co/blog/random-number-and-string-generator-in-java/#GeneratingrandomStringinJava
*/
