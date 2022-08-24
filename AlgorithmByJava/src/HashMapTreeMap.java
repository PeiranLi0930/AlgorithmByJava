import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/**
 * @author Peiran Li
 */
public class HashMapTreeMap {
  public static void main(String[] args) {

    List<Integer> num = new ArrayList<>();




    TreeMap<Integer, String> map = new TreeMap<>();

    map.put(3, "I am 3");
    map.put(4, "I am 4");
    map.put(5, "a");

    System.out.println(map.firstKey());
    System.out.println(map.lastKey());
    System.out.println(map.floorKey(2));
  }


}
