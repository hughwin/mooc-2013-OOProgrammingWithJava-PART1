
import java.util.ArrayList;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        String command = "fi";
        while (!command.equals("")) {
            System.out.println("Type a word: ");
            command = reader.nextLine();
            words.add(command);
        }
        for (String word : words) {
            System.out.println(word);
        }

    }
}
