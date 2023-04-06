package java_week4_writing_hw;

/**
 * Display right angle triangle of @ using nested for loops
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
import java.util.Scanner;
public class Program8_SymbolTriangle {
    public static void symbolTriangle(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from the console
        Scanner sca =new Scanner(System.in);
        System.out.println("Input number of rows: ");
        symbolTriangle(sca.nextInt());
        sca.close();//closing scanner object
    }
}

