package com.kzish.arrangement;

import java.util.HashMap;
import java.util.Map;

//Array arr of size N [0 -> N-1],
//Re-arrange array like arr[i] == i if element is present in the array, else if not present arr[i] == -1.
public class SimpleRearrange {

    protected static int[] simpleRearrange(int[] inputArray) {
        int inputArraySize = inputArray.length;
//        int[] resultArray = new int[inputArraySize];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inputArraySize; i++) {
            map.put(i, inputArray[i]);
        }
        for (int x = 0; x < inputArraySize; x++) {

            if (map.containsValue(x)) {
                inputArray[x] = x;
            } else {
                inputArray[x] = -1;
            }
        }
        return inputArray;
    }

    //Driver code
    public static void main(String[] args) {
        int[] inputArrayOne = new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
        int[] inputArrayTwo = new int[]{19, 7, 0, 3, 18, 15, 12, 6, 1, 8, 11, 10, 9, 5, 13, 16, 2, 14, 17, 4};

        int[] rearrangeArrOne = simpleRearrange(inputArrayOne);
        int[] rearrangeArrTwo = simpleRearrange(inputArrayTwo);

        for (int val : rearrangeArrOne) {
            System.out.println(val);
        }
        System.out.println("============");
        for (int val : rearrangeArrTwo) {
            System.out.println(val);
        }
    }
}
