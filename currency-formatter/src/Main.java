import java.io.*;
import java.util.*;
import java.util.Locale;
import java.text.NumberFormat;

//  try running in java 8 , not java 15.

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double payment = scan.nextDouble();

        Locale INDIA = new Locale("en", "IN");//Creates a new Locale with English as the language and India as teh country

        if (payment >= 0 && payment <= 1e9) {

            // Create NumberFormat instances for different locales
            NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
            NumberFormat indianFormat = NumberFormat.getCurrencyInstance(INDIA);
            NumberFormat chineseFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
            NumberFormat frenchFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);

            // Format the payment amount into different currency formats
            String u = usFormat.format(payment);
            String i = indianFormat.format(payment);
            String c = chineseFormat.format(payment);
            String f = frenchFormat.format(payment);

            // Print the formatted values
            System.out.println("US: " + u);
            System.out.println("India: " + i);
            System.out.println("China: " + c);
            System.out.println("France: " + f);

        }
    }
}