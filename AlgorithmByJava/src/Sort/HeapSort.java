package Sort;

/**
 * @author Peiran Li
 */
public class HeapSort {

  public static void heapSort(int[] arr) {
    if (arr == null || arr.length < 2) {
      return;
    }

    for (int i = 0; i < arr.length; i++) { // O(N)
      heapInsert(arr, i); // O(logN)
    }

    int heapSize = arr.length;
    Swap.swap(arr, 0, --heapSize);

    while (heapSize > 0) { // O(N)
      heapify(arr, 0, heapSize);  // O(logN)
      Swap.swap(arr, 0, --heapSize); // O(1)
    }

  }

  /**
   * This method configures a Max Heap.
   *
   * @param arr the array need to be processed
   * @param index the current element that need to put into max heap
   */
  public static void heapInsert(int[] arr, int index) {
    while (arr[index] > arr[(index - 1) / 2]) {
      Swap.swap(arr, index, (index - 1) / 2);
      index = (index - 1) / 2;
    }
  }

  /**
   * This method put the root of the whole heap to the correct position to
   * manufacture the new max heap.
   *
   * @param arr the array configuring the max heap
   * @param index the root's index
   * @param heapSize the actual size of the heap
   */
  public static void heapify(int[] arr, int index, int heapSize) {
    int left = index * 2 + 1;

    while (left < heapSize) {
      // compare the left child with the right child, and the larger child's
      // index is given to largest
      int largest = left + 1 < heapSize && arr[left + 1] > arr[left] ?
          left + 1 : left;

      // compare the largest child with the father
      largest = arr[largest] > arr[index] ? largest : index;

      // if father node is the largest
      if (largest == index) {
        break;
      }

      // if one child node is the largest, and then exchange the largest
      // child with its father node.
      Swap.swap(arr, largest, index);

      // prepare for the next loop
      index = largest;
      left = index * 2 + 1;
    }
  }

}
