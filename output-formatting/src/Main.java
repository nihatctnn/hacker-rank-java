import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("================================");

        while(scan.hasNext()){

            String text = scan.next();
            int number = scan.nextInt();

            System.out.printf("%-15s%03d\n", text, number);

        }

        System.out.println("================================");
    }
}