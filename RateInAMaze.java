public class RateInAMaze {
    public static boolean safe(int arr[][], int r, int c) {
        return (r >= 0 && r < arr.length && c >= 0 && c < arr.length && arr[r][c] == 1);
    }

    public static boolean Maze(int arr[][]) {
        int sol[][] = new int[arr.length][arr[0].length];
        if (solveMaze(arr, 0, 0, sol)) {
            System.out.println("solution exists");
            printOutput(sol);
            return true;
        } else {
            System.out.println("solution does not exist");
        }
        return false;
    }

    public static boolean solveMaze(int arr[][], int r, int c, int sol[][]) {
        if (r == arr.length - 1 && c == arr.length - 1 && arr[r][c] == 1) {
            sol[r][c] = 1;
            return true;
        }
        if (safe(arr, r, c)) {
            sol[r][c] = 1;
            if (solveMaze(arr, r, c + 1, sol)) {
                return true;
            } else if (solveMaze(arr, r + 1, c, sol)) {
                return true;
            }
            sol[r][c] = 0;
        }
        return false;
    }

    public static void printOutput(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 1, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 0 }, { 0, 0, 1, 1 } };
        boolean a = Maze(arr);

    }
}
