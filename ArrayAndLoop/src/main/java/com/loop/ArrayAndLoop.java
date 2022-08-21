package main.java.com.loop;

import main.java.com.loop.array.FindMaxMinInMatrix;
import main.java.com.loop.array.GetMaxEachRow;

import java.util.Arrays;

public class ArrayAndLoop {
    public static void main(String[] args) {
        int []elements = {12,2,2,2,212,4,6,7,1,-656, -6};
        int []secondElements = {12,2,3,4,5,6,9,3};
        int []firstElements = {12,2,3,5,6,8};
        int [][]arrayElement = {
                {1,-3,4,6},
                {50,15,8,7}
        };
        int [][]first = {
                {4,4,4,4},
                {5,5,5,5}
        };
        int [][]second = {
                {1,1,1,1},
                {2,2,2,2}
        };
//        System.out.println(Arrays.deepToString(TwoMatrixSummation.getRectangle(first, second)));
//        System.out.println("Find Duplicate Elements : "+Arrays.toString(DuplicateElement.getDuplicateElements(elements)));
//        System.out.println("Smallest and Largest Elements respectively : "+ Arrays.toString(findLargestAndSmallest.getLargestAndSmallestNumber(elements)));
//        System.out.println("Common Elements : "+ Arrays.toString(findCommonElementsInTwoArrays.getCommonElements(firstElements, secondElements)));
//        System.out.println("Find Duplicate Elements : "+ Arrays.toString(RemoveDuplicateElements.removeDuplicateElements(elements)));
//        GetFirstAndSecondLargestNumber.getFirstAndSecondLargestNumber(elements);
//        System.out.println(Arrays.deepToString(MatrixSubtraction.matrixSubtraction(first, second)));
//        System.out.println(Arrays.toString(FindMaxMinInMatrix.findMaxInMatrix(arrayElement)));
        System.out.println(Arrays.deepToString(GetMaxEachRow.getMaxEachRow(arrayElement)));
    }
}
