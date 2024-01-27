package labs.lab3;

public class Lab3_3 {
    public static void main(String[] args) {
        int[] intArr = {12, 34, 1, 16, 28};

        // Perform Bubble Sort
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int j = 0; j < intArr.length - i - 1; j++) {
                if (intArr[j] > intArr[j + 1]) {
                    // Swap elements if they are in the wrong order
                    intArr[j] = intArr[j] + intArr[j + 1];
                    intArr[j + 1] = intArr[j] - intArr[j + 1];
                    intArr[j] = intArr[j] - intArr[j + 1];
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array: ");
        for (int num = 0; num < intArr.length; num++) {
            System.out.print(num + " ");
        }
    }
}