
public class Printing {

    public static void printStars(int amount) {

        int i = 0;
        String stars = "";
        while (i < amount) {
            stars = stars + "*";
            i++;
        }
        System.out.println(stars);

    }

    public static void printSquare(int sideSize) {
        int j = 0;
        while (j < sideSize) {
            printStars(sideSize);
            j++;
        }
    }

    public static void printRectangle(int width, int height) {
        int j = 0;
        while (j < height) {
            printStars(width);
            j++;
        }
    }

    public static void printTriangle(int size) {
        for (int x = 1; x <= size; x++) {
            printStars(x);
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(3);
        System.out.println("\n---");  // printing --- to separate the figures
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
