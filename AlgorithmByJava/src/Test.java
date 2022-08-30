/**
 * @author Peiran Li
 */
public class Test {
  public static class Node {
    public Node next;
    public int value;

    public Node(int value) {
      this.value = value;
      this.next = null;
    }
  }

  public static void headOperation (Node head) {
    head = head.next;
  }

  public static void main(String[] args) {
    Node a1 = new Node(3);
    a1.next = new Node(4);
    a1.next.next = new Node(5);

    headOperation(a1);

    System.out.println(a1.value);
  }

}
