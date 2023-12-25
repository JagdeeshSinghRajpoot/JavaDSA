import java.nio.channels.ServerSocketChannel;
import java.util.Scanner;

public class Two_D_Array {
    public static void minimumValue(int matrix[][]){
        int minValue = Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                minValue = Math.min(minValue, matrix[i][j]);
            }
        }
        System.out.println("the minimum value is : "+minValue);
    }

    public static void largest(int matrix[][]) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                maxValue = Math.max(maxValue, matrix[i][j]);
            }
        }
        System.out.println("the maximum vlaue is : " + maxValue);
    }

    public static boolean search(int matrix[][], int key) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.print("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = 3, m = 3;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // search(matrix, 5);
        largest(matrix);
        minimumValue(matrix);
    }
}
