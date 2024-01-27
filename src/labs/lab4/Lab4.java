package labs.lab4;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = generateRandomNumbers();
        Scanner scanner = new Scanner(System.in);
        boolean isContinuing = true;

        while (isContinuing) {
            printMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("All numbers: " + numbers);
                    break;
                case 2:
                    System.out.println("Maximum value: " + findMax(numbers));
                    break;
                case 3:
                    System.out.println("Minimum value: " + findMin(numbers));
                    break;
                case 4:
                    searchNumber(numbers);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    public static ArrayList<Integer> generateRandomNumbers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int index = 0; index < 5; index++) {
            numbers.add(random.nextInt(999));
        }

        return numbers;
    }

    public static void printMenu() {
        System.out.println("=====MENU======");
        System.out.println("1. Print all numbers");
        System.out.println("2. Print maximum value");
        System.out.println("3. Print minimum value");
        System.out.println("4. Search number");
        System.out.print("Enter your choice: ");
    }

    public static int findMax(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            throw new IllegalArgumentException("List is empty");
        }

        int max = numbers.get(0);  // Giả sử phần tử đầu tiên là lớn nhất

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static int findMin(ArrayList<Integer> numbers) {

        int min = numbers.get(0);  // Giả sử phần tử đầu tiên là nhỏ nhất

        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }


    public static void searchNumber(ArrayList<Integer> numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = scanner.nextInt();

        if (numbers.contains(target)) {
            System.out.println(target + " found in the list.");
        } else {
            System.out.println(target + " not found in the list.");
        }
    }
}


