/* Pj Ellis - Module 4 - ArrayListTest
 * Create a class <yourName>ArrayListTest
 * This class is to contain:
 * A method that receives an ArrayList populated with an Integer data type 
 * holding the integers received from user input.
 * The user input is to accept Integers that are then assigned to the ArrayList 
 * until a value of 0 is entered, which is also assigned to the ArrayList.
 * The ArrayList is then to be sent to the method.
 * The method is then to return the largest value in the ArrayList.
 * If the ArrayList is sent in empty, the method will then return 0.
 * The method signature is to be: public static Integer max (ArrayList list).
 * Write additional code for testing your method.
 * The method will return the largest value that is displayed to the user.
*/
import java.util.*;

public class PjArrayListTest {
    
    public static void main(String[] args){
        //create an empty list
        ArrayList<Integer> list = new ArrayList<>();
        
        //ask user for input of integers
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter some integers for the ArrayList\n"
                + "(input ends when you enter 0): ");
        
        /*
         * the user input is to accept Integers that are then assigned to the ArrayList 
         * until a value of 0 is entered, which is also assigned to the ArrayList.
        */
        while (true) {
            int value = userInput.nextInt();
            list.add(value);
                         
            if (value == 0) {
                break;
            }
        }
                
        // Display the ArrayList and the maximum number
        System.out.println("Intergers entered into ArrayList: " + list);
        System.out.println("The largest number entered is: " + max(list));
                
    } //End of Main
    
    public static Integer max (ArrayList<Integer> list) {
        
        //if the ArrayList is sent in empty, the method will then return 0
        if (list == null || list.isEmpty())
            return 0;
        
        //return the largest value in the ArrayList
        int result = list.get(0);
        for (int i = 1; i < list.size(); i++)
            if (result < list.get(i))
                result = list.get(i);
         
        return result;
    } //End of method
    
} //End of Public Class
