import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        int liczba = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = liczba++;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println((Arrays.toString(matrix[i])));
        }
    }
}