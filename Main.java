
public class Main {
    public static void main(String[] args) {
        int c =0;
      for (int i = 2; i <= 155; i++) {
        if (isCoPrime(i)) {
          System.out.print(i + " ");
          c++;
        }
      }
    }

    public static boolean isCoPrime(int n) {
      for (int i = 2; i <= n / 2; i++) {
        if (n % i == 0 && gcd(i, n) != 1) {
          return false;
        }
      }
      return true;
    }
  
    public static int gcd(int a, int b) {
      if (b == 0) {
        return a;
      }
      return gcd(b, a % b);
    }
  }
  