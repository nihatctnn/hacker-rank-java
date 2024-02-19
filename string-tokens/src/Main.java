import java.util.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        int tokenCount = 0;

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        if (!s.isEmpty() && (s.length() <= (4 * Math.pow(10, 5)))) {

            StringTokenizer tokenizer = new StringTokenizer(s, " !,?._'@");
            tokenCount = tokenizer.countTokens();

            System.out.println(tokenCount);

            while (tokenizer.hasMoreTokens()) {
                String token = tokenizer.nextToken();
                System.out.println(token);
            }
        }
    }
}