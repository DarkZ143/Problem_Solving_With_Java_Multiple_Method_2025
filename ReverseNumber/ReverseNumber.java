//Programs by Darkz143 :- https://rbportfolio-one.vercel.app/

import java.util.Scanner;

public class ReverseNumber {

    //first way to reverse number :
    public static void reverse1(int n, int temp, int reverse) {
        reverse = 0;
        int original = n;
        while (n > 0) {
            temp = n % 10;
            reverse = reverse * 10 + temp;
            n = n / 10;
        }
        System.out.println("This is method one and reverse of " + original + " is : " + reverse);
    }

    //Second Method
    public static void reverse2(String n) {
        StringBuffer sb = new StringBuffer(String.valueOf(n));
        StringBuffer rev = sb.reverse();
        System.out.println("This is second method and reverse of " + sb + " is : " + rev);

    }

    //Third Method
    public static void reverse3(String n) {
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        StringBuilder rev = sb.reverse();
        System.out.println("This is third method and reverse of " + sb + " is : " + rev);

    }

    public static void main(String[] args) {
        int n, temp = 0, rev = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number => ");
            n = sc.nextInt();
            System.out.println("Method 1-3 => ");
            int choice = sc.nextInt();
            sc.close();
            switch (choice) {
                case 1 ->
                    reverse1(n, temp, rev);
                case 2 ->
                    reverse2(String.valueOf(n));
                case 3 ->
                    reverse3(String.valueOf(n));
                default ->
                    System.out.println("Choose Option Only 1 to 3 !");
            }

        }

    }
}
