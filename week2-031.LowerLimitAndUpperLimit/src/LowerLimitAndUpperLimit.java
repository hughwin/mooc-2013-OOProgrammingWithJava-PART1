
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

               System.out.println("First number: ");
        int a = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second number: ");
        int b = Integer.parseInt(reader.nextLine());
        
        while(a <= b ){
            System.out.println(a);
            a++;
        }

    }
}
