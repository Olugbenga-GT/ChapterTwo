/*(Negative, Positive and Zero Values) Write a program that inputs five numbers and determines
and prints the number of negative numbers input, the number of positive numbers input and
the number of zeros input.  */

import java.util.Scanner;
public class Exercise_Two_ThirtyTwo {
    public static void main(String[] args) {
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;

        Scanner takeNumber = new Scanner(System.in);
        System.out.print("Please, Enter your number: ");
        int input = takeNumber.nextInt();
        if(input == 0){
            countZero = countZero + 1;
        }
        else{
            if(input > 0){
                countPositive = countPositive + 1;
            }
            else{
                if(input < 0){
                    countNegative = countNegative + 1;
                }
            }
        }

        System.out.print("Please, Enter another number: ");
        input = takeNumber.nextInt();
        if(input == 0){
            countZero = countZero + 1;
        }
        else{
            if(input > 0){
                countPositive = countPositive + 1;
            }
            else{
                if(input < 0){
                    countNegative = countNegative + 1;
                }
            }
        }

        System.out.print("Please, another number: ");
         input = takeNumber.nextInt();
        if(input == 0){
            countZero = countZero + 1;
        }
        else{
            if(input > 0){
                countPositive = countPositive + 1;
            }
            else{
                if(input < 0){
                    countNegative = countNegative + 1;
                }
            }
        }

        System.out.print("Please, yet another number: ");
        input = takeNumber.nextInt();
        if(input == 0){
            countZero = countZero + 1;
        }
        else{
            if(input > 0){
                countPositive = countPositive + 1;
            }
            else{
                if(input < 0){
                    countNegative = countNegative + 1;
                }
            }
        }

        System.out.print("Please, Enter your last number: ");
         input = takeNumber.nextInt();
        if(input == 0){
            countZero = countZero + 1;
        }
        else{
            if(input > 0){
                countPositive = countPositive + 1;
            }
            else{
                if(input < 0){
                    countNegative = countNegative + 1;
                }
            }
        }
        System.out.printf("positive integers are: %d%n%n Negative integers are: %d%n%n zeroes are: %d%n%n", countPositive, countNegative,countZero);
    }
}

