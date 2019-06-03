
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Enter a number you want the numbers added up to");
        int i = Integer.parseInt(reader.nextLine());
        int k = 1;
        int sum = 0;
        while (k <= i){
            sum = sum + k;
            k++;
            System.out.println(sum);
        }

    }
}
