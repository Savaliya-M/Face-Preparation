import java.util.*;

public class evenodd {
    static void countEvenSum(int low, int high, int k) {
        int even_count = high / 2 - (low - 1) / 2;
        int odd_count = (high + 1) / 2 - low / 2;

        long even_sum = 1;
        long odd_sum = 0;

        for (int i = 0; i < k; i++) {
            long prev_even = even_sum;
            long prev_odd = odd_sum;
            even_sum = (prev_even * even_count) + (prev_odd * odd_count);
            odd_sum = (prev_even * odd_count) + (prev_odd * even_count);
        }
        System.out.println(even_sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int r = sc.nextInt();
        countEvenSum(start, end, r);
        
    }
}
