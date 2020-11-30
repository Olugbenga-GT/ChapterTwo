// Largest of three Integers.
    import java.util.Scanner;
public class Exercise_Two_OneSeven {
        public static void main (String [] args) {

            int firstNum;
            int secondNum;
            int thirdNum;


            Scanner takeNumber = new Scanner (System.in);

            System.out.println("Please, enter your first Number");
            firstNum = takeNumber.nextInt();


            System.out.println("Please, enter your second Number");
            secondNum = takeNumber.nextInt();


            System.out.println("Please, enter your third Number");
            thirdNum = takeNumber.nextInt();


            System.out.printf("The sum of %d, %d and %d is %d %n%n", firstNum, secondNum, thirdNum,
                    (firstNum + secondNum + thirdNum));

            System.out.printf("The product of %d, %d and %d is %d%n%n", firstNum, secondNum, thirdNum,
                    (firstNum * secondNum * thirdNum));

            System.out.printf("The average of %d, %d and %d is %d%n%n", firstNum, secondNum, thirdNum,
                    (firstNum + secondNum + thirdNum)/3 );

            if (firstNum > secondNum && firstNum > thirdNum) {
                System.out.printf("%d is the Largest  %n%n", firstNum);
            }

            else if (secondNum > firstNum && secondNum > thirdNum) {
                System.out.printf("%d is the Largest %n %n", secondNum);
            }

            else   {
                System.out.printf("%d is the Largest %n%n", thirdNum);
            }


            if (firstNum < secondNum && firstNum < thirdNum) {
                System.out.printf("%d is the Smallest", firstNum);
            }

            else if (secondNum < firstNum && secondNum < thirdNum) {
                System.out.printf("%d is the Smallest", secondNum);
            }

            else {
                System.out.printf("%d is the Smallest", thirdNum);
            }
        }
    }

