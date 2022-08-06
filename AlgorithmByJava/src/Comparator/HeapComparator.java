package Comparator;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Peiran Li
 */
public class HeapComparator {
  public static class AComp implements Comparator<Integer> {
    @Override
    public int compare(Integer arg0, Integer arg1) {

      // return negative: arg1 is above arg0
      // return positive: arg0 is above arg1
      // return 0: whatever.
      return arg1 - arg0;
    }
    }

  public static void main(String[] args) {
    // use a comparator to change the strategy of Priority Heap
    PriorityQueue<Integer> heap = new PriorityQueue<>(new AComp());

    for (int i = 0; i < 10; i++) {
      heap.add(i);
    }

    while (!heap.isEmpty()) {
      System.out.println(heap.poll());
    }
  }
}

