import java.util.Scanner;
public class Exercise_Two_TwoFour {
    public static void main (String [] args) {

        Scanner takeNumber = new Scanner(System.in);

        int firstNum, secondNum, thirdNum, fourthNum, fifthNum;

        System.out.print("Please, input your first number: ");
        firstNum = takeNumber.nextInt();

        System.out.print("Please, input your second number: ");
        secondNum = takeNumber.nextInt();

        System.out.print("Please, input your third number: ");
        thirdNum = takeNumber.nextInt();

        System.out.print("Please, input your fourth number: ");
        fourthNum = takeNumber.nextInt();

        System.out.print("Please, input your fifth number: ");
        fifthNum = takeNumber.nextInt();

        if(firstNum > secondNum && firstNum > thirdNum && firstNum > fourthNum &&firstNum > fifthNum){
            System.out.printf("%d is the highest number %n", firstNum);
        }

        else if(secondNum > firstNum && secondNum > thirdNum && secondNum > fourthNum && secondNum > fifthNum){
            System.out.printf("%d is the highest number %n", secondNum);
        }

        else if (thirdNum > firstNum && thirdNum > secondNum && thirdNum > fourthNum && thirdNum > fifthNum) {
            System.out.printf("%d is the highest number %n", thirdNum);		}

        else if (fourthNum > firstNum && fourthNum > secondNum && fourthNum > thirdNum && fourthNum > fifthNum) {
            System.out.printf("%d is the highest number %n", fourthNum);
        }
        else {
            System.out.printf("%d is the highest number %n", fifthNum);
        }

        if(firstNum < secondNum && firstNum < thirdNum && firstNum < fourthNum &&firstNum < fifthNum){
            System.out.printf("%d is the Smallest number %n", firstNum);
        }

        else if(secondNum < firstNum && secondNum < thirdNum && secondNum < fourthNum && secondNum < fifthNum){
            System.out.printf("%d is the smallest number %n", secondNum);
        }

        else if (thirdNum < firstNum && thirdNum < secondNum && thirdNum < fourthNum && thirdNum < fifthNum) {
            System.out.printf("%d is the smallest number %n", thirdNum);		}

        else if (fourthNum < firstNum && fourthNum < secondNum && fourthNum < thirdNum && fourthNum < fifthNum) {
            System.out.printf("%d is the highest number %n", fourthNum);
        }

        else {System.out.printf("%d is the smallest number %n", fifthNum);}
    }
}

