import java.util.ArrayList;

/**
 * Ques11
 * 
 * Write a program to find the smallest integer value 'b' for the given value of
 * 'a' If we multiply the digit of 'b', we should get the exact value of 'a'.
 * Result 'b' must contain more than one digit
 * 
 * Constraints:
 * 
 * 1 <= a <= 10000
 * 
 * Example 1:
 * 
 * Input: 10 Output: 25
 * 
 * Example 2:
 * 
 * Input: 56 Output: 78
 * 
 * Example 3:
 * 
 * Input: 150 Output: 556
 * 
 * 
 * 
 */

public class Ques11 {

  public static void main(String[] args) {
    int input = 150;

    ArrayList<Integer> ls = new ArrayList<Integer>();

    if (input < 10) {
      System.out.println(input + 10);
      return;
    }

    int temp = input;

    while (temp != 1) {
      for (int i = 9; i > 0; i--) {
        if (temp % i == 0) {
          ls.add(i);
          temp /= i;
          break;
        }
      }
      if (temp == input) {
        break;
      }
    }

    if (ls.isEmpty()) {
      System.out.println("Not possible");
      return;
    }

    for (int index = ls.size() - 1; index >= 0; index--) {
      System.out.print(ls.get(index));
    }

  }

}
