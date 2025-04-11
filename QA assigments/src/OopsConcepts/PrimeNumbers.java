package OopsConcepts;

public class PrimeNumbers {
    public static void main(String[] args) {
        /*
        What is a prime number?
        divisible by 1 or themselves
        3,5,7,11,13,17
        9,15,21
        write a program that output a message indicating whether the number is a prime number or not
        */
        System.out.println("PRIME NUMBER");
        int number = 7;
        boolean prime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                prime = false;
                break;
            }
        }
        if (number > 2 && prime) {
            System.out.println(number + " is a prime number!");
        } else System.out.println(number + " is not a prime number!");
    }
}