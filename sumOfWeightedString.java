import java.util.HashSet;
import java.util.Set;

public class sumOfWeightedString {
    public static void sumOfWeightedString(String Q, String str, int k) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < str.length(); i++) {
            int sum = 0;
            for (int j = i; j < str.length(); j++) {
                sum += Q.charAt(str.charAt(j) - 'a') - '0';

                if (sum > k) {
                    break;
                } else {
                    set.add(str.substring(i, j + 1));
                }
            }

        }
        for (String s : set) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        String Q = "12395670912473496789099873";
        String str = "yrstibcxaerjft";
        int k = 15;
        sumOfWeightedString(Q, str, k);
    }
}
