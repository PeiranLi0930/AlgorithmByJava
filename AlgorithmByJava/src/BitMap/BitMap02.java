package BitMap;

/**
 * @author Peiran Li
 */
public class BitMap02 {

  public static class BitMap {
    private long[] bits;

    public BitMap(int max) {
      // To contain the max value, (max + 64) / 64 bits should be prepared
      bits = new long[(max + 64) >> 6];
    }

    public void add(int num) {
      // num / 64 => num >> 6   find the index
      // num % x <=> num & (x - 1)
      // num % 64 => num & 63   find the bit containing the num
      // 1L means 0000...0001 (64-bit), and must be 1l. If it is 1, then 1
      // only has 32 bits
      bits[num >> 6] |=  (1L << (num & 63));
    }

    public void delete(int num) {
      bits[num >> 6] &= ~(1L << (num & 63));
    }

    public boolean contains(int num) {
      return (bits[num >> 6] & (1L << (num & 63))) != 0;
    }
  }

  public static void main(String[] args) {
    System.out.println(100 / 8);
    System.out.println(100 >> 3);
  }

}
