
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********");
        System.out.println("* HANGMAN  *");
        System.out.println("***********");
        System.out.println("");
        printMenu();
        System.out.println("");
        int guesses = 0;

        while (hangman.gameOn()) {
            String command = reader.nextLine();

            if (command.equals("quit")) {
                break;
            }
            if (command.equals("status")) {
                if (guesses == 0) {
                    hangman.printStatus();
                    System.out.println("You have not made any guesses yet.");
                    System.out.println("Unused letters: abcdefghijklmnopqrstuvwxyz");
                }
                else {hangman.printStatus();}

            }
            if (command.length() == 1) {
                hangman.guess(command);
            }
            if (command.isEmpty()) {
                System.out.println("String was empty");
                printMenu();
            } else {
                System.out.println("I found something!");
            }
            hangman.printMan();
            hangman.printWord();
            
        }

        System.out.println("Thank you for playing!");
    }

    public static void printMenu() {
        System.out.println(" * menu *");
        System.out.println("quit   - quits the game");
        System.out.println("status  - prints the game status");
        System.out.println("a single letter uses the letter as a guess");
        System.out.println("an empty line prints this menu");

    }
}
