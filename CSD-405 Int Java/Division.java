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

//Parent Class that is also abstract
abstract class Division {
    
    //fields requried to make object
    String compName;
    String acctNum;
    
    //constructor
    public Division (String compName, String acctNum) {
        this.compName = compName;
        this.acctNum = acctNum;
    }//End of Constructor
    
    //abstract method - to be defined in subclasses
    public abstract void display();
    
}//End of abstract Class
