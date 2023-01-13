import java.util.*;

public class max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        List<Integer> ss = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                if (arr[i].contains("9")) {
                    continue;
                } else {
                    ss.add(Integer.valueOf(arr[i]));
                }

            }
        }
        if (ss.size() > 1) {
            System.out.println(Math.max(ss.get(0), ss.get(1)));
        } else {
            System.out.println(ss.get(0));
        }

    }
}
