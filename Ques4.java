/**
 * Given an array Arr[ ] of N integers and a positive integer K. The task is to
 * Divide the array into two sub array from right after the Kth position and
 * slide the left sub array of K elements to the end.
 * 
 * Example 1:
 * 
 * 5 ---Value of N
 * 
 * {10, 20, 30, 40, 50} --- Element of Arr[]
 * 
 * 2 -----Value of K
 * 
 * Output :
 * 
 * 30 40 50 10 20
 * 
 * 
 * Example 2:
 * 
 * 4 ---Value of N
 * 
 * {10, 20, 30, 40} ---Element of Arr[]
 * 
 * 1 -----Value of K
 * 
 * Output : 20 30 40 10
 */

public class Ques4 {

  public static int[] reorder(int[] arr, int k) {
    int[] tempArr = new int[arr.length];
    int j = 0;

    for (int i = k; i < tempArr.length; i++) {
      tempArr[j++] = arr[i];
    }

    for (int i = 0; i < k; i++) {
      tempArr[j++] = arr[i];
    }

    return tempArr;
  }

  public static void main(String[] args) {

    int[] arr = { 10, 20, 30, 40 };

    arr = reorder(arr, 1);

    for (int val : arr) {
      System.out.print(val + " ");
    }
  }
}
