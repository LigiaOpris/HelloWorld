package ro.fasttrackit.HelloWorld;

public class ArithmeticNumber {
    public static void main(String[] args) {
        System.out.println("We are going to calculate an arithmetic operation");

        int firstNumber = 10;
        System.out.println("The first number is: " + firstNumber);

        int operation;
        int secondNumber = 14;

        System.out.println("The second number is: " + secondNumber);

        operation = (firstNumber + secondNumber) / 2;

        System.out.println("The calculation is: "+operation);
    }
}
