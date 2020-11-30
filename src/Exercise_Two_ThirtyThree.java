import java.util.Scanner;

public class Exercise_Two_ThirtyThree {
    public static void main(String[] args) {
        System.out.printf("Welcome to the Body Mass Index Test Centre.%nYour test result and analysis will be ready in split seconds! %n");
        System.out.printf("Please, enter your weight in Kilogram");
        Scanner input = new Scanner(System.in);
        int kg = input.nextInt();
        System.out.printf("Please, enter your height in metres");
        double metres = input.nextDouble();

        double bmi =  (double) kg / (metres * metres);

        if(bmi < 18.5){
            System.out.printf("Oops, You are underweight. Your BMI is: %f", bmi);
        }
        else{
            if(bmi < 25.0){
                System.out.printf("Congrats! Your weight is just perfect!Your BMI is: %f", bmi);
            }
            else {
                if(bmi < 30.0){
                    System.out.printf("Uh Oh! I'm sorry, you're quite overweight! Your BMI is: %f", bmi);
                }
                else{
                    System.out.printf("Maaan! damn!! WTF have you been eating? you're fucking obese Bruh,  %n go get on some diet or workout program. fat fuck");
                }
            }
        }

    }
}
