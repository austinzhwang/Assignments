import java.util.Scanner;

public class LoopsExercises {
    public static void main(String []args) {
        Scanner in = new Scanner(System.in);

        // cube of all numbers within user input bound
        System.out.print("Enter a number: ");
        int inputCubed = in.nextInt();
        for (int i = 0; i <= inputCubed; i++) {
            System.out.println(i + " cubed is: " + (i * i * i));
        }

        // multiplication table up to 10 for user input.
        System.out.print("Enter a number: ");
        int inputMult = in.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " * " +  inputMult + " = " + (i * inputMult));
        }

        // output all odd #'s up to the user input and their sum
        System.out.print("Enter a number: ");
        int oddInput = in.nextInt();
        int oddSum = 0;
        for (int i = 0; i <= oddInput; i++) {
            if (i % 2 == 1) {
                oddSum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("Sum of odd #'s: " + oddSum);

        // output all even #'s up to the user input and their sum
        System.out.print("Enter a number: ");
        int evenInput = in.nextInt();
        int evenSum = 0;
        for (int i = 0; i <= evenInput; i++) {
            if (i % 2 == 0) {
                evenSum += i;
                System.out.print(i + " ");
            }
        }
        System.out.println("Sum of even #'s: " + evenSum);

        //7
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        in.close();
    }
}
