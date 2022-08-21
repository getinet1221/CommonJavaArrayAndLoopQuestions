package main.java.com.loop.array;

public class RemoveDuplicateElements {
    /*
        04.Java program to Remove Duplicate Elements From an Array
     */
    public static int[] removeDuplicateElements(int[]elements){
        int []finalUniqueElements = new int[elements.length];
        for (int i=0;i< elements.length;i++){
            for (int j = i+1;j<elements.length;j++){
                if (elements[i] == elements[j]){
                    break;
                }
                else {
                    finalUniqueElements[i] = elements[i];
                }
            }
        }
        return finalUniqueElements;
    }
}