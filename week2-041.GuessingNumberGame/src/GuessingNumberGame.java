
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        System.out.println("What is your guess?");
        int guess = Integer.parseInt(reader.nextLine());
        int count = 0;
        
        
        while (guess != numberDrawn){
       
        if (guess > numberDrawn){
            System.out.println("The number is lesser, guesses made: " + count);
            guess = Integer.parseInt(reader.nextLine());
            count++;
        }
        if (guess < numberDrawn){
            System.out.println("The number is greater, guesses made: " + count);
            guess = Integer.parseInt(reader.nextLine());
            count++;
        }
    }
        System.out.println("Congratulations, your guess is correct!");
        
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
