
import java.util.Scanner;

public class program {

    public static void checkNumber(long n) {
        long temp, odd = 0, even = 0;
        while (n > 0) {
            temp = n % 10;
            n = n / 10;
            if (temp % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }
        System.out.println("Odd Count : " + odd);
        System.out.println("Even Count : " + even);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number => ");
            String input = sc.next(); // read as String first
            if (input.length() < 20) {
                long n = Long.parseLong(input);
                checkNumber(n);
            } else {
                System.out.println("Enter value having less than 20 digits only!");
            }
        }

    }
}
