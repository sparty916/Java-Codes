/* Pj Ellis - Module 6 - Abstract Classes
 *
 * Create an abstract Division class with fields for a company's division name 
 * and account number, and an abstract display() method that will be defined in 
 * the subclasses.
 * Use a constructor in the superclass that requires values for both fields.
 * Create two subclasses named InternationalDivision and DomesticDivision.
 * The InternationalDivision class includes a field for the country in which the 
 * division is located, a field for the language spoken, and a constructor that 
 * requires all fields when created.
 * The DomesticDivision class includes a field for the state in which the division 
 * is located and a constructor that requires all fields when created.
 * Write an application named UseDivision that creates two instances of each of 
 * these concrete classes (4 total instances).
 * Save the files as: Division, InternationalDivision, DomesticDivision, and 
 * UseDivision.
 */

import java.util.*;
        
public class UseDivision {
    
    //method to capitalize the first letter also check for null string (*see below)
    public static final String capitalize(String str) {
        if (str == null || str.length() == 0) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
        
    }//end of method
       
    //create an array for users domestic input
    public static String[] getDomInfo() {
        //declare input
        Scanner input = new Scanner(System.in);
            
        //declare variables
        String name, number, state;
        
        //user input
        System.out.print("Domestic Division's Name: ");
        name = capitalize(input.nextLine());
        System.out.print(name + "'s Account Number: ");
        number = input.nextLine();
        System.out.print("State where " + name + " is located: ");
        state = capitalize(input.nextLine());
            
        String[] dom = new String[3];
        dom[0] = name;
        dom[1] = number;
        dom[2] = state;
           
        return dom;
        
    }//end of method
    
    //create an array for users international input
    public static String[] getIntInfo() {
        //declare input
        Scanner input = new Scanner(System.in);
            
        //declare variables
        String name, number, country, language;
            
        //user input
        System.out.print("International Division's Name: ");
        name = capitalize(input.nextLine());
        System.out.print(name + "'s Account Number: ");
        number = input.nextLine();
        System.out.print("Country where " + name + " is located: ");
        country = capitalize(input.nextLine());
        System.out.print("Language spoken at this location: ");
        language = capitalize(input.nextLine());
         
        //assign values
        String[] inter = new String[4];
        inter[0] = name;
        inter[1] = number;
        inter[2] = country;
        inter[3] = language;
           
        return inter;
        
    }//end of method
    
    public static void main(String[] args) {

        System.out.println("--DIVISION CREATION DEPARTMENT--");
        
        //declare input 
        Scanner input = new Scanner(System.in);
                                 
        //ask user for companys information
        System.out.print("\nPlease provide your Company's Name: ");
        String companyName = capitalize(input.nextLine());
        
        //Domestic input section
        System.out.println("\nTHANK YOU!\nTime to create " + companyName + "'s "
                + "Domestic Divisions!\nPlease provide:");
        
        //get First Domestic Division
        String[] dom1 = getDomInfo();
        
        //get Second Domestic Division
        String[] dom2 = getDomInfo();

        //International input section
        System.out.println("\nTHANK YOU!\nTime to create " + companyName + "'s "
                + "International Divisions!\nPlease provide:");
        
        //get First International Division
        String[] inter1 = getIntInfo();
                        
        //get Second International Division
        String[] inter2 = getIntInfo();
                        
        //create objects of the subclasses from users input
        DomesticDivision domDiv1 = new DomesticDivision(dom1[0], dom1[1], dom1[2]);
        DomesticDivision domDiv2 = new DomesticDivision(dom2[0], dom2[1], dom2[2]);
        InternationalDivision interDiv1 = new InternationalDivision (inter1[0], inter1[1], inter1[2], inter1[3]);
        InternationalDivision interDiv2 = new InternationalDivision (inter2[0], inter2[1], inter2[2], inter2[3]);
        
        //call display method to display the objects
        System.out.println("\n---* " + companyName + "'s Domestic Divisions *---");
        domDiv1.display();
        domDiv2.display();
        System.out.println("\n---* " + companyName + "'s International Divisions *---");
        interDiv1.display();
        interDiv2.display();
        
    }//end of main
    
}//end of class

/*
 * Learned the Capitalize code from:
 * https://www.javatpoint.com/how-to-capitalize-the-first-letter-of-a-string-in-java
*/
