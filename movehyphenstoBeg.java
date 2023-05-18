public class movehyphenstoBeg {
    public static void main(String[] args) {
        String str = "Hel-l-o-w-o@-1d";
        String s1 = "", s2 = "";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)
                    || (str.charAt(i) >= 48 && str.charAt(i) <= 57)) {
                s2 += str.charAt(i);
            } else {
                s1 += str.charAt(i);

            }
        }
        str = s1 + s2;
        System.out.println(str);
    }
}
