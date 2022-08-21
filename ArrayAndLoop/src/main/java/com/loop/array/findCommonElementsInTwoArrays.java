package main.java.com.loop.array;

public class findCommonElementsInTwoArrays {
    /*
        03.Java program to find common elements between two Arrays
     */
    public static int[] getCommonElements(int []firstElement, int[]secondElement){
        int []commonElementsWithFirstElementsLength = new int[firstElement.length];
        int commonElementsLength = 0;
        for (int i = 0;i<firstElement.length; i++){
            for (int j = 0;j<secondElement.length;j++){
                if (firstElement[i] == secondElement[j]){
                    commonElementsLength += 1;
                    commonElementsWithFirstElementsLength[i] = firstElement[i];
                    break;
                }
            }
        }
        int []finalElements = new int[commonElementsLength];
        for (int k=0;k<commonElementsLength;k++){
            finalElements[k] = commonElementsWithFirstElementsLength[k];
        }
        return finalElements;
    }
}
