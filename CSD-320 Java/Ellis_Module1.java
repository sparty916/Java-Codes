/*
PJ Ellis
10/23/22
Module 1 Assignment
 */

public class Ellis_Module1 {
    /*Code to display the results of two similiar math equations to showcase 
    how Java does interger division vs float division.
    */
    public static void main(String[] args) {
        System.out.println("4 x ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 "
                + "/ 9.0 - 1.0 / 11.0 + 1.0 / 13.0 )= ");
        System.out.println(4 * ( 1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 /
                9.0 - 1.0 / 11.0 + 1.0 / 13.0 ));
        System.out.println("4 x ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1"
                + " / 13 )= ");
        System.out.println(4 * ( 1 - 1 / 3 + 1 / 5 - 1 / 7 + 1 / 9 - 1 / 11 + 1 
                / 13 ));
        System.out.println("To further understand the difference between the two "
                + "equations, I will show the outputs individually");
        System.out.println("1 / 3 = " + (1 / 3) + " | 1.0 / 3.0 = " + (1.0 / 3.0));
        System.out.println("1 / 5 = " + (1 / 5) + " | 1.0 / 5.0 = " + (1.0 / 5.0));
        System.out.println("1 / 7 = " + (1 / 7) + " | 1.0 / 7.0 = " + (1.0 / 7.0));
        System.out.println("1 / 9 = " + (1 / 9) + " | 1.0 / 9.0 = " + (1.0 / 9.0));
        System.out.println("1 / 11 = " + (1 / 11) + " | 1.0 / 11.0 = " + (1.0 / 11.0));
        System.out.println("1 / 13 = " + (1 / 13) + " | 1.0 / 13.0 = " + (1.0 / 13.0));
        System.out.println("1 - 0 + 0 - 0 + 0 - 0 + 0 = " + ((1 - 0 + 0 - 0 + 0 
                - 0 + 0)));
        System.out.println("1.0 - 0.3333333333333333 + 0.2 - 0.14285714285714285"
                + " + 0.1111111111111111 - 0.09090909090909091 + 0.07692307692307693"
                + " = " + ((1.0 - 0.3333333333333333 + 0.2 - 0.14285714285714285
                        + 0.1111111111111111 - 0.09090909090909091 + 0.07692307692307693)));
        System.out.print("4 x 1 = ");
        System.out.println(4 * 1);
        System.out.print("4 x 0.8209346209346211 = ");
        System.out.println(4.0 * 0.8209346209346211);
        System.out.println("'In Java the division for integers is the quotient -- "
                + "the fractional part is truncated.' - (from the text book)");
        System.out.println("Turncated means to round down, or towards zero, "
                + "so 1.3 becomes 1, and .3 becomes 0.");
    /*Java does division of intergers in long division as if you were to do it 
        by hand.  So 9 divided by 5 would be 1 with remainder 8, or 1.8.  
        If you just use 9 and 5, they are whole numbers and are there for intergers, 
        so Java will round down, leaving off the remainder, and giving you 1.  
        If you use floats, and do 9.0 divided by 5.0, you will get a more accurate 
        answer of 1.8, since it is a float.
        Intergers can only be whole numbers, no decimal points, so in order
        for you to not get a turncated number, you need to use decimal points
        to make the numbers 'floats' so that it doesnt round it down to the 
        closest whole number.
        */
        }
}
