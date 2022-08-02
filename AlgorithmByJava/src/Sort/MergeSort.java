package Sort;

/**
 * @author Peiran Li
 */
public class MergeSort {
  /**
   *
   * @param arr
   */
  public static void mergeSort(int[] arr) {

  }

  public static void process(int[] arr, int L, int R) {
    if (L == R) {
      return;
    }

    int mid = L + (R - L) >> 1;
    process(arr, L, mid);
    process(arr, mid + 1, R);
    merge(arr, L, mid, R);
  }

  private static void merge(int[] arr, int L, int mid, int R) {
    int[] help = new int[R - L + 1];
    int i = 0;
    int p1 = L;
    int p2 = mid + 1;

    while (p1 <= mid && p2 <= R) {
      help[i++] = arr[p1] <= arr[p2] ? arr[p1++] : arr[p2++];
    }

    while (p1 <= mid) {
      help[i++] = arr[p1++];
    }

    while (p2 <= R) {
      help[i++] = arr[p2++];
    }

    // copy to the original array
    for (i = 0; i < help.length; i++) {
      arr[L + i] = help[i];
    }
  }
}
