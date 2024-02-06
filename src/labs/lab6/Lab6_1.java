package labs.lab6;

public class Lab6_1 {
    /*
    Given input string: "2hrs and 5 minutes"
    Please calculate how many minutes in total
     */
    public static void main(String[] args) {
        // Input string
        String time = "2hrs and 5 minutes";

        // We'll use these variables to store the extracted hours and minutes
        int hours = 0;
        int minutes = 0;

        // Split the string into parts using "and" as the delimiter
        String[] parts = time.split(" and ");

        // Extract hours from the first part
        // We replace "hrs" with an empty string to get just the numerical part
        String hoursPart = parts[0].replace("hrs", "").trim();
        hours = Integer.parseInt(hoursPart);

        // Extract minutes from the second part
        // We replace "minutes" with an empty string to get just the numerical part
        String minutesPart = parts[1].replace("minutes", "").trim();
        minutes = Integer.parseInt(minutesPart);

        // Convert hours to minutes and add to the total minutes
        int totalMinutes = hours * 60 + minutes;

        // Print the result
        System.out.println("Total minutes: " + totalMinutes);
    }
}
