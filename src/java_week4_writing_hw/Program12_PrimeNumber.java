package java_week4_writing_hw;
/**
 * Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1.
 * For example 2, 3, 5, 7, 11, 13, 17.... are the prime numbers.)
 */
import java.util.Scanner;
public class Program12_PrimeNumber {
    public static void isPrimeNumber(int num){
        boolean flag = false;
        for (int i = 2; i <= num / 2; i++){
            if (num % i ==0){
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from the console
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a =sca.nextInt();
        isPrimeNumber(a);
        sca.close();//closing scanner object
    }
}
