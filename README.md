# Common Java Array And Loop Questions

## Welcome
Thank you for visiting me
## Contents 
-  [Duplicate](https://github.com/getinet1221/CommonJavaArrayAndLoopQuestions#Duplicate)
-  [FindLargestandsmallest](https://github.com/getinet1221/CommonJavaArrayAndLoopQuestions#FindLargestandsmallest)
-  [FindCommonElementsInTheArray](https://github.com/getinet1221/CommonJavaArrayAndLoopQuestions#FindCommonElementsInTheArray)
-  [RemoveDuplicateELements](https://github.com/getinet1221/CommonJavaArrayAndLoopQuestions#RemoveDuplicateELements)
-  [FirstAndSecondLargestElement](https://github.com/getinet1221/CommonJavaArrayAndLoopQuestions#FirstAndSecondLargestElement)
-  [AddTwoMatrix](https://github.com/getinet1221/CommonJavaArrayAndLoopQuestions#AddTwoMatrix)
-  [MatrixSubstraction](https://github.com/getinet1221/CommonJavaArrayAndLoopQuestions#MatrixSubstraction)]
-  [MaxAndMinInMatrix](https://github.com/getinet1221/CommonJavaArrayAndLoopQuestions#MaxAndMinInMatrix)
-  [MaxElementsInEachRowInMatrix](https://github.com/getinet1221/CommonJavaArrayAndLoopQuestions#MaxElementsInEachRowInMatrix)
-  [Authors](https://github.com/getinet1221/cbe_gym_system#Authors)

## Duplicate
### 01.Java Program to find duplicate elements in an Array
This repository contains introductory projects for higher-level programming. Topics include:
```Java
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
```
## FindLargestandsmallest
### 02.Find largest and smallest number in the given Array
```Java
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
```
## FindCommonElementsInTheArray
### 03.Java program to find common elements between two Arrays
```Java
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
```
## RemoveDuplicateELements
### 04.Java program to Remove Duplicate Elements From an Array
```Java
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
```
## FirstAndSecondLargestElement
### 05.Java program to find first and second largest number in the given Array
```Java
public class GetFirstAndSecondLargestNumber {
    /*
        05.Java program to find first and second largest number in the given Array
     */
    public static void getFirstAndSecondLargestNumber(int[] elements){
        int firstLargest = 0;
        int secondLargest = 0;
;        for (int element : elements) {
            if (firstLargest < element) {
                secondLargest = firstLargest;
                firstLargest = element;
            } else if (secondLargest < element) {
                secondLargest = element;
            }
        }
        System.out.println("First Largest Element  :"+firstLargest+" and second : "+secondLargest);
    }
}
```
## AddTwoMatrix
### 06.Java program to add two matrices
```Java
public class TwoMatrixSummation {
    /*
        06.Java program to add two matrices
     */
    public static int[][] getRectangle(int[][]firstElement, int[][]secondElement){
        int [][]summation = new int[firstElement.length][firstElement[0].length];
        for (int i=0;i<firstElement.length;i++){
            for (int j=0;j<firstElement[i].length;j++){
                summation[i][j] = firstElement[i][j] + secondElement[i][j];
            }
        }
        return summation;
    }
}
```
## MatrixSubstraction
07.Matrix Subtraction Java Program
```Java
public class MatrixSubtraction {
    /*
        07.Matrix Subtraction Java Program
     */
    public static int [][] matrixSubtraction(int [][]first, int[][]second){
        int [][]result = new int[first.length][first[0].length];
        for (int i=0;i<first.length;i++){
            for (int j=0;j<first[i].length;j++){
                result[i][j] = first[i][j] - second[i][j];
            }
        }
        return result;
    }
}
```
## MaxAndMinInMatrix
### 08.Java program to find maximum and minimum numbers in the given matrix
```Java
public class FindMaxMinInMatrix {
    /*
        08.Java program to find maximum and minimum numbers in the given matrix
     */
    public static int[] findMaxInMatrix(int [][]elements){
        int large = 0;
        int small = 0;
        int []maxMin = new int[2];
        for (int i=0;i<elements.length;i++){
            for (int j=0;j<elements[i].length;j++){
                if (elements[i][j] > large){
                    large = elements[i][j];
                    maxMin[0] = large;
                }
                if (elements[i][j] < small){
                    small = elements[i][j];
                    maxMin[1] = small;
                }
            }
        }
        return maxMin;
    }
}
```
## MaxElementsInEachRowInMatrix
### 09.Java program to find maximum element in each row of the matrix
```Java
public class GetMaxEachRow {
    /*
        09.Java program to find maximum element in each row of the matrix
     */
    public static int[][] getMaxEachRow(int[][]elements){
        int [][]maxEachRow = new int[elements.length][elements[0].length];
        int max = 0;
        for (int i=0;i<maxEachRow.length;i++){
            for (int j = 0; j<maxEachRow[i].length;j++){
                if (elements[i][j] > max){
                    max = elements[i][j];
                }
                maxEachRow[i][0] = max;
            }
        }
        return maxEachRow;
    }
}
```
## Author
- The problem is developed and maintained by 
    -   **Getinet Amare Mekonnen** ([@getinet1221](https://github.com/getinet1221))