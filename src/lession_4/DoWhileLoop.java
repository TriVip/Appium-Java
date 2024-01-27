package lession_4;

import java.security.SecureRandom;
import java.util.Scanner;

public class DoWhileLoop {
    /*
    * 1. 3 times
    * 2. 1 -> 10
    * 3. If failed all 3 times > chuc may man lan sau
    * 4. If at least one time is correct > Hooray
     */
    public static void main(String[] args) {
        int guessingTime = 0;
        int randomNum = new SecureRandom().nextInt(10) + 1;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please input a number: ");
            int userNum = scanner.nextInt();

            if(userNum == randomNum){
                System.out.println("Hooray");
                break;
            }
            guessingTime++;
        }while (guessingTime < 3);

        if (guessingTime == 3){
            System.out.println("Chuc ban may man lan sau");
        }
    }
}
