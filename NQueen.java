
public class NQueen {
    static int N = 0;

    NQueen(int row) {
        N = row;

    }

    boolean solvedBoard(int arr[][], int row) {
        if (row == N) {
            // printTwoDiamantionalArray(arr);

            return true;
        }

        for (int j = 0; j < N; j++) {
            if (safe(arr, row, j)) {
                arr[row][j] = 1;
                if (solvedBoard(arr, row + 1)) {
                    return true;
                }
                arr[row][j] = 0;
            }
        }
        return false;
    }

    public static boolean safe(int arr[][], int row, int col) {
        if (row >= 0 && row < N && col >= 0 && col < N) {
            // check for up
            for (int i = row; i >= 0; i--) {
                if (arr[i][col] == 1) {
                    return false;
                }
            }
            // check for upper left corner
            for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
                if (arr[i][col] == 1) {
                    return false;
                }
            }
            // check for upper right corner
            for (int i = row, j = col; i >= 0 && j < N; i--, j++) {
                if (arr[i][col] == 1) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    // public static void printTwoDiamantionalArray(int[][] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //         for (int j = 0; j < arr.length; j++) {
    //             System.out.print(arr[i][j] + "");
    //         }
    //         System.out.println();
    //     }
    // }

    public static void main(String[] args) {
        int[][] arr = {
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0 }
        };

        NQueen obj = new NQueen(arr.length);
        if (obj.solvedBoard(arr, arr.length)) {
            System.out.println("solution exists");

        } else {
            System.out.println("solution does not exist");
        }
    }
}