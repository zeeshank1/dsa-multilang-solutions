package com.kzish.arrays;

public class ArrayRotate {

    private static int[] rotateArray(int[] inputArray, int rotateBy, int inputArraySize) {
        int resultArray[] = new int[inputArraySize];

        for (int i = 0; i < inputArraySize; i++) {
            int shifted = i + rotateBy;
            if(shifted < inputArraySize) {
                resultArray[shifted] = inputArray[i];
            } else if(shifted >= inputArraySize) {
                resultArray[shifted - inputArraySize] = inputArray[i];
            }
        }
        return resultArray;
    }

    private static int[] rotateArrayUsingInpArr(int[] inputArray, int rotateBy, int inputArraySize) {
//        int resultArray[] = new int[inputArraySize];

        for (int i = 0; i < inputArraySize; i++) {
            int shifted = i + rotateBy;
//            int backed = i - rotateBy+1;
            shifted = shifted >= inputArraySize?shifted - inputArraySize:shifted;
//            backed = backed<0?inputArraySize-backed-rotateBy-1:backed;
            System.out.println(i );
            System.out.println(shifted );
            System.out.println("____");
            System.out.println(inputArray[i] );
            System.out.println(inputArray[shifted] );
//            inputArray[i] = inputArray[i]+inputArray[shifted];
//            inputArray[shifted]= inputArray[i]-inputArray[shifted];
//            inputArray[i]=inputArray[i]-inputArray[shifted];
            inputArray[shifted]=inputArray[i];
            System.out.println("++++++");
            System.out.println(inputArray[i] );
            System.out.println(inputArray[shifted] );
            System.out.println(".....................");
//            if(shifted < inputArraySize) {
//                resultArray[i] = inputArray[shifted];
//            } else if(shifted >= inputArraySize) {
//                resultArray[i] = inputArray[shifted - inputArraySize];
//            }
        }
        return inputArray;
    }

    public static void main(String[] args) {
        int inputArray[] = new int[]{3, 4, 5, 6, 7};
        for (int val: inputArray) {
            System.out.println(val);
        }
        System.out.println("==================================================");
        int rotatedArray[] = rotateArray(inputArray, 2, inputArray.length);

        int rotatedArrayIn[] = rotateArrayUsingInpArr(inputArray, 2, inputArray.length);

        //Print rotated array
//        for (int val: rotatedArray) {
//            System.out.println(val);
//        }

        for (int val: rotatedArrayIn) {
            System.out.println(val);
        }
    }
}
