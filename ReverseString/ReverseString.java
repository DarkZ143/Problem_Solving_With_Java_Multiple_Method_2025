
import java.util.Scanner;

public class ReverseString {

    // First method to reverse a string
    public static String reverse1(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Second method to reverse a string
    public static String reverse2(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Third method to reverse a string
    public static String reverse3(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder reversed = new StringBuilder();
        for (int i = charArray.length - 1; i >= 0; i--) {
            reversed.append(charArray[i]);
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String original;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        original = sc.nextLine();
        System.out.println("Which method do you want to use (1-3)?");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 ->
                System.out.println("Reversed (Method 1): " + reverse1(original));
            case 2 ->
                System.out.println("Reversed (Method 2): " + reverse2(original));
            case 3 ->
                System.out.println("Reversed (Method 3): " + reverse3(original));
            default ->
                System.out.println("Invalid choice");
        }
    }
}
