public class uniqued {
    public static void main(String[] args) {
        int start = 10;
        int end = 15, count = 0;
        for (int i = start; i <= end; i++) {
            String s = String.valueOf(i);
            int flag = 0;
            for (int j = 0; j < s.length() - 1; j++) {
                if (s.charAt(j) == s.charAt(j + 1)) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

}
