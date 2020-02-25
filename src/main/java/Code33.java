/**
 * 从左上角到右下角
 */
public class Code33 {
    public static int walk(int[][] matrix, int i, int j) {
        if (i == matrix.length - 1 && j == matrix[0].length - 1) {
            return matrix[i][j];
        }
        if (i == matrix.length - 1) {
            return matrix[i][j] + walk(matrix, i, j + 1);
        }
        if (j == matrix[0].length - 1) {
            return matrix[i][j] + walk(matrix, i + 1, j);
        }
        int right = walk(matrix, i, j + 1);
        int down = walk(matrix, i + 1, j);
        return matrix[i][j] + Math.min(right, down);
    }

    public static void main(String[] args) {
        int[][] i = {{1, 2, 1}, {1, 2, 1}, {1,2, 1}};
        int walk = walk(i, 0, 0);
        System.out.println(walk);
    }
}
