package labs;

import java.util.Scanner;

public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vui long nhap chieu cao: ");
        double height = scanner.nextDouble();

        System.out.print("Vui long nhap can nang: ");
        double weight = scanner.nextDouble();

        double bmi = weight / (height * 2);


        if (bmi < 18.5) {
            System.out.println("Ban bi thieu can!");
            System.out.println("Ban can phai an nhieu hon");
        } else if (18.5 <= bmi && bmi <= 24.9) {
            System.out.println("Than hinh ban that can doi");
        } else if (25 <= bmi && bmi <= 29.9) {
            System.out.println("Ban dang thua can");
            System.out.println("Ban can phai choi the thao");
        } else {
            System.out.println("Ban dang bi beo phi");
            System.out.println("SOS");
        }

        System.out.printf("Your BMI is: %.2f\n", bmi);
    }
}
