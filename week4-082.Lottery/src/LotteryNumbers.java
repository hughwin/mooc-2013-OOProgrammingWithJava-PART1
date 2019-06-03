
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {

    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        this.random = new Random();

        
        int i = 0;

        while (i < 7) {
            int number = this.random.nextInt(39 - 0) + 1;
            if (!containsNumber(number)) {
                i++;
                this.numbers.add(number);
            }
        }
        numbers();
    }

    public boolean containsNumber(int number) {
        if (this.numbers.contains(number)) {
            return true;
        }
        else{ return false;}

    }
}
