
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here the ArrayList 
        ArrayList<String> words = new ArrayList<String>();

        String command = "";
        while (true) {
            System.out.println("Type a word: ");
            command = reader.nextLine();
            if (words.contains(command)) {
                System.out.println("You gave the word" + command + " twice");
                break;
            } else {
                words.add(command);
            }
        }
    }

}
