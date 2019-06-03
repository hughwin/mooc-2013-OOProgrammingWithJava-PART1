
public class Accounts {

    public static void main(String[] args) {
        Account matt = new Account("Matt's account", 1000.00);
        Account mine = new Account("My account", 0.00);
        
        matt.withdrawal(100.00);
        mine.deposit(100.00);
        System.out.println(Matt);
        System.out.println(Mine);
    }

}
