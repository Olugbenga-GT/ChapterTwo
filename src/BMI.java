public class BMI {
    private int weight;
    private double height;
    private double bmi;

    public BMI(int weight, double height, double bmi) {
        this.weight = weight;
        this.height = height;
        this.bmi = bmi;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBmi (double bmi) {
        if(weight > 0.0 && height > 0.0 ){
            this.bmi = height / weight * weight;
        }
    }

    public double calculateBMI() {
        return bmi;
    }
}

//    public static void main(String[] args) {
//        System.out.printf("Welcome to the Body Mass Index Test Centre.%nYour test result and analysis will be ready in split seconds! %n");
//        System.out.printf("Please, enter your weight in Kilogram");
//        Scanner input = new Scanner(System.in);
//        int kg = input.nextInt();
//        System.out.printf("Please, enter your height in metres");
//        double metres = input.nextDouble();
//
//        double bmi =  (double) kg / (metres * metres);
//
//        if(bmi < 18.5){
//            System.out.printf("Oops, You are underweight. Your BMI is: %f", bmi);
//        }
//        else{
//            if(bmi < 25.0){
//                System.out.printf("Congrats! Your weight is just perfect!Your BMI is: %f", bmi);
//            }
//            else {
//                if(bmi < 30.0){
//                    System.out.printf("Uh Oh! I'm sorry, you're quite overweight! Your BMI is: %f", bmi);
//                }
//                else{
//                    System.out.printf("Maaan! damn!! WTF have you been eating? you're fucking obese Bruh,  %n go get on some diet or workout program. fat fuck");
//                }
//            }
//        }
//
//    }

