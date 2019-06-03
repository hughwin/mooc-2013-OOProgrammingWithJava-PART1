
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account test = new Account("test",100);
        test.deposit(20.00);
        System.out.println(test);
    }

}
