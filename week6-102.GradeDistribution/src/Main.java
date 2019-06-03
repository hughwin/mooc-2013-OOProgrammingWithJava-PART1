
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Grade a = new Grade();

        while (true) {
            System.out.println("Enter a number: ");
            int input = lukija.nextInt();
            if (input == -1) {
                a.printScores();
                break;
            }
            else{

            a.addGrade(input);
            }
            
   
                
        }
    }
}

    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
//        Points	Grade
//        0–29	failed
//        30–34	1
//        35–39	2
//        40–44	3
//        45–49	4
//        50–60	5

