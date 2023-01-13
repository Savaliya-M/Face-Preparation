import java.util.*;

public class uniqueNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int count = 0;
        for (int i = low; i <= high; i++) {
            String temp = String.valueOf(i);
            if (temp.charAt(0) != temp.charAt(1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
