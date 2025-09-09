
import java.util.Scanner;

public class program {

    public static void LargestOne(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("A is greater than all values.");
        } else if (b > a && b > c) {
            System.out.println("B is greater than all values");
        } else {
            System.out.println("C is greate than all values.");
        }
    }

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Value of A => ");
            int a = sc.nextInt();
            System.out.print("Enter Value of B => ");
            int b = sc.nextInt();
            System.out.print("Enter Value of C => ");
            int c = sc.nextInt();
            LargestOne(a, b, c);
            sc.close();
        }
    }
}
