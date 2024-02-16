import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String reversedString = "";

        if(A.length() <=50) {

            for (int i = 0; i < A.length(); i++) {
                reversedString = A.charAt(i) + reversedString;
            }

            System.out.println((A.compareTo(reversedString) == 0) ? "Yes" : "No");
        }
    }
}