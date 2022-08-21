# Common Java Array And Loop Questions

## Welcome
Thank you for visiting our full stack project. The code is written in Java(Spring boot framework) as Back End, Js(VueJs framework) as Front End, MySQL as persistant database, and Bootstrap as UI.
## Table of Contents 
-  [Duplicate](https://github.com/getinet1221/cbe_gym_system#about)
-  [FindLargestandsmallest](https://github.com/getinet1221/cbe_gym_system#requirements)
-  [Projects](https://github.com/getinet1221/cbe_gym_system#Projects)
-  [Authors](https://github.com/getinet1221/cbe_gym_system#Authors)

## About
### 01.Java Program to find duplicate elements in an Array
This repository contains introductory projects for higher-level programming. Topics include:
```
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
```
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
## Projects
1. [Back End](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym)
    - [Absent](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/absent)
    - [Applicant](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/applicant)
    - [Attendance](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/attendance)
    - [Coach](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/coach)
    - [Director](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/director)
    - [Group](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/group)    
    - [Gym Site](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/gym_site)
    - [Head](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/head)
    - [Manager](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/manager)
    - [News](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/news)
    - [Notification](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/notification)
    - [Pages](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/pages)
    - [Present](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/present)
    - [Reception](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/Reception)
    - [Schedule](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/schedule)
    - [Trainee](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/trainee)
    - [Training Rule](https://github.com/getinet1221/cbe_gym_system/tree/master/Back_End/Gym/src/main/java/com/cbe/Gym/training_rule)

2. [Front End](https://github.com/getinet1221/cbe_gym_system/tree/master/Front_End/Gym-front/src/views/)
    - [Coach](https://github.com/getinet1221/cbe_gym_system/tree/master/Front_End/Gym-front/src/views/Coach)
    - [Director](https://github.com/getinet1221/cbe_gym_system/tree/master/Front_End/Gym-front/src/views/Director)
    - [Head](https://github.com/getinet1221/cbe_gym_system/tree/master/Front_End/Gym-front/src/views/Head)
    - [Manager](https://github.com/getinet1221/cbe_gym_system/tree/master/Front_End/Gym-front/src/views/Manager)
    - [Reception](https://github.com/getinet1221/cbe_gym_system/tree/master/Front_End/Gym-front/src/views/reception)
    - [Security](https://github.com/getinet1221/cbe_gym_system/tree/master/Front_End/Gym-front/src/views/security)
    - [Training Rule](https://github.com/getinet1221/cbe_gym_system/tree/master/Front_End/Gym-front/src/views/training_rule)
## Author
- The problem is developed and maintained by 
    -   **Getinet Amare Mekonnen** ([@getinet1221](https://github.com/getinet1221))