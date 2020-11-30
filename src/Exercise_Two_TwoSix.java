import java.util.Scanner;

public class Exercise_Two_TwoSix {
    public static void main(String[] args) {

        Scanner check = new Scanner(System.in);

        int firstNum, secondNum;

        System.out.println("Please, enter your first number");
        firstNum = check.nextInt();

        System.out.println("Please, enter your second number");
        secondNum = check.nextInt();

        if ((secondNum % firstNum) == 0)
            System.out.printf("%d is a multiple of %d", secondNum, firstNum);


        else System.out.printf("%d is  not a multiple of %d", secondNum, firstNum);
    }
}
