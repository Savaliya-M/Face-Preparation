import java.util.*;

public class FamilyGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();

        boolean[] narr = new boolean[n];
        int j = 0, i;
        for (i = 0; i < narr.length && n != 1;) {

            if (narr[i] == false) {
                if (str.charAt(j) == 'y') {
                    narr[i] = true;
                    j++;
                    n--;
                } else {
                    j++;
                }
            }
            i++;
            if (i >= narr.length) {
                i = 0;
            }
            if (j >= str.length()) {
                j = 0;
            }

        }

        for (int k = 0; k < narr.length; k++) {
            if (narr[k] == false) {
                System.out.println(k + 1);
            }
        }
    }
}

// 3
// xyx

// 1