/* pj ellis - Module 8 - Threads - 4/13/23
 * This class, you are to use three threads to output three types of characters 
 * to a text area for display.  First thread is random characters (a,b,c,d...)
 * second thread is random number digits (0,1,2,3,4,5,6,7,8,9). Third thread is
 * random characters (!,@,#,$,%,&.*...).  Display a minimum of 10,000 of each set.
*/

public class PjThreeThreads {
    public static void main(String[] args) {
        //create tasks
        Runnable print1 = new PrintChar();
        Runnable print2 = new PrintNum();
        Runnable print3 = new PrintSymbol();
        
        //Create threads
        Thread thread1 = new Thread(print1);
        Thread thread2 = new Thread(print2);
        Thread thread3 = new Thread(print3);
        
        //Start threads
        thread1.start();
        thread2.start();
        thread3.start();
    }    
}

class PrintChar implements Runnable {
    private final int times = 10000;
    
    @Override
    public void run() {
        for(int i = 0; i <= times; i++) {
            if(i == times) {
                System.out.println("\nAll 10,000 letters have been printed!");                                
            }
            else {
                System.out.print(RandomCharacter.getRandomLetter() + " ");
            }
        }
    }    
}

class PrintNum implements Runnable {
    private final int times = 10000;
    
    @Override
    public void run() {
        for(int i = 0; i <= times; i++) {
            if(i == times) {
                System.out.println("\nAll 10,000 numbers have been printed!");                                
            }
            else {
                System.out.print(RandomCharacter.getRandomDigit() + " ");
            }
        }
    }    
}

class PrintSymbol implements Runnable {
    private final int times = 10000;

    @Override
    public void run() {
        for(int i = 0; i <= times; i++) {
            if(i == times) {
                System.out.println("\nAll 10,000 symbols have been printed!");                                
            }
            else {
                System.out.print(RandomCharacter.getRandomSymbol() + " ");
            }
        }
    }    
}

class RandomCharacter {
    /** Generate a random character between ch1 and ch2 */
    public static char getRandomCharacter(char ch1, char ch2) {
        return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
    }

    /** Generate a random lowercase letter a-z */
    public static char getRandomLetter() {
        return getRandomCharacter('a', 'z');
    }

    /** Generate a random digit 0-9 */
    public static char getRandomDigit() {
        return getRandomCharacter('0', '9');
    }

    /** Generate a random symbol ! " # $ % & ' ( ) * + , - . / */
    public static char getRandomSymbol() {
        return getRandomCharacter('\u0021', '\u002F');
    }
}