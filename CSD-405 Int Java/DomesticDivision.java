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

//child class extends parent class
class DomesticDivision extends Division{
    
    //adds one field to parent object
    String compState;
    
    //constructor with added fields
    public DomesticDivision (String compName, String acctNum, String compState) {
        super(compName, acctNum);
        this.compState = compState;        
    }//end of constructor
    
    //method that overrides abstract method of parent class
    @Override
    public void display() {
        System.out.println("\nCOMPANY NAME: " + compName + "\nACCOUNT NUMBER: " 
        + acctNum + "\nSTATE: " + compState);
    }//end of method
    
}//end of class
