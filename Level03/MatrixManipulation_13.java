import java.util.Random;
import java.util.Scanner;

public class MatrixManipulation_13 {

    // Method to create a random matrix with given rows and columns
    public static int[][] generateRandomMatrix(int rows, int columns) {
        Random rand = new Random();
        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = rand.nextInt(10) + 1; // Random values between 1 and 10
            }
        }

        return matrix;
    }

    // Method to display the matrix
    public static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        // To multiply, the number of columns of matrix1 must be equal to number of rows
        // of matrix2
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible due to incompatible dimensions.");
            return new int[0][0]; // Returning empty matrix
        }

        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            System.out.println("Only 2x2 matrix is supported for determinant.");
            return 0;
        }
    }

    // Method to find the inverse of a 2x2 matrix
    public static int[][] inverse(int[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            int det = determinant(matrix);
            if (det == 0) {
                System.out.println("Inverse doesn't exist because determinant is zero.");
                return new int[0][0]; // Returning empty matrix
            }

            int[][] inverse = new int[2][2];
            inverse[0][0] = matrix[1][1] / det;
            inverse[0][1] = -matrix[0][1] / det;
            inverse[1][0] = -matrix[1][0] / det;
            inverse[1][1] = matrix[0][0] / det;

            return inverse;
        } else {
            System.out.println("Only 2x2 matrix is supported for inverse.");
            return new int[0][0]; // Returning empty matrix
        }
    }

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);

        //taking input
        System.out.println("Enter row number: ");
        int row=input.nextInt();

        //taking input
        System.out.println("Enter column number: ");
        int column=input.nextInt();
        int[][] matrix1 = generateRandomMatrix(row, column);
        int[][] matrix2 = generateRandomMatrix(row, column);

        // Display matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Add matrices
        System.out.println("Matrix 1 + Matrix 2:");
        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        displayMatrix(sumMatrix);

        // Subtract matrices
        System.out.println("Matrix 1 - Matrix 2:");
        int[][] diffMatrix = subtractMatrices(matrix1, matrix2);
        displayMatrix(diffMatrix);

        // Multiply matrices
        System.out.println("Matrix 1 * Matrix 2:");
        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
        displayMatrix(productMatrix);

        // Transpose matrix
        System.out.println("Transpose of Matrix 1:");
        int[][] transposedMatrix = transposeMatrix(matrix1);
        displayMatrix(transposedMatrix);

        // Find determinant of matrix1 (2x2 matrix)
        System.out.println("Determinant of Matrix 1: " + determinant(matrix1));

        // Find inverse of matrix1
        System.out.println("Inverse of Matrix 1:");
        int[][] inverseMatrix = inverse(matrix1);
        if (inverseMatrix.length > 0) {
            displayMatrix(inverseMatrix);
        }

        input.close();
    }
}