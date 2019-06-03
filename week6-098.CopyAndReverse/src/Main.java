import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
    }
    
    public static int[] copy(int[] array){
        int[] dest = new int[array.length];
        System.arraycopy(array, 0, dest, 0, array.length);
        return dest;
    }
    
    public static int[] reverseCopy(int[] array){
        int[] rev = new int[array.length];
        int k = 0;
        for (int i = array.length - 1 ; i >= 0 ; i--){
            rev[i] = array[k];
            k++;
        }
        return rev;
    }

}
