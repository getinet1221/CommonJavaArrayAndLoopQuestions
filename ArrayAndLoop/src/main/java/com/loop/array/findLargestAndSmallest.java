package main.java.com.loop.array;

import java.util.Arrays;

public class findLargestAndSmallest {
        /*
           02.Find largest and smallest number in the given Array
         */
    public static int[] getLargestAndSmallestNumber(int []elements){

        int []largestSmallest = new int[2];
        int largest  =0;
        int smallest = 0;
        for (int element : elements) {
            if (smallest < element) {
                smallest = element;
                largestSmallest[1] = smallest;
            }
            if (largest > element) {
                largest = element;
                largestSmallest[0] = largest;
            }
        }
        return largestSmallest;
    }
}
