import java.util.Scanner;

public class Exercise_Two_TwoEight {
        public static void main(String[] args){

            Scanner takeNumber = new Scanner(System.in);
            double pi = Math.PI;

            System.out.printf("Please, input your radius: ");
            int radius = takeNumber.nextInt();

            System.out.printf("The diameter of your Circle is %d%n%n", (2 * radius));

            System.out.printf("The circumference of your Circle is %f%n%n", (2 * pi * radius));

            System.out.printf("The area of your Circle is %f%n", ( pi * radius * radius));

        }
}
