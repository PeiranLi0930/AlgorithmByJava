package Sort;

import java.util.Arrays;

/**
 * @author Peiran Li
 */
public class RadixSort {
  public static void radixSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }
    radixSort(arr, 0, arr.length - 1, maxBits(arr));

  }

  /**
   * Calculate the number of bits that the max number in the array has.
   *
   * @param arr an int array
   * @return number of bits
   */
  public static int maxBits(int[] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      max = Math.max(max, arr[i]);
    }

    int result = 0;
    while (max != 0) {
      result++;
      max /= 10;
    }

    return result;
  }

  public static void radixSort(int[] arr, int L, int R, int digit) {
    final int radix = 10;
    int i,j = 0;
    int[] bucket = new int[R - L + 1];

    for (int d = 1; d <= digit; d++) {
      // iterate "digit" times of putting in and pulling out of the container
      int[] count = new int[radix];

      for (i = L;  i <= R ; i++) {
        j = getDigit(arr[i], d);
        count[j]++;
      }

      for (i = 1; i < radix; i++) {
        count[i] = count[i] + count[i - 1];
      }

      for (i = R; i >= L; i--) {
        j = getDigit(arr[i], d);
        bucket[count[j] - 1] = arr[i];
        count[j]--;
      }

      for (i = L, j = 0; j < bucket.length; i++, j++) {
        arr[i] = bucket[j];
      }
    }
  }

  public static int getDigit(int num, int d) {
    return (num / (int) Math.pow(10, d - 1)) % 10;
  }

  public static void main(String[] args) {
    int[] arr = {135, 125, 930, 49, 483, 348};
    radixSort(arr);
    System.out.println(Arrays.toString(arr));

  }
}
