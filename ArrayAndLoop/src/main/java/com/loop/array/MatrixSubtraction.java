package main.java.com.loop.array;

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
