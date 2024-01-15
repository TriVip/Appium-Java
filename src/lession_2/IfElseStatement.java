package lession_2;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
//        final boolean isHeOnTime = false;
        // Comparison Opertators: ==, !=, >, <, >=, =<

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter arrival time: ");
        int arrivalTime = scanner.nextInt();

        final int EXPECTED_TIME = 7;
        boolean isHeOnTime = arrivalTime == EXPECTED_TIME;

        System.out.println("1. Dat xe ra");
        System.out.println("2. Chay ra quan cf");
        if(isHeOnTime){
            System.out.println("Lets talk");
        }else {
            System.out.println("Write a letter!");
        }
        System.out.println("3. Dat xe ra");
        System.out.println("4. Chay ve nha");
    }
}
