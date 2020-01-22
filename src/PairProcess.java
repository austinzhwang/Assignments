import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        int sum = num1 + num2;
        int product = num1 * num2;
        int avg = (num1 + num2) / 2;

        if (sum > 200 && sum <1000) {
            System.out.println("Sum: " + sum + "*~");
        } else if (sum > 1000) {
            System.out.println("Sum: " + sum + "*");
        } else {
            System.out.println("Sum: " + sum);
        }

        System.out.println("Product: " + product);
        System.out.println("Average: " + avg);
    }

}
