
import java.util.Scanner;

public class prime {

    public static void checkPrime(int n) {
        if (n <= 1) {
            System.out.println("No " + n + " is not a prime number!");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("No " + n + " is not a prime number!");
                return;
            }
        }
        System.out.println("Yes " + n + " is a prime number.");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number => ");
            int n = sc.nextInt();
            checkPrime(n);
        }
    }
}
