import java.util.Arrays;
import java.util.Scanner;

public class Main {
    // This method checks if two given strings are anagrams.
    static boolean isAnagram(String a, String b) {
        // Convert all letters in strings to lowercase.
        a = a.toLowerCase();
        b = b.toLowerCase();

        // If the lengths of the strings are different, they can't be anagrams.
        if (a.length() != b.length())
            return false;

        // Convert strings to character arrays.
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();

        // Sort the character arrays.
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        // Check each character at corresponding positions.
        for (int i = 0; i < a.length(); i++) {
            // If characters at corresponding positions are different, they are not anagrams.
            if (arrayA[i] != arrayB[i])
                return false;
        }
        // If all characters match, they are anagrams.
        return true;
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input.
        Scanner scan = new Scanner(System.in);
        // Take two strings as input.
        String a = scan.next();
        String b = scan.next();

        // Process if strings are not empty and are of length less than or equal to 50.
        if (((!a.isEmpty()) && (!b.isEmpty())) && ((a.length() <= 50) && (b.length() <= 50))) {
            // Call the isAnagram method and print the result.
            boolean ret = isAnagram(a, b);
            System.out.println((ret) ? "Anagrams" : "Not Anagrams");
        }
    }
}
