package cs2130;

import java.util.ArrayList;
import java.util.Collections;


public class Sets {
  /**
   * Returns the intersection of two sets
   * @param set1, an ArrayList of integers that define a set
   * @param set2, an ArrayList of integers that define a set
   * @return, an ArrayList of integers that is the intersection of
   * the two parameter sets. The set returned is in order
   * from smallest to largest.
   */
   static ArrayList<Integer> intersectionOfSets(ArrayList<Integer> set1, ArrayList<Integer> set2) {
       ArrayList<Integer> newSet = new ArrayList<Integer>();
       Collections.sort(set1);
       Collections.sort(set2);
       int k = 0;
       for (int i = 0; i < set1.size(); i++) {
           for (int j = 0; j < set2.size(); j++) {
               if ((set1.get(i) == set2.get(j)) && (k == 0)) {
                   newSet.add(set1.get(i));
                   k++;
               }
               else if ((set1.get(i) == set2.get(j)) && (newSet.get(k - 1) != set1.get(i))) {
                   newSet.add(set1.get(i));
                   k++;
               }
           }
       }
       Collections.sort(newSet);
       return newSet;
   }

  /**
   * Returns the union of two sets
   * @param set1, an ArrayList of integers that define a set
   * @param set2, an ArrayList of integers that define a set
   * @return, an ArrayList of integers that is the union of
   * the two parameter sets. The set returned is in order
   * from smallest to largest.
   */
  static ArrayList<Integer> unionOfSets(ArrayList<Integer> set1, ArrayList<Integer> set2) {
      ArrayList<Integer> newUnion = new ArrayList<Integer>();
      for (int i = 0; i < set1.size(); i++) {
          newUnion.add(set1.get(i));
      }
      for (int j = 0; j < set2.size(); j++) {
          newUnion.add(set2.get(j));
      }
      Collections.sort(newUnion);
      for (int x = 1; x < newUnion.size(); x++) {
          if (newUnion.get(x) == newUnion.get(x - 1)) {
              newUnion.remove(x);
          }
      }
      return newUnion;
  }

}
