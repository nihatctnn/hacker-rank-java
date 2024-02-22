import java.util.Scanner;

class UsernameValidator {
    // A constant expression regularExpression is defined.
    // This expression will be used to validate valid usernames.
    // The expression contains a regular expression defining a valid username.
    // A username should start with an alphabetical character followed by 7 to 29 (inclusive) alphanumeric characters or underscore.
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        // Input is taken from the user: first the number of usernames, then each username.
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String username = scan.nextLine();

            // If the username matches the regularExpression (i.e., it's a valid username):
            if (username.matches(UsernameValidator.regularExpression)) {
                // "Valid" is printed.
                System.out.println("Valid");
            } else {
                // Otherwise, "Invalid" is printed.
                System.out.println("Invalid");
            }
        }
    }
}
