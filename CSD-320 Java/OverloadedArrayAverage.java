
/* Pj Ellis - Module 10
 * 12/5/2022
 * Write four overloaded methods that return the average of an array with the 
 * following headers:
 * 1 - public static short average(short [] array)
 * 2 - public static int average(int [] array)
 * 3 - public static long average(long [] array)
 * 4 - public static double average(double [] array)
 * Write a test program that invokes each of these methods and then displays the 
 * average value returned along with a display of the original array elements. 
 * Ensure the display is easy to read and understandable. Lastly, each array sent 
 * into the methods must be of different sizes to ensure the method code is 
 * correctly written.
 */
import java.util.Random;

public class OverloadedArrayAverage {
    
    public static void main(String[] args) {
                
        //assign random number for array length withing a range of 2 to 10
        Random sLength = new Random();
        int w = sLength.nextInt(10-2) + 2;
        Random iLength = new Random();
        int x = iLength.nextInt(10-2) + 2;
        Random lLength = new Random();
        int y = lLength.nextInt(10-2) + 2;
        Random dLength = new Random();
        int z = dLength.nextInt(10-2) + 2;
            
        //declare and initailize my arrays
        short[] shortArray = new short[w];
        int[] intArray = new int[x];
        long[] longArray = new long[y];
        double[] doubleArray = new double[z];
                
        //assign random numbers to short Array
        Random shortrand = new Random();
        for (int i = 0; i < shortArray.length; i++) {
            shortArray[i] = (short)shortrand.nextInt();
        }//end of for loop
        
        //Display all short values entered
        System.out.println("\n-SHORT ARRAY-\nArray length: " + w + "\n"
                + "The random short values entered:");
        for(int a = 0; a < shortArray.length; a++) {
            System.out.print(shortArray[a] + " ");
        }//end of for loop
        
        //Display Average of short array
        System.out.println("\nThe 'short' average of these values is: " + 
                average(shortArray));
        
        //assign random numbers to int Array
        Random intrand = new Random();
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = intrand.nextInt();
        }//end of for loop
                        
        //Display all int values entered
        System.out.println("\n-INT ARRAY-\nArray length: " + x + "\n"
                + "The random int values entered:");
        for(int a = 0; a < intArray.length; a++) {
            System.out.print(intArray[a] + " ");
        }//end of for loop
        
        //Display Average of int array
        System.out.println("\nThe 'int' average of these values is: " + 
                average(intArray));
        
        //assign random numbers to long Array
        Random longrand = new Random();
        for(int i = 0; i < longArray.length; i++) {
            longArray[i] = longrand.nextLong();
        }//end of for loop
                
        //Display all long values entered
        System.out.println("\n-LONG ARRAY-\nArray length: " + y + "\n"
                + "The random long values enetered:");
        for(int a = 0; a < longArray.length; a++) {
            System.out.print(longArray[a] + " ");
        }//end of for loop
        
        //Display Average of short array
        System.out.println("\nThe 'long' average of these values is: " + 
                average(longArray));
        
        //assign random numbers to double Array
        Random doublerand = new Random();
        for(int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = doublerand.nextDouble();
        }//end of for loop
        
        //Display all double values entered
        System.out.println("\n-DOUBLE ARRAY-\nArray length: " + z + "\n"
                + "The random double values enetered:");
        for(int a = 0; a < doubleArray.length; a++) {
            System.out.print(doubleArray[a] + " ");
        }//end of for loop
        
        //Display Average of double array
        System.out.println("\nThe 'double' average of these values is: " + 
                average(doubleArray));
    }//End of main
    
    
    //Overloaded Methods for each type
    public static short average(short[] array) {
        //sum of short values may not fit in a short value, sum made a double just in case
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }//end of for loop
        
        //average of short values does fit, cast back to short
        short result = (short)(sum / array.length);
        return result;
    }//end of short method

    public static int average(int[] array) {
        //sum of int values may not fit in a int value, sum made a double just in case
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }//end of for loop
        
        //average of int values does fit, cast back to int
        int result = (int)(sum / array.length);
        return result;
    }//end of int method
    
    public static long average(long[] array) {
        //sum of long values may not fit in a long value, sum made a double just in case
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }//end of for loop
        
        //average of long values does fit, cast back to long
        long result = (long)(sum / array.length);
        return result;
    }//end of long method

  public static double average(double[] array) {
      double sum = 0;
      for (int i = 0; i < array.length; i++) {
          sum += array[i];
      }//end of for loop
      
      return sum / array.length;
  }//end of double method
    
}//end of class
