package com.kzish.arrays;

public class ArrayRotate {

    private static int[] rotateArray(int[] inputArray, int rotateBy, int inputArraySize) {
        int resultArray[] = new int[inputArraySize];

        for (int i = 0; i < inputArraySize; i++) {
            int shifted = i + rotateBy;
            if(shifted < inputArraySize) {
               resultArray[i] = inputArray[shifted];
            } else if(shifted >= inputArraySize) {
                resultArray[i] = inputArray[shifted - inputArraySize];
            }
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int inputArray[] = new int[]{3, 4, 5, 6, 7};
        int rotatedArray[] = rotateArray(inputArray, 2, inputArray.length);

        for (int val: rotatedArray
             ) {
            System.out.println(val);
        }
    }
}
