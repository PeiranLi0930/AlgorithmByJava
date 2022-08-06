package SortProblems;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Peiran Li
 */
public class SortArrayLessThanKSteps {
  public static void sortArrayLessThanKSteps(int[] arr, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    int index = 0;
    for (index = 0; index < Math.min(arr.length, k); index++) {
      heap.add(arr[index]);
    }
    int i = 0;
    for (; index < arr.length; i++, index++) {
      heap.add(arr[index]);
      arr[i] = heap.poll();
    }

    while (!heap.isEmpty()) {
      arr[i++] = heap.poll();
    }
  }

  public static void main(String[] args) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    heap.add(10);
    heap.add(5);
    heap.add(3);
    heap.add(9);
    heap.add(19);
    System.out.println(Arrays.toString(heap.toArray()));
  }
}
