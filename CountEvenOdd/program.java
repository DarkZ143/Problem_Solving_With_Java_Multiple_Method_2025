
import java.util.Scanner;

public class program {

    public static void CountEvenOdd(int[] arr) {
        int odd = 0, even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of Odd element in array => " + odd);
        System.out.println("Number of even element in array => " + even);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of element you want to store => ");
            int n = sc.nextInt();
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter element of index " + i + " => ");
                numbers[i] = sc.nextInt();
            }
            CountEvenOdd(numbers);
            sc.close();
        }
    }

}
