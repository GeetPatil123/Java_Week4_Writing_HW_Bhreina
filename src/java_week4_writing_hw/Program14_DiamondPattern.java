package java_week4_writing_hw;

/**
 * 14 Write a program in Java to display the pattern like a diamond.
 * While loop
 * <p>
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 *   ***********
 *  *************
 *   ***********
 *    *********
 *     *******
 *      *****
 *       ***
 *        *
 */
import java.util.Scanner;
public class Program14_DiamondPattern {
    public static void printDiamond(int r, char ch) {
        int i = 1;
        int j;
        while (i <= r) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
        i = r - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= r - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter the Number of row : ");
        int a = sca.nextInt();
        System.out.print("Enter the symbol : ");
        char c = sca.next().charAt(0);
        printDiamond(a, c);
        // closing the scanner object
        sca.close();
    }
}
