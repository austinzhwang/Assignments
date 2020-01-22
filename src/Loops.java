import java.util.Scanner;

public class Loops {
    public static void main(String []args) {

        //prints 1-10
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //prints 1-10 backwards
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //prints all odd numbers from 1-20
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //prints all even numbers from 1-20
        for (int i = 1; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        //print all numbers from user input value to 1
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = in.nextInt();
        if (input == 1) {
            System.out.println(1);
        } else if (input < 1) {
            for (int i = input; i < 2; i++) {
                System.out.print(i + " ");
            }
        } else {
                for (int i = input; i > 0; i--) {
                    System.out.print(i + " ");
                }
        }

        System.out.println();

        //sums all numbers from 1-10
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(sum);

        //print the sum all numbers from user input value to 1

        System.out.print("Enter a number: ");
        int inputTwo = in.nextInt();
        int sumTwo = 0;

        if (inputTwo == 1) {
            sumTwo = 1;
        } else if (inputTwo < 1) {
            for (int i = inputTwo; i < 2; i++) {
                sumTwo += i;
            }
        } else {
            for (int i = inputTwo; i > 0; i--) {
                sumTwo += i;
            }
        }
        System.out.println(sumTwo);

        //i
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //ii
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j <= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //iii
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //factorial of a number
        System.out.println("Enter a number: ");
        int factorialInput = in.nextInt();
        int factorial = 1;
        for (int i = factorialInput; i > 0; i--) {
            factorial *= i;
        }
        System.out.println(factorial);

    }
}
