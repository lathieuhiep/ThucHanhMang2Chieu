import java.util.Arrays;

public class Arr2D {
    private int[][] arr2D;

    public Arr2D() {
        arr2D = new int[][] {
                {1,5,3,2,4},
                {2,1,5,3,4},
                {4,5,1,2,3},
                {5,3,2,1,4},
                {3,4,1,2,5},
        };
    }

    // in mang
    public void printMatrix() {
        System.out.println("Matrix");

        for (int i = 0; i < arr2D.length; i++) {
            int row[] = arr2D[i];
            System.out.println(Arrays.toString(row));
        }
    }

    // tinh tong moi hang
    public void sumOfAllRows() {
        System.out.println();
        for (int i = 0; i < arr2D.length; i++) {
            int row[] = arr2D[i];

            int sum = sumOfRow(row);
            System.out.println( "Tong moi hang " + (i + 1) + " = " + sum );
        }
    }

    private int sumOfRow(int[] row) {
        int tong = 0;

        for (int i = 0; i < row.length; i++) {
            tong += row[i];
        }

        return tong;
    }

    // tinh tong moi cot
    public void sumOfAllCols() {
        System.out.println();
        for (int j = 0; j < arr2D[0].length; j++) {
            int sum = sumOfCol(j);
            System.out.println( "Tong moi cot " + (j + 1) + " = " + sum );
        }
    }

    private int sumOfCol(int j) {
        int tong = 0;

        for (int i = 0; i < arr2D.length; i++) {
            tong += arr2D[i][j];
        }

        return tong;
    }

    // in ra cac gia tri chan cua moi hang
    public void printEventNumberInRow() {
        for (int i = 0; i < arr2D.length; i++) {
            System.out.print("\nGia tri chan moi hang " + i + ": ");
            int[] row = arr2D[i];

            for (int j = 0; j < row.length; j++) {
                if (row[j] % 2 == 0) {
                    System.out.print(row[j] + " ");
                }
            }
        }
    }

    // in ra cac gia tri chan cua moi cot
    public void printOddNumberInCol() {
        for (int j = 0; j < arr2D[0].length; j++) {
            System.out.print("\nGia tri chan moi cot " + j + ": ");

            for (int i = 0; i < arr2D.length; i++) {
                if (arr2D[i][j] % 2 == 0) {
                    System.out.print(arr2D[i][j] + " ");
                }
            }
        }
    }

    // tim gia tri lon nhat moi hang
    public void printMaxInRow() {
        System.out.println("\nGiá trị lớn nhất mỗi hàng");
        for (int i = 0; i < arr2D.length; i++) {
            int row[] = arr2D[i];

            int max = row[0];
            for (int j = 0; j < row.length; j++) {
                if (max < row[j]) {
                    max = row[j];
                }
            }

            System.out.println("Giá trị lớn nhất hàng " + i + ": " + max);
        }
    }

    // tim gia tri lon nhat moi cot
    public void printMaxInCol() {
        System.out.println("\nGiá trị lớn nhất mỗi cột");

        for (int j = 0; j < arr2D[0].length; j++) {
            int max = arr2D[0][j];

            for (int i = 0; i < arr2D.length; i++) {
                if (max < arr2D[i][j]) {
                    max = arr2D[i][j];
                }
            }

            System.out.println("Giá trị lớn nhất cột " + j + ": " + max);
        }
    }

    // tinh tong duong cheo trai
    public void calcSumOfLineLeft() {
        int sum = 0;
        for (int j = 0; j < arr2D[0].length; j++) {
            for (int i = 0; i < arr2D.length; i++) {
                if (i == j) {
                    sum += arr2D[i][j];
                }
            }
        }

        System.out.println("Tổng đường chéo trái: " + sum);
    }

    // tinh tong duong cheo phai
    public void calcSumOfLineRight() {
        int sum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[0].length - 1; j >= 0; j--) {
                if (i == arr2D[0].length - 1 - j) {
                    sum += arr2D[i][j];
                }
            }
        }

        System.out.println("Tổng đường chéo phải: " + sum);
    }
}
