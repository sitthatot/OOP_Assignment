import java.util.*;
public class Pro3_64010889 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the size for the matrix: ");
        int d = input.nextInt();
        if(d>1){
        int[][] matrix = new int[d][d];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * 2);
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
        boolean noSame = true;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (checkRow(matrix, j, i)) {
                    noSame = false;
                    System.out.println("All " + i + "s on row " + j);
                }
            }

        }
        if (noSame) {
            System.out.println("No same numbers on a row");
        }

        noSame = true;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (checkColumn(matrix, j, i)) {
                    noSame = false;
                    System.out.println("All " + i + "s on column " + j);
                }
            }

        }
        if (noSame) {
            System.out.println("No same numbers on a column");
        }

        noSame = true;
        for (int i = 0; i < 2; i++) {
            if (checkDiagonal(matrix, 0,1,matrix.length-1, i)) {
                noSame = false;
                System.out.println("All " + i + "s on the superdiagonal");
            }

        }
        if (noSame) {
            System.out.println("No same numbers on the superdiagonal");
        }

        noSame = true;
        for (int i = 0; i < 2; i++) {
            if (checkDiagonal(matrix, 0,0,matrix.length, i)) {
                noSame = false;
                System.out.println("All " + i + "s on the diagonal");
            }

        }
        if (noSame) {
            System.out.println("No same numbers on the diagonal");
        }

        noSame = true;
        for (int i = 0; i < 2; i++) {
            if (checkDiagonal(matrix, 1,0,matrix.length-1, i)) {
                noSame = false;
                System.out.println("All " + i + "s on the subdiagonal");
            }

        }
        if (noSame) {
            System.out.println("No same numbers on the subdiagonal");
        }
    }
    else{
        System.out.println("Please enter 2 or more number");
    }
    }

    static boolean checkRow(int[][] matrix, int row, int check) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[row][i] != check) {
                return false;
            }
        }
        return true;
    }

    static boolean checkColumn(int[][] matrix, int column, int check) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][column] != check) {
                return false;
            }
        }
        return true;
    }

    static boolean checkDiagonal(int[][] matrix, int startRow, int startColumn, int len, int check) {
        for (int i = 0; i < len; i++) {
            if (matrix[startRow + i][startColumn + i] != check) {
                return false;
            }
        }
        return true;
    }

}