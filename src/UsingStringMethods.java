import java.util.Scanner;

public class UsingStringMethods {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word: " );
        String inputWord = in.nextLine();
        System.out.print("Enter a number as an index : ");
        int inputIndex = in.nextInt();

        if (inputIndex > inputWord.length()-1) {
            System.out.println("Index is larger than length");
        } else {
            System.out.println("The length of " + inputWord + " is: " + inputWord.length());
            System.out.println("The substring from 0 to " + inputIndex + " is: " + inputWord.substring(0, inputIndex));
        }
        in.close();
    }

}