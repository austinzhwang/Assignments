import java.util.Scanner;

public class UserInput {

    public static void main(String []args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first initial: ");
        String firstInitial = in.next();
        System.out.println("Enter the last name: ");
        String lastName = in.next();
        System.out.println("Enter the house number: ");
        int houseNumber = in.nextInt();
        System.out.println("Enter the street name: ");
        String streetName = in.next();
        System.out.println("Enter the street type: ");
        String streetType = in.next();
        System.out.println("Enter the city: ");
        String city = in.next();
        in.close();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}

