import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String str2 = scan.nextLine();

        System.out.println(str1.length() + str2.length());

        System.out.println((str1.compareTo(str2) > 0) ? "Yes" : "No");

        String str1Cap = str1.substring(0,1).toUpperCase() + str1.substring(1);
        String str2Cap = str2.substring(0,1).toUpperCase() + str2.substring(1);
        System.out.println(str1Cap + " " + str2Cap);
    }
}