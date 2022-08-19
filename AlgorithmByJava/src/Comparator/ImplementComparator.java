package Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Peiran Li
 */
public class ImplementComparator {
  public static class Student {

    public String name;
    public int id;
    public int age;

    public Student(String name, int id, int age) {
      this.name = name;
      this.id = id;
      this.age = age;
    }

    public static class IdComparator implements Comparator<Student> {
      @Override
      public int compare(Student s1, Student s2) {
        // if returns negative, s1 first, s2 then
        // if returns positive, s2 first, s1 then
        // if returns 0, whatever
        return s1.id - s2.id;
      }
    }

    public static class AgeComparator implements Comparator<Student> {
      @Override
      public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
      }
    }

    public static void printStudent(Student[] s) {
      for (int i = 0; i < s.length; i++) {
        System.out.println(s[i].name + ", " + s[i].id + ", " + s[i].age);
      }
    }

    public static void main(String[] args) {
      Student s1 = new Student("A", 1, 20);
      Student s2 = new Student("B", 3, 40);
      Student s3 = new Student("C", 2, 30);

      // 1. As for Arrays
      Student[] s = new Student[] {s1, s2, s3};
      printStudent(s);
      System.out.println("======");
      Arrays.sort(s, new IdComparator());
      printStudent(s);
      System.out.println("======");

      // 2. As for ArrayList
      ArrayList<Student> studentArrayList = new ArrayList<>();
      studentArrayList.add(s1);
      studentArrayList.add(s2);
      studentArrayList.add(s3);
      printStudent(s);
      System.out.println("======");
      studentArrayList.sort(new IdComparator());
      printStudent(s);
    }
  }


}
