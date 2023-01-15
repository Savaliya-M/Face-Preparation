import java.util.*;

public class maximunIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            
        int[] arr = new int[] { 34, 8, 10, 3, 2, 80, 30, 33, 1 };
        int max = Integer.MIN_VALUE, j = arr.length - 1;
        for (int i = 0; i < arr.length;) {
            if (i < j) {
                if (arr[i] < arr[j]) {
                    max = Math.max(max, (j - i));
                    i++;
                    j = arr.length - 1;
                } else {
                    j--;
                }
            } else {
                break;
            }

        }
        System.out.println(max);

        // int arr[] = { 34, 8, 10, 3, 2, 80, 31, 33 };
        // int j = arr.length - 1;
        // int d = 0;
        // int max = 0;
        // for (int i = 0; i < arr.length;) {
        // if (i < j) {

        // if (arr[i] < arr[j]) {
        // d = j - i;
        // i++;
        // j = arr.length - 1;
        // if (max <= d) {
        // max = d;
        // }
        // } else {
        // j--;
        // }
        // } else {
        // break;
        // }
        // }
        // System.out.println(max);
    }

}
