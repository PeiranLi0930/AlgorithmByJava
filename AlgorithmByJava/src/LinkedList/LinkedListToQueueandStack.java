package LinkedList;

/**
 * @author Peiran Li
 */
public class LinkedListToQueueandStack {
  public static class Node<TheType> {
    public TheType value;
    public Node<TheType> next;

    public Node(TheType value) {
      this.value = value;
      this.next = null;
    }
  }

  public static class MyQueue<TheType>{
    private Node<TheType> head;
    private Node<TheType> tail;
    private int size = 0;

    public MyQueue() {
      head = null;
      tail = null;
      size = 0;
    }

    public boolean isEmpty() {
      return size == 0;
    }

    public int size() {
      return size;
    }

    public void offer(TheType value) {
      Node<TheType> cur = new Node<TheType>(value);
      if (tail == null) {
        head = cur;
        tail = cur;
      } else {
        tail.next = cur;
        tail = cur;
      }
      size++;
    }

    public TheType poll() {
      TheType ans = null;

      if (head != null) {
        ans = head.value;
        head = head.next;
        size--;
      }
      if (head == null) {
        tail = null;
      }

      return ans;
    }

    public TheType peek() {
      TheType ans = null;
      if (head != null) {
        ans = head.value;
      }
      return ans;
    }
  }

  public static class MyStack<TheType> {
    private Node<TheType> head;
    private int size;

    public MyStack() {
      head = null;
      size = 0;
    }

    public boolean isEmpty() {
      return size == 0;
    }

    public int size() {
      return size;
    }

    public void push (TheType value) {
      Node<TheType> curr = new Node<>(value);
      if (head == null) {
        head = curr;
      } else {
        curr.next = head;
        head = curr;
      }
      size++;
    }

    public TheType pop() {
      TheType ans = null;
      if (head != null) {
        ans = head.value;
        head = head.next;
        size--;
      }
      return ans;
    }

    public TheType peek() {
      TheType ans = null;

      if (head != null) {
        ans = head.value;
      }

      return ans;
    }
  }

}
