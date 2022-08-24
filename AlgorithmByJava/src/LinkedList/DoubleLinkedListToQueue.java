package LinkedList;


/**
 * @author Peiran Li
 */
public class DoubleLinkedListToQueue {
  public static class Node<TheType> {
    public TheType value;
    public Node next;
    public Node last;

    public Node (TheType value) {
      this.value = value;
      last = null;
      next = null;
    }
  }

  public static class myDoubleQueue<TheType> {
    private Node<TheType> head;
    private Node<TheType> tail;
    private int size = 0;

    public void pushHead(TheType value) {
      Node<TheType> curr = new Node<>(value);
      if (head == null) {
        head = curr;
        tail = curr;
      } else {
        curr.next = head;
        curr.last = null;
        head = curr;
      }
      size++;
    }

    public void pushTail(TheType value) {
      Node<TheType> curr = new Node<>(value);
      if (head == null) {
        head = curr;
        tail = curr;
      } else {
        tail.next = curr;
        curr.last = tail;
        tail = curr;
      }
      size--;
    }

    public TheType pullHead() {
      TheType result;
      if (head == null) {
        return null;
      }

      size--;
      result = head.value;
      if (head == tail) {
        head = null;
        tail = null;
      } else {
        head = head.next;
        head.last = null;
      }

      return result;
    }

    public TheType pullTail() {
      TheType result = null;
      if (head == null) {
        return null;
      }

      size--;
      result = head.value;
      if (head == tail) {
        head = null;
        tail = null;
      } else {
        tail = tail.last;
        tail.next = null;
      }
      return result;
    }
  }

}
