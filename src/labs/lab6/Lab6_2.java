package labs.lab6;

import java.util.Scanner;

public class Lab6_2 {
    /*
    String myPassword = "password123";
    Allow user to input maximum 3 times
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "password123";
        int maxAttempts = 3;
        int attempts = 0;

        while (attempts < maxAttempts) {
            System.out.println("Enter the password: ");
            String userPassword = scanner.nextLine();

            if (userPassword.equals(correctPassword)) {
                System.out.println("Password correct. Access granted!");
                break;
            } else {
                attempts++;
                int remainingAttempts = maxAttempts - attempts;
                System.out.println("Incorrect password. Attempts left: " + remainingAttempts);

                if (remainingAttempts > 0) {
                    System.out.println("Please try again.");
                } else {
                    System.out.println("Maximum attempts reached. Access denied.");
                }
            }
        }
    }
}
