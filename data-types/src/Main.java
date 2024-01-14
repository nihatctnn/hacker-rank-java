import java.util.*;

class Main {
    public static void main(String[] argh) {

        // Creating a Scanner object to take input from the user.
        Scanner scan = new Scanner(System.in);

        // Taking the number of tests, 't', as input.
        int t = scan.nextInt();

        // Loop for each test case.
        for (int i = 0; i < t; i++) {

            try {
                // Taking a number as input for the current test.
                long n = scan.nextLong();

                // Determining which data type the number can fit into.
                System.out.println(n + " can be fitted in:");

                if ((n >= Byte.MIN_VALUE) && (n <= Byte.MAX_VALUE))
                    System.out.println("* byte");
                if ((n >= Short.MIN_VALUE) && (n <= Short.MAX_VALUE))
                    System.out.println("* short");
                if ((n >= Integer.MIN_VALUE) && (n <= Integer.MAX_VALUE))
                    System.out.println("* int");

                // Since long has a wider range than the other data types, it always fits.
                System.out.println("* long");

            } catch (Exception error) {
                // If the number doesn't fit into the expected data types, an exception is caught.
                // In this case, the number that caused the error is printed with the message "can't be fitted anywhere."
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }
    }
}