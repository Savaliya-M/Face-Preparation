public class singlelinkage {
    public static int[][] findDistanceMatrix(int[][] arr) {
        int[][] distance = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                distance[i][j] = (int) Math.sqrt(arr[i + 1][j] - arr[i][j]);
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int[][] arr = new int[][] { { 10, 20 }, { 12, 25 }, { 20, 30 } };

        int[][] distance = findDistanceMatrix(arr);
    }
}
