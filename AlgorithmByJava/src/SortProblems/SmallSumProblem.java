package SortProblems;

/**
 * Question Description:
 * <p>
 *   Definition: In an array, the sum of the left part numbers that are less
 *   than the current element is called small sum problem.
 * </p>
 * <p>
 *   Hint:
 *   Alternate Solution: Calculate the sum of the right part numbers that are
 *   large than the current element.
 * </p>
 *
 * @author Peiran Li
 */
public class SmallSumProblem {

  public static int smallSum(int[] arr) {
    if (arr == null || arr.length < 2) {
      return 0;
    }
    return process(arr, 0, arr.length - 1);
  }

  public static int process(int[] arr, int L, int R) {
    if (L == R) {
      return 0;
    }

    int mid = L + (R - L) >> 1;
    return process(arr, L, mid) + process(arr, mid + 1, R) + merge(arr, L,
        mid, R);
  }

  public static int merge(int[] arr, int L, int mid, int R) {
    int[] help = new int[R - L + 1];
    int i = 0;
    int p1 = L;
    int p2 = mid + 1;
    int result = 0;

    while (p1 <= mid && p2 <= R) {
      result += arr[p1] < arr[p2]? (R - p2 + 1) * arr[p1] : 0;
      // NOTE: if the left element p1 pointing to is equal to the right
      // element p2 pointing to, then copy the right element to the help[],
      // which is little different from traditional merge sort.
      help[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
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

    return result;
  }
}
