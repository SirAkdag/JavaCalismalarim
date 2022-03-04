import java.util.Arrays;

public class ArrayTranspose {
    public static void main(String[] args) {
        int[][] matris = new int[2][3];
        int[][] transpose = new int[3][2];
        int start = 1;

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++) {
                matris[i][j] = start++;
            }
        }
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matris[j][i];
            }
        }
        System.out.print("Matris:");
        for (int[] row : matris) {
            System.out.println();
            for (int col : row) {
                System.out.print(col + "   ");
            }
        }
        System.out.print("\nTranspoze:");
        for (int[] row : transpose) {
            System.out.println();
            for (int col : row) {
                System.out.print(col + "   ");
            }
        }
    }
}
