/**
 * Given an array Arr[] of integer number have size N.The task is to find out
 * single or consecutive number from Arr[] with 0 sum.When found, print "1"
 * otherwise "0"
 * 
 * Example 1:
 * 
 * 4 ---> Value of N
 * 
 * {6,-2,3,-1} ---> Elements of Arr[]
 * 
 * Output: 1
 * 
 * Example 2:
 * 
 * 5 ---> Value of N
 * 
 * {5,1,2,3,-4} ---> Elements of Arr[]
 * 
 * Output: 0
 * 
 * Explanation:
 * 
 * In example 1,-2 + 3 + -1 = 0. So 1
 * 
 * In example 2, Any consecutive number cannot give 0 sum. Hence 0
 *
 */

public class Ques6 {

  public static int find(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j++) {
        sum += arr[j];
      }

      if (sum == 0) {
        return 1;
      }
    }

    return 0;
  }

  public static void main(String args[]) {
    // int N = 4;
    // int[] arr = { 6, -2, 3, -1 };
    int[] arr = { 5, 1, 2, 3 - 4 };
    System.out.println(find(arr));
  }

}