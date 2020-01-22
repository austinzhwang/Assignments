import java.util.Scanner;

public class SwitchMonths {

    public static void main (String []args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of days in a month: ");
        int input = in.nextInt();

        String months;
        switch (input) {
            case 28:
                case29: {
                    months = "February";
                    break;
                }
            case 30: months = "September April June November";
            break;
            case 31: months = "January March May July September October December";
            break;
            default: months = "No months have exactly " + input + " days";
            break;

        }
        System.out.println(months);
    }
}
