package Comparator;

import com.sun.source.tree.WhileLoopTree;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Peiran Li
 */
public class Priority {
  public static class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
      return num2 - num1;
    }
  }

  public static class Student {
    public String name;
    public int id;
    public int age;

    public Student(String name, int id, int age) {
      this.name = name;
      this.id = id;
      this.age = age;
    }
  }

  public static class IDComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
      return s1.id - s2.id;
    }
  }

  public static void main(String[] args) {
    // For Integer
    PriorityQueue<Integer> heap = new PriorityQueue<>(new MyComparator());
    heap.add(1);
    heap.add(4);
    heap.add(6);
    heap.add(2);
    heap.add(9);

    while (! heap.isEmpty()) {
      System.out.println(heap.poll());
    }

    // For Student Class
    PriorityQueue<Student> studentPriorityQueue =
        new PriorityQueue<>(new IDComparator());
    Student s1 = new Student("John", 3, 20);
    Student s2 = new Student("Jack", 2, 30);
    Student s3 = new Student("Lucy", 1, 25);
    studentPriorityQueue.add(s1);
    studentPriorityQueue.add(s3);
    studentPriorityQueue.add(s2);

    while (! studentPriorityQueue.isEmpty()) {
      Student s = studentPriorityQueue.poll();
      System.out.println(s.name + " " + s.id + " " + s.age);
    }
  }
}
