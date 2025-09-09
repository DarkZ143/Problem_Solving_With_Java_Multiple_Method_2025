
import java.util.Scanner;

public class program {

    public static void Fibonacci(int n) {
        //0,1,1,2,3,5,8,13,21.....

        if (n > 0) {
            int a = 0, b = 1, next;
            System.out.println("Fibonacci series upto " + n + "th term : ");
            System.out.print(a + "," + b);
            for (int i = 2; i <= n; i++) {
                next = a + b;
                System.out.print("," + next);
                a = b;
                b = next;

            }
        } else {
            System.out.println("Enter Number Greater than 0!");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number => ");
            int n = sc.nextInt();
            Fibonacci(n);
            sc.close();
        }

    }
}
