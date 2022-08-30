package LinkedList;

/**
 * Time Complexity: O(1)
 * @author Peiran Li
 */

public class SingleLinkedListToStack {
  public class Node<TheType> {
    public TheType value;
    public Node<TheType> next;

    public Node(TheType value){
      this.value = value;
    }
  }

  public class MyStack<TheType> {
    public Node<TheType> head;
    public int size = 0;

    public MyStack() { // constructor
      this.head = null;
      this.size = 0;
    }

    public int size() {
      return size;
    }

    public boolean isEmpty() {
      return size == 0;
    }

    public void push(TheType value) {
      Node<TheType> curr = new Node<TheType>(value);
      if (head == null) {
        head = curr;
      } else {
        curr.next = head;
        head = curr;
      }
      size++;
    }

    public TheType pop() {
      TheType result = null;
      if (head != null) {
        result = head.value;
        head = head.next;
        size--;
      }
      return result;
    }

    public TheType peek() {
      return head == null ? null : head.value;
    }

  }
}
