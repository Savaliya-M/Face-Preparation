import java.util.*;
import java.util.Arrays;

public class substring {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();

        for (int i = 0; i < data.length(); i++) {
            int check = data.charAt(i);
            if (48 < check && check < 57) {
                System.out.println("incorrect input ");
                return;
            }
        }
        data = data.toLowerCase();
        int length = (data.length() * (data.length() + 1)) / 2;
        String[] dataarr = new String[length];
        int index = 0;
        for (int i = 0; i < data.length(); i++) {
            for (int j = i; j < data.length(); j++) {
                dataarr[index] = data.substring(i, j + 1);
                index++;
            }
        }
        Arrays.sort(dataarr);
        for (String x : dataarr) {
            System.out.println(x);
        }

    }

}
