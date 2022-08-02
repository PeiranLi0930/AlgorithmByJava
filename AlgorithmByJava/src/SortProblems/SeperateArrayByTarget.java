package SortProblems;

/**
 * Question Description:
 * <p>
 *   Re-arrange the array to make the left-part of the array is less than
 *   the target, the middle-part is equal to the target, and the right-part
 *   is larger than the target.
 * </p>
 * <p>
 *   Hint: use two areas representing the left and right parts. The right-most
 *   fringe of the left area is L, and the left-most fringe of the right area
 *   is G.
 *   1) if arr[i] < target, then exchange arr[i] and the right element next
 *   to the L fringe, L moves to right, and i++
 *   2) if arr[i] = target, then i++
 *   3) if arr[i] > target, then exchange arr[i] and the left element next to
 *   the G fringe, G moves to left, and i doesn't change.
 * </p>
 * @author Peiran Li
 */
public class SeperateArrayByTarget {

}
