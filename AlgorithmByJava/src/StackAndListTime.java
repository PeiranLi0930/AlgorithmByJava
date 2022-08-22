import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Peiran Li
 */
public class StackAndListTime {
  public static void main(String[] args) {
    int testTime = 100000;
    // Test for stack
    Stack<Integer> stack1 = new Stack<>();
    double start = System.currentTimeMillis();
    for (int i = 0; i < testTime; i++) {
      stack1.add(i);
    }
    while (!stack1.isEmpty()) {
      stack1.pop();
    }
    double end = System.currentTimeMillis();
    System.out.println("Stack Time: " + (end - start));

    // Test for List
    LinkedList<Integer> stack2 = new LinkedList<>();
    start = System.currentTimeMillis();
    for (int i = 0; i < testTime; i++) {
      stack2.addLast(i);
    }
    while (!stack2.isEmpty()) {
      stack2.pollLast();
    }
    end = System.currentTimeMillis();
    System.out.println("Linked List Time: " + (end - start));
  }
}
