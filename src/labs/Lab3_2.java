package labs;

public class Lab3_2 {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        // Initialize max and min with the first element of the array
        int max = intArr[2];
        int min = intArr[2];

        // Iterate through the array to find max and min
        for (int index = 0; index < intArr.length; index++) {
            if (intArr[index] > max) {
                max = intArr[index];
            }

            if (intArr[index] < min) {
                min = intArr[index];
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
