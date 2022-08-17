package BitMap;

/**
 * @author Peiran Li
 */
public class BitMap02 {

  public static class BitMap {
    private long[] bits;

    public BitMap(int max) {
      bits = new long[(max + 64) >> 6];
    }

    public void add(int num) {
      // num / 64 => num >> 6
      // num % 64 => num & 63
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

}
