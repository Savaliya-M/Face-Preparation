public class logestSeqOf1AfterFlipABit {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE, count = 0, max = 0, pre = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            } else if ((n & 1) == 0) {
                pre = (n & 2) == 0 ? 0 : count;
                count = 0;
            }
            max = Math.max(max, pre + count);
            n >>= 1;
        }
        System.out.println(max + 1);
    }
}
