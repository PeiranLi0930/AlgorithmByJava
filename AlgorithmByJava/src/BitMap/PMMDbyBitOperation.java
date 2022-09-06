package BitMap;

/**
 * @author Peiran Li
 */
public class PMMDbyBitOperation {
  public static int add(int a, int b) {
    int sum = a;
    while (b != 0) {
      sum = a ^ b;  // bit add operation without carry-on
      b = (a & b) << 1; // the carry-on information
      a = sum;
    }
    return sum;
  }

  public static int minus(int a, int b) {
    return add(a, add(~b, 1));
  }

  public static int multiply (int a, int b) {
    int result = 0;
    while (b != 0) {
      if ((b & 1 ) != 0) { // determine whether the last bit in b is '1'
        result = add(result, a);
      }
      a <<= 1;
      b >>>= 1; // move right 1 bit without consideration of b's negativity
    }
    return result;
  }

  public static int absolute(int a) {
    return a < 0 ? add(~a, 1) : a;
  }

  public static boolean isNegative(int a) {
    return a < 0;
  }

  /**
   * Note: First, we need to change the numbers into their absolute values.
   * @param a
   * @param b
   * @return
   */
  public static int divide(int a, int b) {
    if (a == Integer.MIN_VALUE && b == Integer.MIN_VALUE) {
      return 1;
    } else if (b == Integer.MIN_VALUE) {
      return 0;
    } else if (a == Integer.MIN_VALUE) {
      if (b == -1) {
        // should be Integer.MAX_VALUE + 1， but LeetCode regulated that if
        // the situation occurs, then return Interger.MAX_VALUE.
        return Integer.MAX_VALUE;
      } else {
        // | a (Integer.MIN_VALUE) + 1 |
        int ans = divide(add(a, 1), b);
        return add(ans, divide(minus(a, multiply(ans, b)), b));
      }
    }

    int x = absolute(a);
    int y = absolute(b);
    int result = 0;

    for (int i = 30; i >= 0 ; i = minus(i, 1)) {
      if ((x >> i) >= y) {
        result |= (1 << i);
        x = minus(x, y << i);
      }
    }
    // consider the negativity
    return isNegative(a) ^ isNegative(b) ? add(~result, 1) : result;
  }

  public static void main(String[] args) {
    System.out.println(-18/7);
  }
}
