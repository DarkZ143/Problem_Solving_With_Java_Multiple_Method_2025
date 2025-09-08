
import java.util.Scanner;

public class program {

    public static void SumOfAllDigit(int n) {
        int original = n;
        int temp, sum = 0;
        while (n > 0) {
            temp = n % 10;
            n = n / 10;
            sum = sum + temp;
        }
        System.out.println("Sum of all digit of " + original + " is : " + sum);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number => ");
            int n = sc.nextInt();
            SumOfAllDigit(n);
            sc.close();
        }

    }
}
