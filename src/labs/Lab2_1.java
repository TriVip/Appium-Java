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
        double weightChange = Math.abs(24.9 - bmi);

        if (bmi < 18.5) {
            System.out.println("Ban co the dang bi thieu can!");
            System.out.println("De duy tri can nang, ban co the can phai an nhieu hon. So can con thieu cua ban la: " + weightChange + " kg.");
        } else if (18.5 <= bmi && bmi <= 24.9) {
            System.out.println("Than hinh cua ban co ve can doi.");
        } else if (25 <= bmi && bmi <= 29.9) {
            System.out.println("Ban co the dang thua can.");
            System.out.println("De giu can nang ly tuong, co the ban nen thuc hien the thao. So can du thua cua ban la: " + weightChange + " kg.");
        } else {
            System.out.println("Ban co the dang bi beo phi.");
            System.out.println("Xin vui long tham khao y kien bac si. So can du thua cua ban la: " + weightChange + " kg.");
        }

        System.out.printf("Chi so BMI cua ban la: %.2f\n", bmi);
    }
}
