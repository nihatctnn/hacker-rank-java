import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Main {

    public static void main(String[] args) {

        int i = 0;
        String inputString;

        Scanner scanner = new Scanner(System.in);
        int numCases = scanner.nextInt();
        scanner.nextLine();

        for (i = 0; i < numCases; i++) {

            inputString = scanner.nextLine();

            if (isStringValid(inputString)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    private static boolean isStringValid(String inputString) {
        try {
            Pattern.compile(inputString);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}