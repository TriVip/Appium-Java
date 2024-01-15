package lession_2;

import java.util.Scanner;

public class MultipleIfElse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tell me your age: ");
        int clientAge = scanner.nextInt();

        if(clientAge <18){
            System.out.println("Get out!!");
        } else if (clientAge <= 55){
            System.out.println("Lets make a party");
        }else {
            System.out.println("Only 2");
        }
        System.out.println("Welcome to the hell");
    }
}
