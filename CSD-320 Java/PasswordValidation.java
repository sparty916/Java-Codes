/**PJ ELLIS - Module 7
 * Create a method to check a string against certain criteria to see if it's valid
 * 1-Contain at least eight characters
 * 2-Contain both letters and digits
 * 3-Contain at least one uppercase character
 * 4-Contain at least one lowercase character
 */

// FIXED TO COUNT LOWERCASE LETTERS TO GET RID OF LOGIC ERROR

public class PasswordValidation {
    
    public static void main (String [] args) {
            
    //Prompt the user to enter their desired password
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Please enter your desired password: ");
    String pWord = input.nextLine();

    // Calls the Method on the password entered by the user and prints result to screen
    System.out.println(isPwordValid(pWord));
    }

    public static String isPwordValid(String pWord) {
            
        // Sets the initial result as valid
        String result = "Valid Password!";
            
        // Stores the number characters in the password
        int length = 0;
            
        // Variable used to store how many digits are in the password
        int digitCount = 0;
            
        // Variable used to store how many UPPERCASE letters in the password
        int upperCount = 0;
        
        // Variable used to store how many lowercase letters in the password
        int lowerCount = 0;
                    
        //Checks that password contains only letters and numbers
        for (int x =0; x < pWord.length(); x++) {
            if ((pWord.charAt(x) >= 47 && pWord.charAt(x) <= 58) || 
                (pWord.charAt(x) >= 64 && pWord.charAt(x) <= 91) || 
                (pWord.charAt(x) >= 97 && pWord.charAt(x) <= 122)) {
                //No Change to "result" - keep as Valid Password!
            }
            else {
                result = "Invalid Password!";
            }
                
            // Counts the number of digits
            if ((pWord.charAt(x) > 47 && pWord.charAt(x) < 58)) {
                digitCount ++;
            }
    
            // Counts the number of UPPERCASE letters
            if ((pWord.charAt(x) > 64 && pWord.charAt(x) < 91)) {
                upperCount ++;
            }
            
            // Counts the number of lowercase letters
            if ((pWord.charAt(x) > 97 && pWord.charAt(x) < 122)) {
                lowerCount ++;
            }
            
            // Counts the passwords length
            length = (x + 1);
        }//End of for loop
            
        //Checks that the password contains at least one digit
        if (digitCount < 1){
            result = "Invalid Password!";
        }
        
        //Checks that the password contains at least one UPPER case letter
        if (upperCount < 1) {
            result = "Invalid Password!";
        }
        
        //Checks that the password contains at least one lowercase letter
        if (lowerCount < 1) {
            result = ("Invalid Password!");
        }

        //Checks that the password is long enough
        if (length < 8){
            result = "Invalid Password!";
        }

        //Returns the value of result
        return (result);
        
    } // End of the method
} // End of the class
