package Sort;

/**
 * This class implements swap in an array by using XOR operation.
 *
 * !!! Note !!!
 * Before using this method, we must ensure that arr[i] and arr[j] are saved
 * in different memory location.
 *
 * @author Peiran Li
 */
public class XORSwap {

  public static void swap (int[] arr, int i, int j) {
    arr[i] = arr[i] ^ arr[j];

  }

  public static void printOddTimes2Numbers(int[] arr) {
    int eor = 0;
    for (int current : arr) {
      eor ^= current;
    }

    // a and b are at least different at one bit. Pick out the right most bit
    // that a and b are different at.
    int rightMostOne = eor & (~eor + 1);

    int eor2 = 0;
    for (int current : arr) {
      if ((current & rightMostOne) == 0) {
        eor2 ^= current; // then eor2 = a or b
      }
    }

    eor ^= eor2; // then eor = b or a
  }
}
