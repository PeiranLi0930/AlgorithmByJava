package LinkedList;

/**
 * Time Complexity: O(1)
 * @author Peiran Li
 */
public class SingleLinkedListToQueue {
  public class Node<TheType> {
    public TheType value;
    public Node<TheType> next;
    public Node(TheType value) {
      this.value = value;
    }
  }

  public class MyQueue<TheType> {
    private Node<TheType> head;
    private Node<TheType> tail;
    private int size;

    public MyQueue (){  // constructor
      head = null;
      tail = null;
      size = 0;
    }

    public int size() {
      return size;
    }

    public boolean isEmpty() {
      return size == 0;
    }

    public void offer(TheType value) {
      Node<TheType> curr = new Node<TheType>(value);
      if (tail == null) {
        tail = curr;
        head = curr;
      } else {
        tail.next = curr;
        tail = curr;
      }
      size++;
    }

    public TheType pop() {
      TheType value = null;
      if (head != null) {
        value = head.value;
        head = head.next;
        size--;
      }
      if (head == null) {
        tail = null;
      }
      return value;
    }

    public TheType peek() {
      TheType value = null;
      if (head != null) {
        value = head.value;
      }
      return value;
    }
  }
}
