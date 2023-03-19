/* Pj Ellis - 3/19/20263 - Module 1 - Binary I/O (part 2)
 * Write a program that reads and displays data from a .dat file
 * For use with CreateDatFile.java
*/

import java.io.*;
import java.util.*;

public class ReadDatFile {
    
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        
        //create input stream and read from .dat file
        try (ObjectInputStream input = new ObjectInputStream(new
          FileInputStream("EllisDataFile.dat"));
        ) {
            int[] newIntArray = (int[])(input.readObject());
            Date newDate = (Date)(input.readObject());
            double[] newDoubleArray = (double[])(input.readObject());           
            
            //display data            
            System.out.println(Arrays.toString(newIntArray));
            System.out.println(newDate);
            System.out.println(Arrays.toString(newDoubleArray));
        }
    }
}