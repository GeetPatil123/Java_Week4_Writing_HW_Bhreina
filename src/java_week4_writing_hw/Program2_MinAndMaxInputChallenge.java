package java_week4_writing_hw;


import java.util.Scanner;

/**
   * Read the numbers from the console entered by the user and print the minimum and maximum number
   * the user has entered.
   * -Before the user enters the number, print the message Enter number:
   * -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
   * Hint:
   * -Use an endless while loop.
   * -Create a class with the name MinAndMaxInputChallenge.
   */

public class Program2_MinAndMaxInputChallenge {

    public static void findMinAndMaxNumber(){
        //Scanner declaration for reading input from console
        Scanner sca=new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;
        // while loop
        while (true){
            System.out.println("Enter number: ");
            boolean isAnInt = sca.hasNextInt();
            if (isAnInt){
                int number = sca.nextInt();
                if (first){
                    first = false;
                    min = number;
                    max = number;
                }
                if (number > max){
                    max = number;
                } if (number < min){
                    min = number;
                }
            } else {
                break;
            }
            sca.nextLine();//handel input
        }
        System.out.println("Min = " + min + " , Max = " + max);
        sca.close();//closing scanner object
    }

    public static void main(String[] args) {
        findMinAndMaxNumber();
    }

  }
