
// Given two non-negative integers n1 and n2, where n1<n2. The task is to find the total number of integers in the range [n1, n2](both inclusive) which have no repeated digits.

// For example:
// Suppose n1=11 and n2=15.
// There is the number 11, which has repeated digits, but 12, 13, 14 and 15 have no repeated digits. So, the output is 4.

// Example1:
// Input:
// 11 -- Value of n1
// 15 -- value of n2

// Output:
// 4

// Example 2:
// Input:
// 101 -- value of n1
// 200 -- value of n2

// Output:
// 72

public class Ques2 {

  public static int findCount(int start, int end) {
    int count = 0;

    for (int i = start; i <= end; i++) {
      boolean[] temp = new boolean[10];
      int value = i;
      while (true) {
        if (temp[value % 10]) {
          break;
        } else {
          temp[value % 10] = true;
          value = value / 10;
        }

        if (value == 0) {
          count++;
          break;
        }
      }
    }

    return count;
  }

  public static void main(String[] args) {

    System.out.println("Case 1:");
    System.out.println(findCount(11, 15));

    System.out.println("Case 2:");
    System.out.println(findCount(101, 200));
  }

}
