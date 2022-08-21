package main.java.com.loop.array;

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
