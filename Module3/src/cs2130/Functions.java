package cs2130;
import java.util.ArrayList;
import java.util.Collections;

public class Functions {
  /**
   * Returns the intersection of two sets
   * @param domain, an ArrayList of integers that define the domain of a function
   * @param target, an ArrayList of integers that define the target of a function
   * @param range, an ArrayList of integers that define the range of a function.
   *  The domain and range must be in matching order. Each value in the
   *               domain is to have a matching value in the range at the
   *               same index that forms an ordered pair.
   * @return, returns true if the function has the one-to-one property
   * and false otherwise
   */
  static boolean isOneToOne(ArrayList<Integer> domain, ArrayList<Integer> target, ArrayList<Integer> range)  {
    for (int x = 0; x < (range.size() - 1); x++) {
      for (int y = x + 1; y < range.size(); y++) {
        if (range.get(x) == range.get(y)) {
          return false;
        }
      }
    }
    return true;
  }
  /**
   * Returns the intersection of two sets
   * @param domain, an ArrayList of integers that define the domain of a function
   * @param target, an ArrayList of integers that define the target of a function
   * @param range, an ArrayList of integers that define the range of a function.
   *  The domain and range must be in matching order. Each value in the
   *               domain is to have a matching value in the range at the
   *               same index that forms an ordered pair.
   * @return, returns true if the function has the onto property
   * and false otherwise
   */
  static boolean isOnto(ArrayList<Integer> domain, ArrayList<Integer> target, ArrayList<Integer> range) {
    Collections.sort(target);
    Collections.sort(range);
    for (int x = 1; x < range.size(); x++) {
      if (range.get(x) == range.get(x - 1)) {
        range.remove(x);
      }
    }
    if (target.size() == range.size()) {
      return true;
    }
    return false;
  }
  /**
   * Returns the intersection of two sets
   * @param domain, an ArrayList of integers that define the domain of a function
   * @param target, an ArrayList of integers that define the target of a function
   * @param range, an ArrayList of integers that define the range of a function.
   *  The domain and range must be in matching order. Each value in the
   *               domain is to have a matching value in the range at the
   *               same index that forms an ordered pair.
   * @return, returns true if the function is a bijection
   */
  static boolean isBijection(ArrayList<Integer> domain, ArrayList<Integer> target, ArrayList<Integer> range) {
    boolean oneToOne = isOneToOne(domain, target, range);
    boolean onto = isOnto(domain, target, range);
    if ((oneToOne == true) && (onto == true)){
      return true;
    }
    else {
      return false;
    }
  }
}
