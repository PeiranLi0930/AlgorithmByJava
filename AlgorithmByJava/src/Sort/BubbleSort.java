package Sort;
import java.util.Arrays;

import static Sort.Swap.swap;

/**
 *
 * @author Peiran Li
 */
public class BubbleSort {
  public static void bubbleSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }

    for (int end = arr.length - 1; end > 0; end--) {
      for (int i = 0; i < end; i++) {
        if (arr[i] > arr[i + 1]) {
          swap(arr, i, i + 1);
        }
      }
    }
  }
}
