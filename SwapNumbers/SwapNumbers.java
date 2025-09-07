//Programs by Darkz143 :- https://rbportfolio-one.vercel.app/

import java.util.Scanner;

public class SwapNumbers {

    //first way to swap two numbers 
    public static void swap1(int a, int b, int temp) {
        temp = a;
        a = b;
        b = temp;
        System.out.println("This is method one After swapping: a = " + a + ", b = " + b);
    }

    //second way to swap
    public static void swap2(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("This is method two After swapping: a = " + a + ", b = " + b);
    }

    //third way t swap
    public static void swap3(int a, int b) {
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("This is method three After swapping: a = " + a + ", b = " + b);
    }

    //fourth way to swap
    public static void swap4(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("This is method four After swapping: a = " + a + ", b = " + b);
    }

    //fifth way to swap
    public static void swap5(int a, int b) {
        a = a - b;
        b = a + b;
        a = b - a;
        System.out.println("This is method five After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a, b, temp = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Value of a => ");
            a = sc.nextInt();
            System.out.print("Enter Value of b => ");
            b = sc.nextInt();
            System.out.print("By Which method you want to swap the numbers (1-5) => ");
            int n = sc.nextInt();
            switch (n) {
                case 1 ->
                    swap1(a, b, temp);
                case 2 ->
                    swap2(a, b);
                case 3 ->
                    swap3(a, b);
                case 4 ->
                    swap4(a, b);
                case 5 ->
                    swap5(a, b);
                default ->
                    System.out.println("Invalid method");
            }
            sc.close();

        }

    }
}
