/* Pj Ellis - Module 5 - Create, Write, and Read to a file
 * Write a program to create a new file titled data.file, if the file does not 
 * exist. Then write to the new file, adding 10 randomly generated numbers, or 
 * append 10 randomly generated numbers to a previous file. Each integer is to 
 * be separated by a space. Close the file, then reopen the file and read the 
 * data from the file and display it.
*/

/* Link to webpage i used to teach me about timestamps
 * https://mkyong.com/java/how-to-get-current-timestamps-in-java/
*/

import java.io.*;
import java.util.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class EllisFile {
    
    //experimenting with timestamps to add to file to give a time stamp of when files were added/appended
    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("MM/dd/yy");
    private static final SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm.ss");
        
    public static void main(String[] args) {
        
        //create timestamp
        Timestamp time = new Timestamp(System.currentTimeMillis());
        
        //create file
        File file = new File("data.file");
        
        //declare variables
        PrintWriter pw;
        Scanner sc;
        
        //See if file exists or not
        try {
            if (file.createNewFile()) {
                System.out.println("Creating file...");
                pw = new PrintWriter(new FileOutputStream(file, true));
                
                //Timestamp of creating file
                pw.print("File Created On: " + (sdf1.format(time)) + " at " + (sdf2.format(time)) + "\n");
                pw.close();
                System.out.println("Successfully created file!");
            }//end of if
            else {
                System.out.println("File Already Exists.");
            }//end of else
        }//end of try
        catch (IOException e) {
            System.out.println("IOException has been thrown! -1");
        }
        
        //write/append to file
        try {
            pw = new PrintWriter(new FileOutputStream(file, true));
            
            System.out.println("\nWriting data to file ...");
            
            for (int i = 0; i < 10; i++) {
                int random = (int) (1 + Math.random() * 9999);
                pw.print(random + " ");
            }//end of for
            pw.print("-- Added to file on: " + (sdf1.format(time)) + " at " + (sdf2.format(time)) + "\n");
            
            //close printwriter
            pw.close();
            System.out.println("Successfully wrote to the file!");
        } //end of try
        catch (IOException e) {
                System.out.println("IOException has been thrown! -2");
        }//end of catch
            
        //open file / read file / display file
        try {
            System.out.println("\nReading data from file and Displaying...\n");
            sc = new Scanner(file);            
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }//end of while
        }//end of try 
        catch (IOException e) {
                System.out.println("IOException has been thrown! -3");
        }//end of catch
                
        }//End of main
    
}//End of class
