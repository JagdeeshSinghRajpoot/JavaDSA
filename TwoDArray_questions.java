import java.util.*;

import javax.sound.sampled.SourceDataLine;

public class TwoDArray_questions {
    public static void print_Array(int matrix[][]) {
        int printof7 = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    printof7++;
                }
            }
        }
        System.out.println(" count of 7 is : " + printof7);
    }

    public static void printSumSecondLine(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[1][i];
        }
        System.out.println("sum of second line is : " + sum);
    }

    public static void tranpose(int matrix[][]) {
        int row = 2, collumn = 3;
        int tamp[][] = new int[collumn][row];

        printMatrix(matrix);
        System.out.println();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < collumn; j++) {
                tamp[j][i] = matrix[i][j];
            }
        }
        printMatrix(tamp);
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " = (" + j + "," + i + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int matrix[][] = { { 4, 7, 8 },
        // { 8, 8, 7 } };
        // int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        int matrix[][] = { { 11, 12, 13 }, { 21, 22, 23 } };
        tranpose(matrix);
        // printSumSecondLine(nums);
        // print_Array(matrix);s
    }

}
