public class search_in_sorted_matrix {

    public static boolean search2DMatrix(int matrix[][], int key) {
        // Cell (0,n-1)
        /*
         * int row = 0, col = matrix.length - 1;
         * while (row < matrix.length && col >= 0) {
         * if (matrix[row][col] == key) {
         * System.out.println("found key at : " + "(" + row + "," + col + ")");
         * return true;
         * }
         * if (matrix[row][col] > key) {
         * col--;
         * } else if (matrix[row][col] < key) {
         * row++;
         * }
         * }
         * System.out.println("key not found");
         * return false;
         */

        // Cell (n-1,0)
        int row = matrix.length - 1, col = 0;
        while (row >= 0 && col < matrix.length) {
            if (matrix[row][col] == key) {
                System.out.println("found key at : " + "(" + row + "," + col + ")");
                return true;
            }
            if (matrix[row][col] > key) {
                row--;
            } else if (matrix[row][col] < key) {
                col++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };
        search2DMatrix(matrix, 100);
    }

}
