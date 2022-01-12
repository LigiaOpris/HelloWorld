package ro.fasttrackit.HelloWorld;

public class PrimeNumbersBelow {
    public static void main(String[] args) {
        int num = 10;
        int primeNumbers;

        while (num != 0) {
            num = num - 1;
            if (is_Prime(num)) {
                if (num != 0) {
                    primeNumbers = num;
                    System.out.println("A prime number below 10 is: " + primeNumbers + " ");
                }
            }
        }
    }

    public static boolean is_Prime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
