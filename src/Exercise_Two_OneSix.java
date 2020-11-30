    import java.util.Scanner;
  public class Exercise_Two_OneSix {
          public static void main(String[] args) {

              Scanner takeNum = new Scanner(System.in);

              int firstNum;
              int secondNum;

              System.out.print("What's your first number?");
              firstNum = takeNum.nextInt();

              System.out.print("What's your second number ?");
              secondNum = takeNum.nextInt();

              if( firstNum == secondNum) {
                  System.out.println("The numbers are equal");
              }

              else if( secondNum > firstNum) {
                  System.out.printf("%d is larger  %n ", secondNum);
              }

              else {

                  System.out.printf("%d is larger  %n ", firstNum);

              }
          }
      }

