/* Pj Ellis - Module 5 - 4/8/23
 * Read words from a text file and display all non-duplicate words
 * in ascending order and then in descending order
*/

import java.io.*;
import java.util.*;

public class TextToSet {
    
    public static void main(String[] args) throws FileNotFoundException { 
        
        Set<String> allWords = new HashSet<>();
        File file = new File("collection_of_words.txt");
        Scanner input = new Scanner(file);
        
        while (input.hasNext()) {
            String line = input.nextLine();
            String[] wordsInFile = line.split("[ .,'-]");
        
            for (String words : wordsInFile) {
                if (words.trim().length() > 0 && words.trim().matches("[A-Z|a-z]+")) {
                    String word = words.toLowerCase();
                    allWords.add(word);
                }
            }            
        }

        TreeSet collectionOfWords = new TreeSet(allWords);
    
        System.out.println("Words in TreeSet:");
        System.out.println("Ascending Order\n" + collectionOfWords);
        System.out.println("Descending Order\n" + collectionOfWords.descendingSet());    
    }    
}
