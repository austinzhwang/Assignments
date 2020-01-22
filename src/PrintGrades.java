import java.util.Scanner;

public class PrintGrades {

    public static void main(String [] args) {

        Scanner in = new Scanner(System.in);

        // boolean to check whether or not to end loop
        boolean stopFlag = false;

        while (stopFlag == false) {
            System.out.print("Enter an exam score: ");
            String input = in.nextLine();
            int score = Integer.parseInt(input);
            System.out.println("Good job. Your grade is " + printScore(score));
            System.out.print("Do you want to enter another score (Y/N)? ");
            String runAgain = in.next();
            if (runAgain.equals("Y".toLowerCase())) {
                stopFlag = false;
            } else {
                stopFlag = true;
            }
            in.nextLine();
        }
    }

    // method that calculates a user's letter grade based on their numeric score
    public static String printScore(int score) {
        if (score >= 97 && score <= 100) {
            return "Great job. Your grade is A+";
        } else if (score >= 94 && score <= 96) {
            return "Great job. Your grade is A";
        } else if (score >= 90 && score <= 93) {
            return "Great job. Your grade is A-";
        } else if (score >= 87 && score <= 89) {
            return "Good job. Your grade is B+";
        } else if (score >= 84 && score <= 86) {
            return "Good job. Your grade is B";
        } else if (score >= 80 && score <= 83) {
            return "Good job. Your grade is B-";
        } else if (score >= 77 && score <= 79) {
            return "Good job. Your grade is C+";
        } else if (score >= 74 && score <= 76) {
            return "Good job. Your grade isC";
        } else if (score >= 70 && score <= 73) {
            return "Good job. Your grade is C-";
        } else if (score >= 60 && score <= 69) {
            return "Bad job. Your grade is D";
        } else if (score < 60) {
            return "Go back to school; you got below 60";
        }
        return "invalid score";
    }
}
