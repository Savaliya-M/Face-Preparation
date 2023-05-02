import java.util.HashMap;
import java.util.Map;

public class majorityelem {
    public static void main(String[] args) {
        int[] arr = new int[] { 5, 6, 5, 5, 5, 6, 6, 5 };
        int max = 0, val = -1;
        Map<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (mapp.containsKey(arr[i])) {
                mapp.put(arr[i], mapp.get(arr[i]) + 1);
            } else {
                mapp.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mapp.entrySet()) {

            if (max < entry.getValue()) {
                max = entry.getValue();
                val = entry.getKey();
            }
        }

        if (max > arr.length / 2) {
            System.out.println("majority element is = " + val);
            System.out.println("majority is = " + max);
        }
    }

}
