package Array;
import java.util.Arrays;

/*Write a program to find summation, subtraction and multiplication of two 3X4 matrices? */
public class Assignment5 {
    public static void main(String[] args) {
        int [][]add=new int[3][4];
        int [][]sub=new int[3][4];

        int[][] mat1={
            {1,2,3,0},
            {3,2,1,0},
            {0,1,0,2},
            {0,0,0,0}
        };
        int[][] mat2={
            {1,0,3,0},
            {3,0,1,0},
            {0,1,0,2},
            {0,4,1,1}
        };

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                add[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        


    }
}
