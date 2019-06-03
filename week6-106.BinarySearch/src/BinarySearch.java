/*
Recusrsive solution that TMC didn't like. 

import java.util.Arrays;

public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            }   
            else if (array[middle] < searchedValue){
                int[] slice = Arrays.copyOfRange(array, middle, array.length);
                return search(slice, searchedValue);
            }
            else if (array[middle] > searchedValue){
                int[] slice = Arrays.copyOfRange(array, 0, middle);
                return search(slice, searchedValue);
            }

        }
        return false;
    }
}
*/
    
public class BinarySearch {
    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue) {
                return true;
            }
            if (array[middle] < searchedValue){
                beginning = middle + 1;
            }
            if (array[middle] > searchedValue){
                end = middle - 1;
            }
        }
        return false;
    }
}