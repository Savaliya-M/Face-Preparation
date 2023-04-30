public class longestPalindromSubString {
    public static void main(String[] args) {
        String str = "abcdefedghghgdefcdcba";
        char[] chars = new char[str.length() * 2 - 1];
        int k = 0;
        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                chars[i] = str.charAt(k);
                k++;
            } else {
                chars[i] = '$';
            }
        }

        int max = 0, ii = -1, jj = -1;
        for (int i = 0; i < chars.length; i++) {
            int count = 1, prev = i, next = i;
            if (!(chars[i] == '$')) {
                for (int j = i; j < chars.length; j += 2) {
                    if (prev - 2 >= 0 && next + 2 < chars.length && chars[prev - 2] == chars[next + 2]) {
                        count += 2;
                        prev -= 2;
                        next += 2;
                    } else if (count > max) {
                        max = count;
                        ii = prev;
                        jj = next;
                        break;
                    } else {
                        break;
                    }
                }
            }
        }
        String longestPalindromicSubstring = str.substring(ii / 2, jj / 2 + 1);
        System.out.println(longestPalindromicSubstring);
        System.out.println(max);
    }
}
