import java.util.Scanner;

class Main {
    public static void main(String[] argh) {

        Scanner in = new Scanner(System.in);
        int number_of_queries = in.nextInt();

        for (int i = 0; i < number_of_queries; i++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = a;

            for (int j = 0; j <= n-1; j++) {
                result += (int) (Math.pow(2, j) * b);
                System.out.print(Integer.toString(result) + ' ');
            }
            System.out.println();
        }

    }
}