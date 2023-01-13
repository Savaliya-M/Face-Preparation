import java.util.*;

public class primepairs {
    static boolean prime(int a) {
        if (a == 1) {
            return false;
        }
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int i = low; i < high; i++) {
            if ((i + 6) > high) {
                break;
            }
            if (prime(i) && prime(i + 6)) {
                System.out.println(i + " " + (i + 6));

            }
        }

    }
}
