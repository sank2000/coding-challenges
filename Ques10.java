import java.util.ArrayList;

/**
 * Explanation: Remove the element if it is greater than its left side element.
 * 
 * Example:
 * 
 * Input:
 * 
 * 6
 * 
 * 3 2 4 6 8 5
 * 
 * Output
 * 
 * 3 2
 * 
 * Explanation
 * 
 * 3 > 2 leave
 * 
 * 2 > 4 remove 4
 * 
 * 2 > 6 remove 6
 * 
 * 
 */

public class Ques10 {
  public static void main(String[] args) {
    String str = "3 2 4 6 8 5";

    ArrayList<Integer> arr = new ArrayList<Integer>();

    for (String e : str.split(" ")) {
      arr.add(Integer.valueOf(e));
    }

    int size = arr.size();
    for (int i = 0; i < size; i++) {
      for (int j = 1; j < arr.size(); j++) {
        if (arr.get(j - 1) < arr.get(j)) {
          arr.remove(j);
          break;
        }
      }
    }

    System.out.println(arr);
  }
}
