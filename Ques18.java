
/**
 * 
 * Ques 18
 * 
 * 
 * Sort the array on the
 * 
 * Input: arr[] = {2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12}
 * 
 * Output: 3 3 3 3 2 2 2 12 12 4 5
 * 
 * Explanation :
 * 
 * No. Freq
 * 
 * 2 : 3
 * 
 * 3 : 4
 * 
 * 4 : 1
 * 
 * 5 : 1
 * 
 * 12 : 2
 * 
 * Input: arr[] = {4, 4, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5}
 * 
 * Output: 2 2 2 2 1 1 3 3 4 4 5 6 7
 * 
 */

import java.util.*;

public class Ques18 {

  public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm) {
    // Create a list from elements of HashMap
    LinkedList<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());

    // Sort the list using lambda expression
    Collections.sort(list, (i1, i2) -> i2.getValue().compareTo(i1.getValue()));

    // put data from sorted list to hashmap
    HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
    for (Map.Entry<Integer, Integer> aa : list) {
      temp.put(aa.getKey(), aa.getValue());
    }

    return temp;
  }

  public static void main(String[] args) {

    int[] arr = { 2, 3, 2, 4, 5, 12, 2, 3, 3, 3, 12 };

    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

    for (int item : arr) {
      map.put(item, map.getOrDefault(item, 0) + 1);
    }

    int[] output = new int[arr.length];

    int i = 0;
    for (Map.Entry<Integer, Integer> entry : sortByValue(map).entrySet()) {
      for (int index = 0; index < entry.getValue(); index++) {
        output[i++] = entry.getKey();
      }
    }

    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(output));

  }

}
