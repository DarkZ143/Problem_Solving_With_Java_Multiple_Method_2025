
import java.util.Scanner;

public class program {

    public static void StringPalindrom(String s) {
        String original = s;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        StringBuilder rev = sb.reverse();
        if (original.equals(rev.toString())) {
            System.out.println("Yes given " + original + " is palindrome string.");
        } else {
            System.out.println("No given " + original + " is not palindrome string!");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any string => ");
            String s = sc.nextLine();
            StringPalindrom(s);
            sc.close();
        }
    }
}
