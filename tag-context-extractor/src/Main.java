import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){

            if (!in.hasNextLine()) {
                break;
            }

            String line = in.nextLine();
            Matcher matcher = Pattern.compile("<(.+)>(([^<>]+))</\\1>").matcher(line);
            if (!matcher.find()) {
                System.out.println("None");
                continue;
            }
            matcher.reset();
            while (matcher.find()){
                System.out.println(matcher.group(2));
            }
            testCases--;
        }
    }
}