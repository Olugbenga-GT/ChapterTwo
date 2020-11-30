import java.util.Scanner;

public class Exercise_Two_TwoFive {
    public static void main(String[] args) {

        Scanner check = new Scanner (System.in);

        int firstNum;

        System.out.println("Please, enter your number");
        firstNum = check.nextInt();

        if ((firstNum % 2) == 0)
            System.out.printf("the %d is an even number", firstNum);

        else System.out.printf("The %d is an odd number", firstNum);

    }
}
