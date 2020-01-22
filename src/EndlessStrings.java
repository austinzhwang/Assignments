import java.util.Scanner;

public class EndlessStrings {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";
        userInput = keyboard.nextLine();
        System.out.println(userInput);

        while (userInput != "") {
            userInput = keyboard.nextLine();
            System.out.println(userInput);
            if (userInput.isEmpty()) {
                break;
            }
        }

    }
}