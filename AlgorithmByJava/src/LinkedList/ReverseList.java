package LinkedList;

/**
 * @author Peiran Li
 */
public class ReverseList {
  public static class Node {
    public int value;
    public Node next;

    public Node(int data) {
      this.value = data;
    }
  }

  public static class DoubleNode {
    public int value;
    public DoubleNode last;
    public DoubleNode next;

    public DoubleNode (int data) {
      this.value = data;
    }
  }

  public static Node reverseSingleLinkedList (Node head) {
    Node pre = null;
    Node next = null;

    while (head != null) {
      next = head.next;
      head.next = pre;
      pre = head;
      head = next;
    }

    return pre;
  }

  public static DoubleNode reverseDoubleLinkedList(DoubleNode head) {
    DoubleNode pre = null;
    DoubleNode next = null;

    while (head != null) {
      next = head.next;
      head.next = pre;
      head.last = next;
      pre = head;
      head = next;
    }

    return pre;
  }

}
