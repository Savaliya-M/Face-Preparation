import java.util.*;

public class palindrome {
    public static int count = 0;

    public static boolean palindrome(String str) {
        String rstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rstr += str.charAt(i);
        }
        if (str.equals(rstr)) {
            return true;
        }

        return false;
    }

    public static void permute(String s, String answer) {
        if (s.length() == 0) {
            if (palindrome(answer)) {
                count++;
            }
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String rstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rstr += str.charAt(i);
        }
        if (!str.equals(rstr)) {
            System.out.println("not palindrome");
        } else {
            permute(str, "");
            System.out.println(count);
        }
    }
}
