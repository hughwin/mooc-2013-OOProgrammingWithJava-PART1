
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int i = 0;
        String stars = "";
        while (i < amount) {
            stars = stars + "*";
            i++;
        }
        System.out.print(stars);
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1                
        int i = 0;
        String whiteSpace = "";
        while (i < amount) {
            whiteSpace = whiteSpace + " ";
            i++;
        }
        System.out.print(whiteSpace);
    }

    public static void printTriangle(int size) {
        for (int x = 1; x <= size; x++) {
             printWhitespaces(size - x);
             printStars(x);
            
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int i = 0;
        for (int x = 1; x <= height; x++) {
             printWhitespaces(height - x);
             printStars(x+i);
             i++;
            
        }
        printWhitespaces(height-2);
        printStars(3);
        printWhitespaces(height-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
