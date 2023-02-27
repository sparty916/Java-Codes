/* PJ Ellis - Module 8
* Write a program with four methods for calculating the cost of a yearly 
* auto service visit. The methods will be titled yearlyService.
*
* yearlyService(no parameters) - Will return the standard service charge.
* yearlyService(one parameter) - Will return the standard service charge 
* with an added oil change fee.
* yearlyService(two parameters) - Will return the standard service charge 
* with an added oil change fee and a tire rotation charge.
* yearlyService(three parameters) - Will return the standard service charge 
* with an added oil change fee, a tire rotation charge, along with a coupon 
* amount that will be deducted from the total cost.
* Write a main method that will test each of these methods two times.
*/

import java.util.Random; //to get random numbers for the program to input
        
public class YearlyAutoService {
   //Creating my method overloads
    static int yearlyService() {
        int serCharge = 59;
        return serCharge;
    }
    
    static int yearlyService(int oilChange) {
        int serCharge = 59;
        int option2 = serCharge + oilChange;
        return option2;
    }
    
    static int yearlyService(int oilChange, int tireRot) {
        int serCharge = 59;
        int option3 = serCharge + oilChange + tireRot;
        return option3;
    }
    
    static int yearlyService(int oilChange, int tireRot, int discount) {
        int serCharge = 59;
        int option4 = (serCharge + oilChange + tireRot) - discount;
        return option4;     
    }//End of methods
    
    //Main to run thru the methods twice
    public static void main(String[] args) {
        
        for (int i = 1; i < 3; i++) { //for loop to run method two times
            //Selecting random numbers
            Random rand = new Random();
            int upperbound = 99;
            int x = rand.nextInt(upperbound);
            int y = rand.nextInt(upperbound);
            int z = rand.nextInt(upperbound);
            
            //Call the methods to show the output of each method
            System.out.println("Run" + i);
            int optA = yearlyService();
            System.out.println("OPTION 1: \nStandard Service Charge: $" + yearlyService());
            
            int optB = yearlyService(x);
            System.out.println("\nOPTION 2: \nStandard Service Charge: $" + yearlyService() + "\nplus an Oil Change: $" + x + "\n\tTOTAL: $" + optB);
            
            int optC = yearlyService(x, y);
            System.out.println("\nOPTION 3: \nStandard Service Charge: $" + yearlyService() + "\nplus an Oil Change: $" + x + "\nand add "
                + "a Tire Rotation: $" + y + "\n\tTOTAL: $" + optC);
            
            int optD = yearlyService(x, y, z);
            System.out.println("\nOPTION 4: \nStandard Service Charge: $" + yearlyService() + "\nplus an Oil Change: $" + x + "\nand add "
                + "a Tire Rotation: $" + y + "\nwith a Special Discount of: $" + z + "\n\tTOTAL: $" + optD + "\n");
        }//End of for loop
    }//End of main
}//End of class
