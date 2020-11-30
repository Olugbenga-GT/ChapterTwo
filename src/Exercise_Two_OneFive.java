import java.util.Scanner;
    public class Exercise_Two_OneFive {
        public static void main (String[] args) {

            Scanner takeNumber = new Scanner(System.in);
            int firstNumber;
            int secondNumber;

            System.out.println("Please, enter your first number: ");
            firstNumber = takeNumber.nextInt();

            System.out.println("Please, enter your second number: ");
            secondNumber = takeNumber.nextInt();

            System.out.printf("The average of %d and %d is %d%n",
                    firstNumber, secondNumber, (firstNumber + secondNumber)/2 );

            System.out.printf("The sum of %d and %d is %d%n",
                    firstNumber, secondNumber, (firstNumber + secondNumber));

            System.out.printf("The product of %d and %d is %d%n",
                    firstNumber, secondNumber, (firstNumber * secondNumber));

            System.out.printf("The difference of %d and %d is %d%n",
                    firstNumber, secondNumber, (firstNumber - secondNumber));

        }
    }

