import java.util.Random;

public class PasswordRandomizer {
    private int length;
    private Random random = new Random();

    public PasswordRandomizer(int length) {
        this.length = length;
        this.random = new Random();
    }

    public String createPassword() {
        String pw = "";
        int i = 0;
        while (i < this.length){
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(this.random.nextInt(26 - 0));
            pw = pw + symbol;
            i++;
        }
        return pw;
    }
}
