import java.util.*;

class MyRegex {
    public static final String regularExpression = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";

}

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        while (scan.hasNextLine()) {
            String ip = scan.nextLine();

            if (ip.matches(MyRegex.regularExpression)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}