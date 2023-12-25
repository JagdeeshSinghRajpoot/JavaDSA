public class DigonalSum {
    public static int digonalSum(int matrix[][]) {
        // int primarySum = 0;
        // int secondrySum = 0;
        /*
         * int sum = 0;
         * // Secondry digonal
         * for (int i = 0; i <= matrix.length - 1; i++) {
         * for (int j = 0; j <= matrix[0].length - 1; j++) {
         * if (i == j) {
         * // secondrySum += matrix[i][j];
         * sum += matrix[i][j];
         * } else if ((i + j) == matrix.length - 1) {
         * // primarySum += matrix[i][j];
         * sum += matrix[i][j];
         * }
         * }
         * }
         * // System.out.println("secondry Sum is : " + secondrySum);
         * // System.out.println("primary sum is : " + primarySum);
         * 
         * return sum;
         */

        // if ((matrix.length % 2 == 1) && (matrix[0].length % 2 == 1)) {
        // return primarySum + secondrySum - matrix[(matrix.length - 1) /
        // 2][(matrix[0].length - 1) / 2];
        // } else {
        // return primarySum + secondrySum;
        // }
        // =============================================================================================================
        // this code time conplaxcity is O(n^2)
        // ==============================================================================================================

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i)
                sum += matrix[i][matrix.length - 1 - i];
        }
        return sum;
    }

    // ==========================================
    // time complaxcity is O(n)
    // ==========================================

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        int matrix2[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        System.out.println(digonalSum(matrix));

    }
}
