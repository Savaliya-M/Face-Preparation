import java.util.*;

public class Strobogramatic {
    public static char rotate(char c) {
        switch (c) {
            case '6':
                return '9';
            case '9':
                return '6';
            default:
                return c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String s2 = "";
        int len = num.length();

        if (len == 1) {
            if (num.equals("0") || num.equals("1") || num.equals("8")) {
                System.out.println("stobogrammatic number");
            } else {
                System.out.println("Not stobogrammatic number");
            }
        } else {
            if (num.contains("2") || num.contains("3") || num.contains("4") || num.contains("5") || num.contains("7")) {
                System.out.println("Not stobogrammatic number");
            } else {
                StringBuilder sb = new StringBuilder(num);
                sb.reverse();
                s2 = sb.toString();
                String temp = "";
                // if you want to write above three line in a single line then
                // s2 = new StringBuilder(num).reverse().toString();
                for (int i = 0; i < s2.length(); i++) {
                    temp += rotate(s2.charAt(i));
                }

                if (temp.equals(num)) {
                    System.out.println("stobogrammatic number");
                } else {
                    System.out.println("Not stobogrammatic number");
                }
            }
        }

    }
}
