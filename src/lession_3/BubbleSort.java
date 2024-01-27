package lession_3;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] myIntArr = {1, 22, 2, 16, 11};
        int unsortedPosition = myIntArr.length - 1;

        while (unsortedPosition > 0){
            for(int index = 0; index < unsortedPosition; index++){
                int leftValue = myIntArr[index];
                int rightValue = myIntArr[index + 1];
                if(leftValue > rightValue){
                    int temp = leftValue;
                    myIntArr[index] = myIntArr[index +1];
                    myIntArr[index + 1] = temp;

                }
            }
            unsortedPosition--;
        }

        System.out.println(Arrays.toString(myIntArr));
    }
}
