package Sort;

/**
 * This class only includes one method that implements swap in an array.
 *
 * @author Peiran Li
 */
public class Swap {
  /**
   * This method swaps two elements in an array.
   *
   * @param arr the array to be processed
   * @param i the index of an element to be swapped
   * @param j the index of the other element to be swapped
   */
  public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[j] = arr[i];
    arr[i] = temp;
  }
}
