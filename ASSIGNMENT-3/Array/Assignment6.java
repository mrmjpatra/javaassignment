import java.util.Scanner;

/*Write a program to determinant and inverse of a 3X3 matrics? */

class Matrix {
    private int[][] mat = new int[3][3];
    Scanner sc=new Scanner(System.in);
    public void read(){
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                mat[i][j]=sc.nextInt();
            }
        }
    }
    public double determinant() {
            // For a 3x3 matrix, we use the formula:
            // a b c
            // d e f
            // g h i
            // det(A) = a(ei - fh) - b(di - fg) + c(dh - eg)
            double a = mat[0][0];
            double b = mat[0][1];
            double c = mat[0][2];
            double d = mat[1][0];
            double e = mat[1][1];
            double f = mat[1][2];
            double g = mat[2][0];
            double h = mat[2][1];
            double i = mat[2][2];
            
            return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }
    public void inverse(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
                 System.out.printf("%.2f\t",((mat[(i+1)%3][(j+1)%3] * mat[(i+2)%3][(j+2)%3]) - (mat[(i+1)%3][(j+2)%3]*mat[(i+2)%3][(j+1)%3]))/ determinant());
            System.out.println();
         }
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        Matrix m=new Matrix();
        System.out.println("Enter the matrix elements");
        m.read();
        System.out.println("Determinant of the matrix is "+m.determinant());
        System.out.println("Inverse of matrix is");
        m.inverse();
    }
}