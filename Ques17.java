
/**
 * A man wants to pack his items in carton. Each cartoon can have maximum weight
 * of k units.Find the minimum no of cartoon needed to pack all his items.
 * 
 * Note:
 * 
 * Each cartoon can carry at most 2 items and weight of the two items should be
 * less than maximum capacity C of cartoon. All cartoon are of same size.
 * 
 * Example 1:
 * 
 * Input:
 * 
 * 5 -> N
 * 
 * 5 -> C
 * 
 * arr{} = {5,2,3,1,4}
 * 
 * Output : 3
 * 
 * Explanation:
 * 
 * C1 - 5 C2 - 2,3 c3 - 1,4
 * 
 * Example 2:
 * 
 * Input:
 * 
 * 7 -> N
 * 
 * 12 -> C
 * 
 * arr{} = {12,2,3,11,6,8,1}
 * 
 * Output : 4
 * 
 * Explanation:
 * 
 * C1 - 12 C2 - 11,1 C3 - 3,8 C4 - 2,6
 * 
 */

import java.util.*;

public class Ques17 {

  public static void main(String[] args) {
    int C = 12;
    int[] arr = { 12, 2, 3, 11, 6, 8, 1 };

    LinkedList<Integer> ls = new LinkedList<Integer>();

    for (Integer itr : arr) {
      ls.add(itr);
    }

    Collections.sort(ls, Collections.reverseOrder());

    int bag = 0;

    while (!ls.isEmpty()) {
      int temp = ls.get(0);

      if (temp == C) {
        bag++;
        ls.remove(0);
        continue;
      }

      int second = -1;
      for (int index = 1; index < ls.size(); index++) {
        if (temp + ls.get(index) <= C) {
          second = index;
        }
      }
      bag++;
      if (second != -1) {
        ls.remove(second);
      }
      ls.remove(0);
    }

    System.out.println(bag);

  }

}
