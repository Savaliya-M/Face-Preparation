public class extractum {
    public static void main(String[] args) {
        String str = "this is the 5051 and 9735 or 776";
        String[] cc = str.split(" ");
        int max = 0, temp = 0;
        for (String ss : cc) {
            try {
                Double.parseDouble(ss);
                if (!ss.contains("9")) {
                    temp = Integer.parseInt(ss);
                    max = Math.max(max, temp);
                }
            } catch (NumberFormatException e) {
            }
        }
        System.out.println(max);
    }
}
