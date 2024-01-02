import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

            // Prompt user to enter an integer value
            int intInput = scanner.nextInt();

            // Prompt user to enter a double value
            String userInput = scanner.next();
            double doubleInput = Double.parseDouble(userInput.replace(',', '.'));

            scanner.nextLine();

            // Prompt user to enter a string value
            String stringInput = scanner.nextLine();

            // Print the entered values
            System.out.println("String: " + stringInput);
            System.out.println("Double: " + doubleInput);
            System.out.println("Int: " + intInput);
        }

        catch (InputMismatchException e) {
            // Handle the case where the user enters the wrong input type for integer or double
            System.out.println("Wrong input type. Please enter the correct type.");
        }
    }
}
