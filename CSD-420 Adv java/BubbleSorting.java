/* pj ellis - module 06 - sorting - 4/16/2023
 * Write and test a program with the two generic methods using a bubble sort. 
 * The first method sorts the elements using the Comparable interface, and the 
 * second uses the Comparator interface.
 * Write test code that ensures code functions correctly.
*/

import java.util.*;

public class BubbleSorting {
    
    public static <E extends Comparable<E>> void bubbleSort(E[] list) {
        boolean nextPassNeeded = true;
        for (int k = 1; k < list.length && nextPassNeeded; k++) {
            nextPassNeeded = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i].compareTo(list[i + 1]) > 0) {
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    nextPassNeeded = true;
                }
            }
        }
    }

    public static <E> void bubbleSort(E[] list, Comparator<? super E> comparator) {
        boolean nextPassNeeded = true;
        for (int k = 1; k < list.length && nextPassNeeded; k++) {
            nextPassNeeded = false;
            for (int i = 0; i < list.length - k; i++) {
                if (comparator.compare(list[i], list[i + 1]) > 0) {
                    E temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    nextPassNeeded = true;
                }
            }
        }
    }
    
    //testing method code
    public static void main(String[] args) {
        
        Integer[] intArray = {8, 5, 9, -2, 0, 100, 7};
        Double[] doubleArray = {3.4, 1.3, -22.1, 14.8, 6.0, 2.3, 12.2};
        String[] strArray = {"zebra", "elephant", "mouse", "horse", "donkey"};
        Character[] charArray = {'x', 'n', 'd', '>', '&', '?'};
        
        System.out.println("-- bubbleSort(E[] list) --");
        System.out.println("Original Arrays");
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(strArray));
        System.out.println(Arrays.toString(charArray));
        
        bubbleSort(intArray);
        bubbleSort(doubleArray);
        bubbleSort(strArray);
        bubbleSort(charArray);
        
        System.out.println("\nAfter sorting:");
        printList(intArray);
        printList(doubleArray);
        printList(strArray);
        printList(charArray);
        
        Integer[] intArray2 = {500, -200, 6, 2, 10, -25};
        Double[] doubleArray2 = {324.4, -41.3, 2.1, 17.2, 9.0, 2.13, -1.2};
        String[] strArray2 = {"Whale", "dolphin", "Fish", "turtle", "shark"};
        Character[] charArray2 = {'X', 'n', 'd', '<', 'G', '&', '!'};
        
        System.out.println("\n-- bubbleSort(E[] list, Comparator) --");        
        System.out.println("Original Arrays");
        System.out.println(Arrays.toString(intArray2));
        System.out.println(Arrays.toString(doubleArray2));
        System.out.println(Arrays.toString(strArray2));
        System.out.println(Arrays.toString(charArray2));
        
        Comparator <Integer> com1 = (a1, a2) -> a1.compareTo(a2);
        Comparator <Double> com2 = (a1, a2) -> a1.compareTo(a2);
        Comparator <String> com3 = (a1, a2) -> a1.compareTo(a2);
        Comparator <Character> com4 = (a1, a2) -> a1.compareTo(a2);
        
        bubbleSort(intArray2, com1);
        bubbleSort(doubleArray2, com2);
        bubbleSort(strArray2, com3);
        bubbleSort(charArray2, com4);
        
        System.out.println("\nAfter sorting using a1.compareTo(a2):");
        printList(intArray2);
        printList(doubleArray2);
        printList(strArray2);
        printList(charArray2);
        
        System.out.println("\nSorting Strings of different cases using "
                + "a1.compareToIgnoreCase(a2): ");
        bubbleSort(strArray2, (a1, a2) -> a1.compareToIgnoreCase(a2));
        printList(strArray2);
        
        System.out.println("\nSorting Integers and Doubles in reverse order "
                + "using a2.compareTo(a1):");
        bubbleSort(intArray2, (a1, a2) -> a2.compareTo(a1));
        bubbleSort(doubleArray2, (a1, a2) -> a2.compareTo(a1));
        printList(intArray2);
        printList(doubleArray2);
    }
    
    //print array method
    public static void printList(Object[] list) {
        for (Object list1 : list) {
            System.out.print(list1 + " ");
        }
        System.out.println();
    }
}
