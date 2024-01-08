import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N;

        System.out.print("Please enter a number: ");
        N = scan.nextInt();

        if(N >= 2 && N <= 20){
            for(int i=1; i<=10; i++){

                int result = i*N;
                System.out.println(N+"\tx\t"+ i +"\t=\t"+ result);
            }
        }

    }
}