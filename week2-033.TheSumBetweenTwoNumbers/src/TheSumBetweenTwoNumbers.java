
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First number: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second number: ");
        int b = Integer.parseInt(reader.nextLine());
        
        int sum = 0;
        
        while(a <= b){
            sum = sum + a;
            a++;
        }
        System.out.println("First: " + a);
        System.out.println("Second: " + b);
        System.out.println("Sum: " + sum);
        
    }
}
