
import java.util.Scanner;

public class program {

    public static void SumOfElement(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of Element of your given array is : " + sum);
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
            SumOfElement(numbers);
            sc.close();
        }

    }

}
