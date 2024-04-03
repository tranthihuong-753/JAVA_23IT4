package exp;

public class Main{
    public static void main(String[] args) {
        int[][] matrix = {
            {2, 4, 6, 8},
            {3, 6, 9, 12},
            {4, 8, 12, 16}
        };

        // Thao tác 1
        int sumDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            sumDiagonal += matrix[i][i];
        }

        // Thao tác 2
        int sumAboveDiagonal = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                sumAboveDiagonal += matrix[i][j];
            }
        }

        // Thao tác 3
        int sumBelowDiagonal = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                sumBelowDiagonal += matrix[i][j];
            }
        }

System.out.println("Diagonal: " + sumDiagonal + ", Above: " + sumAboveDiagonal + ", Below: " + sumBelowDiagonal);
    }
}