import java.util.Calendar;

class Result {

    public static String findDay(int month, int day, int year) {
      
        // Create a Calendar instance to work with date and time
        Calendar calendar = Calendar.getInstance();

        // Set the calendar to the specified date (Month is 0-indexed, so subtract 1)
        calendar.set(year, month - 1, day);

        // Get the day of the week (1 = Sunday, 2 = Monday, ..., 7 = Saturday)
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Array to map the numeric representation of the day to its corresponding name
        String[] daysOfWeek = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        // Return the day of the week as a string
        return daysOfWeek[dayOfWeek];
    }

}
