package main.java.com.loop.array;

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