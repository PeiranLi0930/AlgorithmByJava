package Sort;

/**
 * @author Peiran Li
 */
public class QuickSort {

  public static void quickSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }
    quickSort(arr, 0, arr.length - 1);
  }

  public static void quickSort(int[] arr, int L, int R) {
    if (L < R) {
      // swap a random element and the last element in the array with equal
      // probability
      Swap.swap(arr, L + (int) (Math.random() * (R - L + 1)), R);
      int[] p = partition(arr, L, R);
      quickSort(arr, L, p[0] - 1);
      quickSort(arr, p[1] + 1, R);
    }
  }

  /**
   * This method re-arrange the original array to three parts:
   * <p> 1) left: less than the arr[R] </p>
   * <p> 2) middle: equal to the arr[R] </p>
   * <p> 3) right: large than the arr[R] </p>
   *
   * <p>
   *   The last step is put the original arr[R] to the middle part.
   * </p>
   *
   * <p>
   *   Hint: use two areas representing the left and right parts. The right-most
   *   fringe of the left area is rightFringeOfLess, and the left-most fringe
   *   of the right area is leftFringeOfLarge.
   * </p>
   *
   * <p>
   *   1) if arr[i] < target, then exchange arr[i] and the right element next
   *   to the rightFringeOfLess, rightFringeOfLess moves to right, and i++
   *   2) if arr[i] = target, then i++
   *   3) if arr[i] > target, then exchange arr[i] and the left element next to
   *   the leftFringeOfLarge, leftFringeOfLarge moves to left, and i doesn't
   *   change.
   * </p>
   *
   * @param arr the array to be processed
   * @param L the left bound in the array
   * @param R the right bound in the array
   * @return the equal part's left bound and right bound
   */
  public static int[] partition(int[] arr, int L, int R) {
    int rightFringeOfLess = L - 1;
    int leftFringeOfLarge = R;

    while (L < leftFringeOfLarge) { // L is the cursor
      if (arr[L] < arr[R]) {
        Swap.swap(arr, ++rightFringeOfLess, L++);
      } else if (arr[L] > arr[R]) {
        Swap.swap(arr, --leftFringeOfLarge, L);
      } else {
        L++;
      }
    }

    // put the last element to the equal part
    Swap.swap(arr, leftFringeOfLarge, R);

    return new int[] {rightFringeOfLess + 1, leftFringeOfLarge};
  }
}

