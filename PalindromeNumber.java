package ro.fasttrackit.HelloWorld;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 1551;
        System.out.println("The number is: " + num);

        int originalNumber = num;

        int reverse = 0;

        while (num != 0) {
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }

        if (originalNumber == reverse) {
            System.out.println("The number: " + originalNumber + " is a palindrome number");
        } else {
            System.out.println("The number: " + originalNumber + " isn't a palindrome number");
        }
    }
}
