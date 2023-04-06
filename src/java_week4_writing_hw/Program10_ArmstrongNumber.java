package java_week4_writing_hw;
/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
import java.util.Scanner;
public class Program10_ArmstrongNumber {
    public static void isAmstrongNumber(int num){
        int number, temp,total=0;
        number = num;
        while (num != 0){
            temp = num % 10;
            total = total + temp * temp * temp;
            num /= 10;
        }
        if (total == number){
            System.out.println(number + " is an Armstrong Number: ");
        } else {
            System.out.println(number + " ia not an Armstrong Number: ");
        }
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from the console
        Scanner sca =new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = sca.nextInt();
        isAmstrongNumber(a);
        sca.close();//closing scanner object
    }
}
