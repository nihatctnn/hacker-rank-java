//import java.io.*;
//import java.util.*;
//
//class Result {
//    public static String findDay(int month, int day, int year) {
//        Calendar calendar = Calendar.getInstance();
//        calendar.set(year, month - 1, day);  // Month in Calendar is 0-indexed, so subtract 1 from the month
//
//        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
//
//        String[] daysOfWeek = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
//
//        return daysOfWeek[dayOfWeek];
//    }
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        if (firstMultipleInput.length != 3) {
//            System.out.println("Invalid input");
//            return;
//        }
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//        int day = Integer.parseInt(firstMultipleInput[1]);
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = Result.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
//
//
//


//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//class Result {
//
//    /*
//     * Complete the 'findDay' function below.
//     *
//     * The function is expected to return a STRING.
//     * The function accepts following parameters:
//     *  1. INTEGER month
//     *  2. INTEGER day
//     *  3. INTEGER year
//     */
//
//    public static String findDay(int month, int day, int year) {
//
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//
//        int day = Integer.parseInt(firstMultipleInput[1]);
//
//        int year = Integer.parseInt(firstMultipleInput[2]);
//
//        String res = Result.findDay(month, day, year);
//
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
