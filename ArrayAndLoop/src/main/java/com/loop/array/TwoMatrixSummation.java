package main.java.com.loop.array;

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