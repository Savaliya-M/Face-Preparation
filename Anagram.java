import java.util.*;

class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char[] cstr1 = str1.toCharArray();
        char[] cstr2 = str2.toCharArray();

        if (cstr1.length == cstr2.length) {
            for (int i = 0; i < cstr1.length; i++) {
                for (int j = 1; j < cstr1.length - i; j++) {
                    if (cstr1[j - 1] > cstr1[j]) {
                        char temp = cstr1[j - 1];
                        cstr1[j - 1] = cstr1[j];
                        cstr1[j] = temp;
                    }
                    if (cstr2[j - 1] > cstr2[j]) {
                        char temp = cstr2[j - 1];
                        cstr2[j - 1] = cstr2[j];
                        cstr2[j] = temp;
                    }
                }
            }
            int i;
            for (i = 0; i < cstr2.length; i++) {
                if (cstr1[i] != cstr2[i]) {
                    System.out.println("String is not an Anagram");
                    break;
                }
            }
            if (i == cstr1.length) {
                System.out.println("String is Anagram.");
            }
        } else {
            System.out.println("String is not an Anagram");
        }

    }
}