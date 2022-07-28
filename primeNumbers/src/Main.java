import java.util.Scanner;

public class Main {
    static boolean isPrime(int n, int i) {
        if (n < 2) {
            return false;
        } else if (n == 2) {
            return true;
        }
        if (n % i == 0) {
            return false;
        }
        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);

    }

    public static void main(String[] args) {
        int number;
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number: ");
            number = inp.nextInt();

            if (isPrime(number, 2)) {
                System.out.println(number + " is prime number.");
            } else {
                System.out.println(number + " is not prime number.");
            }
        }

    }
}