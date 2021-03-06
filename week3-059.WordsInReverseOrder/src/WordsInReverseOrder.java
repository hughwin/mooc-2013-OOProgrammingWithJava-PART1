
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.*;

public class WordsInReverseOrder {

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
        Collections.reverse(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
}
