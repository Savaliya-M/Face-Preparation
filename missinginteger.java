import java.util.Arrays;
import java.util.Scanner;

public class missinginteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("If you want to skip any index then press '-999'");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if (val == -999) {
                continue;
            }
            arr[i] = val;
        }

        int min = Integer.MAX_VALUE, in = -1;

        Arrays.sort(arr);
        int max = arr[n - 1];
        for (int i = 0; i < n - 1; i++) {
            if ((arr[i] > 0) && (min > arr[i])) {
                min = arr[i];
                in = i;
                break;
            }
        }
        int miss = Integer.MIN_VALUE;
        if (max <= 0) {
            System.out.println("Missing value is 1 ");
        } else {
            int c = 0, j = in;
            for (int i = arr[in]; i < max; i++) {
                if (i != arr[j]) {
                    miss = i;
                    c++;
                } else {
                    j++;
                }
            }
            if (c == 1) {
                System.out.println("Missing value is " + miss);
            } else if (c < 1) {
                System.out.println("Missing value is " + (max + 1));
            } else {
                System.out.println("invalid input");
            }

        }

    }
}
