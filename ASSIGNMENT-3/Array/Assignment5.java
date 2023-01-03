
import java.util.Arrays;
import java.util.Scanner;

/*Write a program to find summation, subtraction and multiplication of two 3X4 matrices? */
public class Assignment5 {
    static Scanner sc = null;

    public static void main(String[] args) {
        int[][] mat1 = new int[3][4];
        int[][] mat2 = new int[3][4];
        System.out.println("Enter the element of the matrix-1");
        read(mat1);
        System.out.println("Enter the element of the matrix-2");
        read(mat2);
        addMatrix(mat1, mat2);
        subMatrix(mat1, mat2);
        
    }

    public static void read(int[][] mat) {
        sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
    }
    public static void show(int[][] mat) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void addMatrix(int[][]mat1,int[][] mat2){
        int[][] add=new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                add[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("The addition of two matrix is ");
        show(add);
    }
    public static void subMatrix(int[][]mat1,int[][] mat2){
        int[][] sub=new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sub[i][j]=mat1[i][j]-mat2[i][j];
            }
        }
        System.out.println("The subtraction of two matrix is ");
        show(sub);
    }

}