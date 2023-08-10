/*P.j. Ellis - Module 3 - Recursion Discussion Example
* Program to show how methods are added to 'the stack' and removed.
*/

public class CallStackExample {
    
    //recursion method
    static void countdown (int clock, int stack) {
        String indent = "     ";//for visual purposes
        
        // base case
        if (clock == 0) {
            System.out.println(indent +" -- -- - Stack " + stack + " - -- -- ");
            System.out.println(indent +"|     Clock is at " + clock + "     |");
            System.out.println(indent +"|   Base Case is met    |");
            System.out.println(indent +"|     --Blast Off--     |");
            System.out.println(indent +" -- -- -- --*-- -- -- -- ");
            System.out.println(indent +"    ~ STACK REMOVAL ~    ");
        }
        
        //recursion case
        else {
            System.out.println(indent +" -- -- - Stack " + stack + " - -- -- ");
            System.out.println(indent +"|     Clock is at " + clock + "     |");
            System.out.println(indent +"| Base Case not yet met |");
            System.out.println(indent +"| Subtract 1 from clock |");
            System.out.println(indent +"|   Call method again!  |");
            System.out.println(indent +" -- -- -- --*-- -- -- -- ");
            clock--;//subtract 1 from clock
            stack++;//add one to stack for demo purposes to show which stack we are on
            
            countdown(clock, stack);//call method again from within the method with new parameters
            
            //show removal of stack after base case has been met
            System.out.println(indent +" -- -- -- --*-- -- -- -- ");
            System.out.println(indent +"| Now we remove stack " + stack + " |");
            System.out.println(indent +" -- -- -- --*-- -- -- -- ");
        }
    }
    
    //main
    public static void main(String[] args) {
       
        System.out.println("       *** Start of Main ***\n");
        System.out.println("Base Case is met when clock gets to 0");
        System.out.println("Start by calling the method from main\n");
        System.out.println("- - - Entering the Call Stack - - -\n");
                
        //call method
        countdown(5, 0);

        System.out.println("\n - - - Exiting the Call Stack - - -  \n");
        System.out.println("       *** End of Main ***");        
    }    
}
