import java.util.Scanner;

//Products of Integers
public class Exercise_Two_Five {
    public static void main(String[] args) {
        int x, y, z, result;
        Scanner input = new Scanner(System.in);

        System.out.println("Input number: ");
        x = input.nextInt();

        System.out.println("Input number: ");
        y = input.nextInt();

        System.out.println("Input number: ");
        z = input.nextInt();

        result = x * y * z;
        System.out.printf("The product of %d, %d and %d is %d", x, y, z, result);
    }
}
