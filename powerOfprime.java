import java.util.*;

public class powerOfprime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int p = sc.nextInt();
        int sum = 0;
        // first check if p is prime or not if not then give error
        while (n != 0) {
            sum += n / p;
            n /= p;
        }
        System.out.println(sum);
    }
}
