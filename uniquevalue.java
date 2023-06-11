import java.util.Arrays;
import java.util.Scanner;

public class uniquevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many elements you want to enter = ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        if (n % 2 == 0) {
            System.out.println("You have to enter length in odd numbers");
            return;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i = i + 2) {
            if (arr[i] == arr[i + 1]) {
                if (arr[i] == arr[i + 2]) {
                    System.out.println("Invalid input");
                    return;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i];
        }
        System.out.println("Unique element = " + ans);
    }
}
