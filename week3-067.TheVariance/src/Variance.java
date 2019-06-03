
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int number : list) {
            sum = sum + number;
        }
        return sum;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int count = 0;

        for (int number : list) {
            count++;
        }
        return (double) sum(list) / count;

    }

    public static double variance(ArrayList<Integer> list) {
        double sum = 0;
        int count = 0;
        double average = average(list);
        for (Integer number : list){
            sum = sum + Math.pow(number-(average),2);
            count++;

        }
        return (sum / (count-1));
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
