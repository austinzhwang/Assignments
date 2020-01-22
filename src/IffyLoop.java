import java.util.Scanner;

public class IffyLoop {
    public static void main(String []args) {

        Scanner in = new Scanner(System.in);

        String storageFiveWords = "";
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter a word: ");
            String word = in.nextLine();
            storageFiveWords += word + " ";
        }
        System.out.println(storageFiveWords);
        boolean redEyes = false;
        String runAgain = "";
        do {
            System.out.print("Are your eyes red? ");
            String input = in.nextLine();

            if (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("YES")) {
                redEyes = true;
            } else {
                redEyes = false;
            }

            if (redEyes = true) {
                System.out.println("Get some sleep!");
            } else {
                System.out.println("You look great!");
            }
            System.out.println("Do you want to try again? (y/n) ");
            runAgain = in.nextLine();
        } while (!(runAgain.equals("n")));

    }
}
