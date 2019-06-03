
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner bird = new Scanner(System.in);
        Bird b = new Bird("Jez", "Abcde");
        Bird c = new Bird("Lou", "def", 2);
        Observations obs = new Observations();
        obs.addBird(b);
        obs.addBird(c);
        obs.observed("jez");
        obs.observed("jez");
        obs.show("Jez");
        obs.show("jez");
        obs.statistics();

        while (true) {
            System.out.print("? ");
            String input = bird.next();

            if (input.equals("Add")) {
                System.out.println("Name: ");
                String name = bird.next();
                System.out.println("Latin name: ");
                String latin = bird.next();
                Bird a = new Bird(name, latin);
                obs.addBird(a);
            }
            if (input.equals("Observation")) {
                System.out.println("What was observed:?");
                input = bird.next();
                obs.observed(input);
            }
            if (input.equals("Show")) {
                System.out.println("What? ");
                input = bird.next();
                obs.show(input);
            }
            if (input.equals("Statistics")) {
                obs.statistics();
            } else if (input.equals("Quit")) {
                break;
            }

        }
    }
}
