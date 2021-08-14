/**
 * Given an array Arr[ ] of N integer numbers. The task is to rewrite the array
 * by putting all multipliers at the end of the given array.
 * 
 * Note : The order of the numbers which are not the multiplier of 10 should
 * remain unaltered ,and similarly the order of the numbers which are the
 * multiplier of 10 should remain unaltered.
 * 
 * For example :
 * 
 * Suppose N = 9 and Arr[] = {10, 12, 5, 40, 30, 7, 5, 9, 10}
 * 
 * You have to push all the multiple of 10 at the end of the array Arr[].
 * 
 * Hence the output is : 12 5 7 5 9 10 40 30 10
 * 
 */

public class Ques3 {

  public static void reSort(int[] arr, int index, int element) {
    for (int i = index + 1; i < arr.length; i++) {
      arr[i - 1] = arr[i];
    }
    arr[arr.length - 1] = element;
  }

  public static int[] reOrder(int[] arr) {
    int[] tempArr = arr.clone();
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] % 10 == 0) {
        reSort(tempArr, i - count, arr[i]);
        count++;
      }
    }
    return tempArr;
  }

  public static void main(String[] args) {
    // int N = 9;
    int[] arr = { 10, 12, 5, 40, 30, 7, 5, 9, 10 };

    arr = reOrder(arr);

    for (int ele : arr) {
      System.out.print(ele + " ");
    }
  }

}

/**
 * 0 10,12,5,40,30,7,5,9,10
 * 
 * 0 temp 12,5,40,30,7,5,9,10,10
 * 
 * 3 10,12,5,40,30,7,5,9,10
 * 
 * 2 temp 12,5,40,30,7,5,9,10,10 -> 12,5,30,7,5,9,10,10,40
 * 
 * 4 10,12,5,40,30,7,5,9,10
 * 
 * 3 temp 12,5,30,7,5,9,10,10,40
 */
