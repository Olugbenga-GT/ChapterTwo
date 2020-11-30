import java.util.Scanner;
public class Exercise_Two_Thirty {
    public static void main(String[] args) {
        Scanner takeNumber = new Scanner(System.in);
        System.out.println("Please input a five-digit number: ");
        int digit = takeNumber.nextInt();
        if (digit > 9999  && digit < 100000){
            int div1 = digit / 10;
            int mod1 = digit % 10;

            int div2 = div1 / 10;
            int mod2 = div1 % 10;

            int div3 = div2 / 10;
            int mod3 = div2 % 10;

            int div4 = div3 / 10;
            int mod4 = div3 % 10;

            int div5 = div4 / 10;
            int mod5 = div4 % 10;
            System.out.printf("The spaced form of your input is: %d   %d   %d   %d   %d ",
                                mod5, mod4, mod3, mod2, mod1);
        }
         else   System.out.println("Invalid input. please input a five-digit number!");
    }
}
