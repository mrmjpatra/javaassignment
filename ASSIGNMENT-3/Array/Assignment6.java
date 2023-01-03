import java.util.Arrays;

public class Matrix {

    // A matrix is represented as a 2D array in Java
    private double[][] matrix;

    // Construct a new matrix with the given dimensions
    public Matrix(int rows, int cols) {
        matrix = new double[rows][cols];
    }

    // Set the value at the given row and column
    public void set(int row, int col, double value) {
        matrix[row][col] = value;
    }

    // Get the value at the given row and column
    public double get(int row, int col) {
        return matrix[row][col];
    }

    // Calculate the determinant of this matrix
    public double determinant() {
        if (matrix.length != matrix[0].length) {
            throw new IllegalStateException("Cannot calculate determinant of a non-square matrix");
        }
        if (matrix.length == 2) {
            // The determinant of a 2x2 matrix is easy to calculate
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        }
        // For a 3x3 matrix, we use the formula:
        // a b c
        // d e f
        // g h i
        // det(A) = a(ei - fh) - b(di - fg) + c(dh - eg)
        double a = matrix[0][0];
        double b = matrix[0][1];
        double c = matrix[0][2];
        double d = matrix[1][0];
        double e = matrix[1][1];
        double f = matrix[1][2];
        double g = matrix[2][0];
        double h = matrix[2][1];
        double i = matrix[2][2];
        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }

    // Calculate the inverse of this matrix
    public Matrix inverse() {
        if (matrix.length != matrix[0].length) {
            throw new IllegalStateException("Cannot calculate inverse of a non-square matrix");
        }
        if (matrix.length == 2) {
            // The inverse of a 2x2 matrix is easy to calculate
            double det = determinant();
            Matrix inverse = new Matrix(2, 2);
            inverse.set(0, 0, matrix[1][1] / det);
            inverse.set(0, 1, -matrix[0][1] / det);
            inverse.set(1, 0, -matrix[1][0] / det);
            inverse.set(1, 1, matrix[0][0] / det);
            return inverse;
        }

    }
}
