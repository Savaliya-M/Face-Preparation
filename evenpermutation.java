import java.util.*;

public class evenpermutation {
    public static int count = 0;

    public static void helper(ArrayList<Integer> arr, ArrayList<Integer> sol, int m, int r) {
        if (m == r) {
            if (sol.get(0) != 0) {
                int sum = 0;
                for (int i : sol) {
                    sum += i;
                }
                if (sum % 2 == 0) {
                    count++;
                }
            }

            m = 0;
            return;
        }

        for (int k = 0; k < arr.size(); k++) {
            sol.add(arr.get(k));
            m++;
            helper(arr, sol, m, r);
            sol.remove(sol.size() - 1);
            m--;
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        int r = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = low; i <= high; i++) {
            arr.add(i);
        }

        ArrayList<Integer> sol = new ArrayList<>();
        helper(arr, sol, 0, r);
        if (count % 2 == 0) {
            System.out.println(count);
        } else {
            System.out.println("Invalid input");
        }
    }
}
