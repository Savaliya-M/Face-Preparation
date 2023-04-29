public class maxProductSubarray {
    public static void main(String[] args) {
        // int[] arr = new int[] { 1, 9, -2, 6, 5, -5, -8, 60 };
        int[] arr = new int[] { 4, -3, -2, -6, 8, 4, -20 };
        int max = Integer.MIN_VALUE, start = -1, end = -1;
        for (int i = 0; i < arr.length; i++) {
            int prod = 1;
            for (int j = i; j < arr.length; j++) {
                prod *= arr[j];

                // max = Math.max(max, prod);
                if (max < prod) {
                    max = prod;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println(max);
    }
}
