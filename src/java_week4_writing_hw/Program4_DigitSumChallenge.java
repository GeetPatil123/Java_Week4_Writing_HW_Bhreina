package java_week4_writing_hw;

import java.util.Scanner;
public class Program4_DigitSumChallenge {

    public static int sumDigits(int number){
        if (number >= 10){
            int digit, sum = 0;
            while (number >0){
                //finds the last digit of the number
                digit = number % 10;
                //adds last digit to the variable sum
                sum = sum + digit;
                //removes the last digit from the number
                number = number / 10;
            }
            return sum;
        } else {
            //return -1 for negative number and one number
            return -1;
        }
    }

    public static void main(String[] args) {
        //scanner declaration for reading input from the console
        Scanner sca=new Scanner(System.in);
        System.out.println("Enter number = : ");
        int result = sumDigits(sca.nextInt());
        System.out.println("Sum of number digits is : " + result);
        sca.close();//closing scanner object
    }
}
