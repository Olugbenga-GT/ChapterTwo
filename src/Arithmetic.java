// Largest of three Integers.
    import java.util.Scanner;
public class Arithmetic {
    private int firstNumber;
    private int secondNumber;
    private  int thirdNumber;

    public Arithmetic (int firstNumber, int secondNumber, int thirdNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return  secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int getThirdNumber() {
        return  thirdNumber;
    }

    public void setThirdNumber(int thirdNumber) {
        this.thirdNumber = thirdNumber;
    }
    public int calculateProduct() {
        int product = firstNumber * secondNumber * thirdNumber;
        return  product;
    }

    public int calculateSum() {
        int sum =  firstNumber + secondNumber +  thirdNumber;
        return sum;
    }

    public double calculateAverage() {
        double average = calculateSum() / 3;
        return average;
    }

    public int computeHighest() {
        int highest = Integer.MIN_VALUE;
        if (firstNumber > highest && firstNumber > secondNumber && firstNumber > thirdNumber){
            highest = firstNumber; }
        else if (secondNumber > highest && secondNumber > firstNumber && secondNumber > thirdNumber){
            highest = secondNumber; }
            else {highest = thirdNumber;}
            return highest;}

    public int computeLowest() {
        int lowest = Integer.MAX_VALUE;
        if (firstNumber < lowest && firstNumber < secondNumber && firstNumber < thirdNumber){
            lowest = firstNumber; }
        else if (secondNumber < lowest && secondNumber < firstNumber && secondNumber < thirdNumber){
            lowest = secondNumber; }
        else {lowest = thirdNumber;}
        return lowest;}
    }

