import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        int number=1;

        Scanner scan = new Scanner(System.in);

        do {

            System.out.println(number +" "+ scan.nextLine());
            number+=1;
        }
        while(scan.hasNext());

    }
}