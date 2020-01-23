public class EscapeSequences {
    public static void main (String []args) {

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0 || i == 5 || j == 0 || j == 7) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

}
