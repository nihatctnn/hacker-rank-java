public class Main {
    public static void main(String[] args) {

        String s;
        int n = 0;

        try {

            s = String.valueOf(Integer.valueOf(n));
            System.out.println("Good job");

        } catch (Exception error) {
            System.out.println("Wrong answer");
        }

    }
}