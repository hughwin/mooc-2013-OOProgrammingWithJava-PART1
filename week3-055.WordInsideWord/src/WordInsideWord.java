
import java.util.Scanner;

public class WordInsideWord {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        String firstWord = reader.nextLine();
        String secondWord = reader.nextLine();
        
        if (firstWord.indexOf(secondWord) != -1){
            System.out.println("The word " + secondWord + " is found in the word " + firstWord +".");
        }
        else {System.out.println("The word " + secondWord + " is not found in the word " + firstWord +".");}
    }
}
