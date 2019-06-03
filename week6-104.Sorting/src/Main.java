
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {8, 3, 7, 9, 1, 2, 4};
sort(arr);
    }

    public static int smallest(int[] arr) {
        int min = arr[0];
        for (int x : arr) {

            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] arr) {
        int min = smallest(arr);
        int dex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min) {
                dex = i;
            }
        }
        return dex;
    }

    public static int indexOfTheSmallestStartingFrom(int[] arr, int index) {
        int min = arr[index];
        int lowest = -1;
        for (int i = index; i < arr.length; i++) {
            if (arr[i] <= min) {
                min = arr[i];
                lowest = i;
            }
           
        }
return lowest;
    
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfTheSmallestStartingFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }
    
    public static void swap(int[] arr, int index1, int index2) {
        int one = arr[index1];
        int two = arr[index2];
        arr[index1] = two;
        arr[index2] = one;
}

}
