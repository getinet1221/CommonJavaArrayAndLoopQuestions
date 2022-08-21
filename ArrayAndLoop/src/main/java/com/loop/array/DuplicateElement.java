package main.java.com.loop.array;

import java.util.Arrays;

public class DuplicateElement {
    /*
        01.Java Program to find duplicate elements in an Array
     */
    public static int[] getDuplicateElements(int []inputArray){
        int []duplicates = new int[inputArray.length];
        for (int i = 0;i<inputArray.length;i++){
            for (int j=i+1;j<inputArray.length;j++){
                if (inputArray[i] != inputArray[j]){

                }else{
                    duplicates[j] = inputArray[i];
                }
            }
        }
        return duplicates;
    }
}
