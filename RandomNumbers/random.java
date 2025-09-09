
import java.util.Random;
import java.util.Scanner;

public class random {

    public static void RandomNumber(int n) {
        Random rand = new Random();
        int random = rand.nextInt(n);
        System.out.println("Genrated Random Number : " + random);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Range => ");
            int n = sc.nextInt();
            RandomNumber(n);
            sc.close();
        }
    }
}
