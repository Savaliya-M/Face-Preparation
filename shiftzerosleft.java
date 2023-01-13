import java.util.*;

public class shiftzerosleft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 0, 1, 0, 1, 0 };
        int i = 0, j = 5 - 1;
        while (true) {
            if (i >= j) {
                break;
            }
            if (arr[i] == 0) {
                i++;
            } else if (arr[j] == 1) {
                j--;
            } else {
                arr[i] = 0;
                arr[j] = 1;
            }
        }

        for (int k : arr) {
            System.out.print(k + " ");
        }
    }
}
