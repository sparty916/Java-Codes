/* Pj Ellis - Module 3
 * Create a class titled <Name>Integer
 * This class is to contain:
 * An int data field titled with your first name.
 * A constructor that takes and sets the initial value.
 * Getter and setter methods.
 * Non-Static methods titled isEven(), isOdd(), and isPrime() returning true or 
 * false based on the variable’s value.
 * Static methods with signatures isEven(int), isOdd(int), and isPrime(int) with 
 * the same basic logic as the previous methods with results based on the parameter.
 * Static methods with signatures isEven(Integer), isOdd(Integer), and isPrime(Integer) 
 * with the same basic logic as the previous methods with results based on the parameter.
 * The methods equals(int) and equals(Integer) which returns true if int values 
 * are equal and false if they are not.
 * Write test code that creates three instances, two with the same value, and one 
 * with a different value.
 * Write test code that ensures all methods function correctly.
 * -----------------------------------------------------------------------------
 * LIST OF PRIME NUMBERS BETWEEN 1 and 100
 * 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 
 * 73, 79, 83, 89, 97
 */
import java.util.*;

public class PjInteger {
    private int pj;

    public PjInteger(int newValue) {
        this.pj = newValue;
    }

    public int getValue() {
        return pj;
    }
        
    public void setValue(int a) {
        this.pj = a;
    }

    public boolean isEven() {
        if (pj % 2 == 0)
            return true;
        else
            return false;
    }

    public boolean isOdd() {
        if (pj % 2 != 0)
            return true;
        else
            return false;
    }

    public boolean isPrime() {
        if(pj<=1) {
            return false;
        }
        for (int i = 2; i <= (pj / 2); i++) {
            if ((pj % i) == 0) {
                return false;
            } 
        }
        return true;
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isOdd(int a) {
        if (a % 2 != 0) {
            return true;
        } 
        else {
            return false;
        }
    }

    public static boolean isPrime(int a) {
        if(a<=1) {
            return false;
        }
        for (int i = 2; i <= (a / 2); i++) {
            if ((a % i) == 0) {
                return false;
            } 
        }
        return true;
    }

    public static boolean isEven(PjInteger a) {
        return a.isEven();
    }

    public static boolean isOdd(PjInteger a) {
        return a.isOdd();
    }

    public static boolean isPrime(PjInteger a) {
        return a.isPrime();
    }

    public boolean equals(int a) {
        if (this.pj == a) {
            return true;
        } 
        else
            return false;
    }

    public boolean equals(PjInteger a) {
        int x = a.getValue();
        if (this.pj == x) {
            return true;
        } 
        else
            return false;
    }
         
    public static void main(String[] args) {
        //get random numbers for my integers
        Random pje = new Random();
        int e = pje.nextInt(100);
        int f = e;
        int g = pje.nextInt(100);        
        
        //create objects and assign values
        PjInteger a = new PjInteger(e);
        PjInteger b = new PjInteger(f);        
        PjInteger c = new PjInteger(g);
                
        //code to test all methods
        System.out.println("\n-- DISPLAYING OBJECTS using Class Methods is*() --");
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Value", "Even", "Odd", "Prime");
        System.out.printf("%-10s%-10s%-10s%-10s\n", a.getValue(), a.isEven(), a.isOdd(), a.isPrime());
        System.out.printf("%-10s%-10s%-10s%-10s\n", b.getValue(), b.isEven(), b.isOdd(), b.isPrime());
        System.out.printf("%-10s%-10s%-10s%-10s\n", c.getValue(), c.isEven(), c.isOdd(), c.isPrime());
        
        System.out.println("\n-- DISPLAYING OBJECTS using Class Methods is*(int a) --");
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Value", "Even", "Odd", "Prime");
        System.out.printf("%-10s%-10s%-10s%-10s\n", e, isEven(e), isOdd(e), isPrime(e));
        System.out.printf("%-10s%-10s%-10s%-10s\n", f, isEven(f), isOdd(f), isPrime(f));
        System.out.printf("%-10s%-10s%-10s%-10s\n", g, isEven(g), isOdd(g), isPrime(g));
        
        System.out.println("\n-- DISPLAYING OBJECTS using Class Methods is*(PjInteger a) --");
        System.out.printf("%-10s%-10s%-10s%-10s\n", "Value", "Even", "Odd", "Prime");
        System.out.printf("%-10s%-10s%-10s%-10s\n", a.getValue(), isEven(a), isOdd(a), isPrime(a));
        System.out.printf("%-10s%-10s%-10s%-10s\n", b.getValue(), isEven(b), isOdd(b), isPrime(b));
        System.out.printf("%-10s%-10s%-10s%-10s\n", c.getValue(), isEven(c), isOdd(c), isPrime(c));        

        System.out.println("\n-- TESTING EQUALS using equals(int a) --");
        System.out.println("Are " + e + " and " + f + " Equal? " + a.equals(f));
        System.out.println("Are " + e + " and " + g + " Equal? " + a.equals(g));
        System.out.println("Are " + f + " and " + g + " Equal? " + b.equals(g));
        
        System.out.println("\n-- TESTING EQUALS using equals(PjInteger a) --");
        System.out.println("Are " + e + " and " + f + " Equal? " + a.equals(b));
        System.out.println("Are " + e + " and " + g + " Equal? " + a.equals(c));
        System.out.println("Are " + f + " and " + g + " Equal? " + b.equals(c));        
    }//End of Main
    
}//End of Class
