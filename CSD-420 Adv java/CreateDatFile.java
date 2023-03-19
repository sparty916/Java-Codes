/* Pj Ellis - 3/19/2023 - Module 1 - Binary I/O (part 1)
 * Write a program that writes and stores data to a .dat file
 * For use with ReadDatFile.java
*/

import java.io.*;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom; //See Below Code

public class CreateDatFile {
    
    public static void main (String[] args) throws ClassNotFoundException, IOException {
        
        //create array of five random int
        Random rand = new Random();
        int[] intArray = new int[5];
        for(int i = 0; i < intArray.length; i++) {
            intArray[i] = rand.nextInt(100);
        }
        
        //create a Date object
        Date curDate = new Date();
        
        //create array of five random doubles using code learned on stackoverflow (link below)
        double[] doubleArray = new double[5];
        for(int d = 0; d < doubleArray.length; d++) {
            double x = ThreadLocalRandom.current().nextDouble(1.0, 100.0);
            doubleArray[d] = Math.round(x * 1000.0) / 1000.0;
        }
                          
        //create output stream to write data to .dat file
        try (
        ObjectOutputStream output = new ObjectOutputStream 
        (new FileOutputStream("EllisDataFile.dat"));
        ) {
            output.writeObject(intArray);
            output.writeObject(curDate);
            output.writeObject(doubleArray);
        }        
        
        //displaing data for testing and comparing to output from part two        
        System.out.println(Arrays.toString(intArray));
        System.out.println(curDate);
        System.out.println(Arrays.toString(doubleArray));        
    }
}

/* https://stackoverflow.com/questions/3680637/generate-a-random-double-in-a-range
 * Saw code in thread and tried it out to get doubles in a specific range with certain decimal places
*/