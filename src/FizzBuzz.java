public class FizzBuzz {
    public static void main (String []args) {

        /* Prints out FizzBuzz if # is a multiple of 5 and 3
         * Prints Fizz if # is a multiple of 3
         * Prints Buzz if # is a multiple of 5
         */
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
