public class MatrixAddition {
    public static void main(String[] args) {
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] b = {
            {7, 8, 9},
            {1, 2, 3}
        };

        int rows = a.length;
        int cols = a[0].length;

        int[][] sum = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Result of matrix addition:");
        for (int[] row : sum) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
