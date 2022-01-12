package ro.fasttrackit.HelloWorld;

public class NumberOfDays {
    public static void main(String[] args) {
        int year = 2000;
        System.out.println("The year is " + year);

        System.out.println("Let's see if the year is a leap year");

        int regularYear = 28;
        int leapYear = 29;

        if (year >= 1900) {
            if (year <= 2021) {
                if (year % 4 == 0) {
                    System.out.println("This year had this number of days: " + leapYear + "; so it is a LEAP year!!!");
                } else {
                    System.out.println("This year had this number of days: " + regularYear + "; so it is a REGULAR year!!!");
                }
            } else {
                System.out.println("Pick another year!!!");
            }
        } else {
            System.out.println("Pick another year!!!");
        }
    }
}
