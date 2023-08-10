/* Pj Ellis - Module 3 - Generics - 3/29/2023
 * Write a program that contains a static method that returns a new ArrayList 
 * with no duplicates from the original ArrayList.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class DuplicateRemoval {

    public static void main(String[] args) {
        
        //Fill Original Array with 50 random values between 1-20
        int randInt;
        Random rand = new Random();
        ArrayList<Integer> orgList = new ArrayList<>();
        for (int i = 0; i<50; i++) {
            randInt = rand.nextInt(20) + 1;
            orgList.add(randInt);
        }
        
        //Display out original and new arrays
        System.out.println("Original Array: \n" + orgList);
        System.out.println("Array with Duplicates Removed: \n" + removeDuplicates(orgList));
        System.out.println("\n-- SORTED ARRAYS FOR EASIER COMPARISON --\n");
        Collections.sort(orgList);
        System.out.println("Original Array Sorted: \n" + orgList);
        System.out.println("Sorted Array with Duplicates Removed: \n" + removeDuplicates(orgList));
    }
    
    //Generics Method
    public static <E>ArrayList<E> removeDuplicates(ArrayList<E> list) {
        ArrayList<E> noDupList = new ArrayList<>();
        for (int i = 0; i <list.size(); i++) {
            if (!noDupList.contains(list.get(i))) {
                noDupList.add(list.get(i));
            }
        }        
        return noDupList;
    }    
}
