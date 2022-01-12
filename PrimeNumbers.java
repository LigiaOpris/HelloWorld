package ro.fasttrackit.HelloWorld;

public class PrimeNumbers {
    public static void main(String[] args) {

        int sum = 1;
        int x = 0;
        int num = 0;

        while (x <= 100) {
            num++;
            if (is_Prime(num)) {
                sum = sum + num;
                x++;
            }
        }
        System.out.println("The sum of the first 100 numbers is: " + sum);
    }

    public static boolean is_Prime(int num) {
        for (int i = 2; i < num; i = i + 1) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
