
import java.util.Scanner;

public class Palindrome {

    //First way to check Palindrome
    public static void method1(int n) {
        int sum = 0, temp, original = n;
        while (n > 0) {
            temp = n % 10;
            sum = sum * 10 + temp;
            n = n / 10;
        }
        if (original == sum) {
            System.out.println("Yes " + original + " is palindrome number.");
        } else {
            System.out.println("No " + original + " is not a plaindrome number!");
        }

    }

    //Second way to check palindrome
    public static void method2(String n) {
        StringBuffer sb = new StringBuffer(n);
        StringBuffer original = new StringBuffer(n);
        StringBuffer rev = sb.reverse();
        if (original.toString().equals(rev.toString())) {
            System.out.println("Yes " + n + " is palindrome number.");
        } else {
            System.out.println("No " + n + " is not a plaindrome number!");
        }
    }

    //Third way to check Palindrome
    public static void method3(String n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        StringBuilder original = sb;
        StringBuilder rev = sb.reverse();
        if (original.toString().equals(rev.toString())) {
            System.out.println("Yes " + n + " is palindrome number.");
        } else {
            System.out.println("No " + n + " is not a palindrome number!");
        }
    }

    public static void main(String[] args) {
        int n;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number => ");
            n = sc.nextInt();
            System.out.print("Which method 1-3 => ");
            int Choice = sc.nextInt();
            sc.close();
            switch (Choice) {
                case 1 ->
                    method1(n);
                case 2 ->
                    method2(String.valueOf(n));
                case 3 ->
                    method3(String.valueOf(n));
                default ->
                    System.out.println("Invalid Choice!");
            }
        }

    }
}
