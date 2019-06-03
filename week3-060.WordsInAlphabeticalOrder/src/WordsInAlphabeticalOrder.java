
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
                ArrayList<String> words = new ArrayList<String>();

        String command = "fi";
        while (!command.equals("")) {
            System.out.println("Type a word: ");
            command = reader.nextLine();
            words.add(command);
        }
        Collections.sort(words);
        for (String word : words) {
            System.out.println(word);
        }
        
    }
}
