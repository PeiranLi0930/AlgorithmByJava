package Sort;

/**
 * This class include a method that implements
 *
 * @author Peiran Li
 */
public class BinarySearch {
  /**
   * Searches for the specified value using the binary search algorithm.
   * If the value is present then return the index, if not then return -1 indicating
   * the value is not in the array.
   *
   * @param list An ordered array of numbers
   * @param value The value to look for in the array.
   * @return The index of the value in the array or -1 if not found.
   */
  public static int binarySearch(int [] list, int value) {
    int index = -1;
    int low = 0;
    int high = list.length - 1;
    while ( low <= high) {
      int mid = (low + high)/2;
      if ( list[mid] == value) {  //found it
        index = mid;
        break;
      } else if ( list[mid] < value) { //higher
        low = mid + 1;
      } else {                    //lower
        high = mid - 1;
      }
    }
    return index;
  }
}
