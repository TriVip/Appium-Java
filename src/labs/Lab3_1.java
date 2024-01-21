package labs;

public class Lab3_1 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        int oddCount = 0;
        int evenCount = 0;

        for (int index = 0; index < intArr.length; index++) {
            int num = intArr[index];

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);

    }
}
