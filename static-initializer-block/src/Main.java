import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result;

        Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        int H = scan.nextInt();

        if ((B >= -100) && (B <= 100) && (H >= -100) && (H <= 100)) {

            if ((B <= 0) || (H <= 0)) {
                System.out.println("java.lang.Exception: Breadth and height must be positive");
            } else {
                result = B * H;
                System.out.println(result);
            }

        }
    }
}