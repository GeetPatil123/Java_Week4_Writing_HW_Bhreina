package java_week4_writing_hw;

/**
 * Display left angle triangle of * using nested for loops
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 */
import  java.util.Scanner;
public class program15_LeftTriangleStar {
    public static void leftTriangle(int x) {
        int i, j;
        for (i = 1; i <= x; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner sca= new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int a = sca.nextInt();
        leftTriangle(a);
        //closing scanner object
        sca.close();
    }
}
