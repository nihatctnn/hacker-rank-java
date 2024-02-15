import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if((!S.isEmpty()) && (S.length() <= 100)){
            if((start >= 0) && (end > start)){
                System.out.println(S.substring(start,end));
            }
        }
    }
}