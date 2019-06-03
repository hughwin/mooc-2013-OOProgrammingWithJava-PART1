
public class Accounts {

    public static void main(String[] args) {
        
        Account a = new Account ("a", 100.00);
        Account b = new Account ("b", 0.0);
        Account c = new Account ("c", 0.0);
        transfer(a, b, 50.00);
        transfer(b, c, 25.00);
        
        
        
 }
    
        public static void transfer(Account from, Account to, double howMuch){
            from.withdrawal(howMuch);
            to.deposit(howMuch);
        }
        
    }
