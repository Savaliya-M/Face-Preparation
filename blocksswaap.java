import java.util.Arrays;

public class blocksswaap {
    public static void rotate(int[] arr, int i, int d, int n) {
        if (d == 0 || d == n) {
            return;
        }
        if (d == (n - d)) {
            userSwap(arr, i, (n - d) + i, d);
            return;
        }
        if (d < n - d) {
            userSwap(arr, i, n - d + i, d);
            rotate(arr, i, d, n - d);
        }
        if (d > n - d) {
            userSwap(arr, i, d, n - d);
            rotate(arr, n - d + i, (2 * d) - n, d);
        }
    }

    public static void userSwap(int[] arr, int a, int b, int d) {
        for (int i = a; i < d; i++) {
            int temp = arr[b + i];
            arr[b + i] = arr[a + i];
            arr[a + i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 12, 10, 11, 9, 8, 7, 6, 5 };
        int d = 3;
        rotate(arr, 0, d, arr.length);
        System.out.println(Arrays.toString(arr));
    }
}
