# Common Java Array And Loop Questions

## Welcome
Thank you for visiting me
## Contents 
-  [Duplicate](https://github.com/getinet1221/CommonJavaArrayAndLoopQuestions#Duplicate)
-  [FindLargestandsmallest](https://github.com/getinet1221/CommonJavaArrayAndLoopQuestions#FindLargestandsmallest)
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
## Author
- The problem is developed and maintained by 
    -   **Getinet Amare Mekonnen** ([@getinet1221](https://github.com/getinet1221))