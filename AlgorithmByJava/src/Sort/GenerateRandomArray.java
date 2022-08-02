package Sort;

import java.util.Arrays;
import static Sort.InsertSort.insertionSort;

/**
 * This is a good test method to verify different algorithms
 *
 * @author Peiran Li
 */
public class GenerateRandomArray {

  /**
   * This method generates a random length array with random elements.
   *
   * <p> Math.random() generates a decimal in [0, 1) with equal probability </p>
   * <p> Math.random() * N generates a decimal in [0, N) with equal
   * probability </p>
   * <p> (int) Math.random * N generates an int in [0, N-1) with equal
   * probability </p>
   *
   * @param maxSize
   * @param maxValue
   * @return
   */
  public static int[] generateRandomArray(int maxSize, int maxValue) {

    // generate an array with random length
    int[] arr = new int[(int) ((maxSize + 1) * Math.random())];

    // fill the random length array with random elements
    for (int i = 0; i < arr.length; i++) {
      arr[i] =
          (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
    }

    return arr;
  }

  public static void main(String[] args) {
    int testTime = 50000;
    int maxSize = 100;
    int maxValue = 100;
    boolean succeed = true;
    String strArr1 = "";
    String strArr2 = "";

    for (int i = 0; i < testTime; i++) {
      int[] arr1 = generateRandomArray(maxSize, maxValue);
      int[] arr2 = Arrays.copyOf(arr1, arr1.length);

      QuickSort.quickSort(arr1);
      BubbleSort.bubbleSort(arr2);

      strArr1 = Arrays.toString(arr1);
      strArr2 = Arrays.toString(arr2);

      if (! strArr1.equals(strArr2)) {
        succeed = false;
        System.out.println(strArr1);
        System.out.println(strArr2);
        break;
      }
    }

    System.out.println(succeed? "Test Passed!" : "Test Wrong!");
  }
}
