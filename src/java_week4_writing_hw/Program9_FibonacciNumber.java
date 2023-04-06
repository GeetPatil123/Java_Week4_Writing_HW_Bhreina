package java_week4_writing_hw;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
import java.util.Scanner;
public class Program9_FibonacciNumber {

    public static void isFibonacciNumber(int count){
        int n1 = 0, n2 = 1, n3;
        System.out.println(n1 + " " + n2);
        //loop starts from 2 because 0 and 1 are already printed
        for (int i = 2; i < count; ++i){
            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input from the console
        Scanner sca = new Scanner(System.in);
        System.out.println("Input Fibonacci number count: ");
        isFibonacciNumber(sca.nextInt());
        sca.close();//closing scanner object
    }
}
