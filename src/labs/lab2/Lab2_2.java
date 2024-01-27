package labs.lab2;

import java.util.Scanner;

public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();


        if (number % 2 == 0) {
            System.out.println(number + " Day la so chan.");
        } else {
            System.out.println(number + " Day la so le.");
        }
        System.out.println("Goodbye see you again!!");
    }
}
