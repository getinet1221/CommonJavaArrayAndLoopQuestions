package main.java.com.loop.array;

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
