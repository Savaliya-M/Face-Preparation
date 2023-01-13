import java.util.*;

public class pathFinding {
    public static void printPath(List<ArrayList<Integer>> path, int end, int mat[][]) {
        for (ArrayList<Integer> cell : path) {
            System.out.print("(" + cell.get(0) + " , " + cell.get(1) + ")");
        }
        System.out.print("(" + mat.length + " , " + mat[0].length + ")");
        System.out.println();
    }

    public static boolean isValid(int i, int j, int M, int N) {
        return (i >= 0 && i < M && j >= 0 && j < N);
    }

    public static int findpath(int mat[][], List<ArrayList<Integer>> path, int i, int j, int count) {
        if (i == mat.length - 1 && j == mat[0].length - 1) {
            pathFinding.printPath(path, mat[i][j], mat);

            return count + 1;
        }
        List<Integer> temp = new ArrayList<>();
        temp.add(i);
        temp.add(j);
        path.add((ArrayList<Integer>) temp);

        if (isValid(i, j + 1, mat.length, mat[0].length)) {
            count = findpath(mat, path, i, j + 1, count);
        }

        if (isValid(i + 1, j, mat.length, mat[0].length)) {
            count = findpath(mat, path, i + 1, j, count);
        }

        path.remove(path.size() - 1);
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        List<ArrayList<Integer>> path = new ArrayList<ArrayList<Integer>>();
        int count = 0;
        int result = findpath(arr, path, 0, 0, count);
        System.out.println(result);

    }
}
