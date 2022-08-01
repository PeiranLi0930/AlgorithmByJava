package Sort;

import static Sort.Swap.swap;

/**
 * @author Peiran Li
 */
public class InsertSort {
  public static void insertionSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }

    for (int i = 1; i < arr.length; i++) {
      for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
        swap(arr, j, j + 1);
      }
    }
  }
}
