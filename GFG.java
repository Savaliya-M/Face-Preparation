import java.util.*;
import java.io.*;

class GFG {

    /* Returns LCS X and Y */
    static String lcs(String a, String b) {
        int m = a.length();
        int n = b.length();
        char X[] = a.toCharArray();
        char Y[] = b.toCharArray();

        int L[][] = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0) {
                    L[i][j] = 0;
                } else if (X[i - 1] == Y[j - 1]) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                } else {
                    L[i][j] = Math.max(L[i - 1][j],
                            L[i][j - 1]);
                }
            }
        }

        int index = L[m][n];

        char[] lcs = new char[index + 1];
        int i = m, j = n;
        while (i > 0 && j > 0) {
            if (X[i - 1] == Y[j - 1]) {
                lcs[index - 1] = X[i - 1];
                i--;
                j--;
                index--;
            } else if (L[i - 1][j] > L[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        String ans = "";
        for (int x = 0; x < lcs.length; x++) {
            ans += lcs[x];
        }
        return ans;
    }

    static String longestPalSubseq(String str) {
        String rev = str;
        rev = reverse(rev);

        return lcs(str, rev);
    }

    static String reverse(String str) {
        String ans = "";
        char[] try1 = str.toCharArray();

        for (int i = try1.length - 1; i >= 0; i--) {
            ans += try1[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(longestPalSubseq(str));
    }
}