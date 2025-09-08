
import java.util.Scanner;

public class DigitCount {

    public static void digitCount(int n) {
        String digits = String.valueOf(n);
        int count = digits.length();
        System.out.println("Digit count in the number is : " + count);
    }

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number => ");
            n = sc.nextInt();
            sc.close();
            digitCount(n);

        }
    }
}
