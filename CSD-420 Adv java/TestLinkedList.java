/* Pj Ellis - Module 4 - LinkedList Test - 4/2/2023
 * Write a test program that stores 50,000 integers in LinkedList and test the 
 * time to traverse the list using an iterator vs. using the get(index) method.
 * Test again with 500,000 integers.  Explain results in comments
*/

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinkedList {
    
    public static void main(String[] args) {
        LinkedList<Integer> listA = new LinkedList<>();
        for (int i = 0; i <50000; i++) {
            listA.add(i);
        }
        
        LinkedList<Integer> listB = new LinkedList<>();
        for (int j = 0; j <500000; j++) {
            listB.add(j);
        }
        
        System.out.println("-- COMMENCE TESTING --\n");
        
        System.out.println("Starting Iterator Test for LinkedList 50,000");
        double timeA1 = iteratorTest(listA);
        System.out.println("Iterator Test completed in " + timeA1 + " seconds.\n");
        //average time after 5 runs was .0218 seconds
        
        System.out.println("Starting Get Method Test for LinkedList 50,000");
        double timeA2 = getMethodTest(listA);
        System.out.println("Get Method Test completed in " + timeA2 + "seconds.\n");
        //average time after 5 runs was 1.164 seconds
        
        System.out.println("Starting Iterator Test for LinkedList 500,000");
        double timeB1 = iteratorTest(listB);
        System.out.println("Iterator Test completed in " + timeB1 + " seconds.\n");
        //average time after 5 runs was .0032 seconds
        
        System.out.println("Starting Get Method Test for LinkedList 500,000");
        double timeB2 = getMethodTest(listB);
        System.out.println("Get Method Test completed in " + timeB2 + "seconds.\n");
        //average time after 5 runs was 303.8884 seconds
        
        System.out.println("\n-- TESTING COMPLETE --");
        
        /* Using an iterator, you get to traverse the entire collection and 
         * return the elements stored in the list.  When iterating thru the 
         * collection it is quicker for an LinkedList to just read thru the list 
         * and return the value of the elements.  However, due to the LinkedLists 
         * storage structure of storing the location of the previous and next 
         * node, when you use the get() method in a LinkedList, it has to start 
         * at the beginning until it finds the correct pointer to find the 
         * reference to the element at a certain location.  This takes up more 
         * time which is why the get() method takes longer and longer the more 
         * elements there are in the LinkedList.  While Iterating, we see if the 
         * list hasNext(), if true, we read next().  When we get(), and subsequently 
         * change the value of ‘i’ in get(i), it has to start at 0 and work its 
         * way thru all the elements until it reaches the element we are searching 
         * for.  So, each for loop keeps adding more and more to the process. 
         * 0 / 0, 1 / 0, 1, 2 / 0, 1, 2, 3 … / 0, 1, 2 …, 499999, 500000.
        */        
    }
    
    static double iteratorTest(LinkedList<Integer> list) {
        Iterator<Integer> listIter = list.iterator();
        long startTime = System.currentTimeMillis();
        while (listIter.hasNext()) {
            Integer i = listIter.next();
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        
        return time/1000.00;
    }
    
    static double getMethodTest(LinkedList<Integer> list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            Integer j = list.get(i);
        }
        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        return time/1000.00;
    }
}
