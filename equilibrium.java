public class equilibrium {
    public static void main(String[] args) {
        // int[] arr = new int[] { -2, 5, 3, 1, 2, 6, -4, 2 };
        // int[] arr = new int[] { -1, 2, 3, 0, 3, 2, -1 };
        int[] arr = new int[] { -1, 26, -2, 1, -22, 6, 17, 23 };

        int osum = 0;
        for (int i = 0; i < arr.length; i++) {
            int isum = 0;
            for (int j = i; j < arr.length; j++) {
                isum += arr[j];
            }
            osum += arr[i];
            if (osum == isum) {
                System.out.println("point " + i);
                System.out.println(osum);
                break;
            }
        }
    }
}
