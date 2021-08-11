import java.util.Scanner;

/**
 * Ques1
 * 
 * Given an array Arr[ ] of N integers and a positive integer K. The task is to
 * cyclically rotate the array clockwise by K. Note : Keep the first of the
 * array unaltered.
 * 
 * Example 1:
 * 
 * 5 ---Value of N
 * 
 * {10, 20, 30, 40, 50} ---Element of Arr[]
 * 
 * 2 ----- Value of K
 * 
 * Output : 40 50 10 20 30
 * 
 * Example 2:
 * 
 * 4 ---Value of N
 * 
 * {10, 20, 30, 40} ---Element of Arr[]
 * 
 * 1 -----Value of K
 * 
 * Output : 40 10 20 30
 * 
 */

public class Ques1 {

  public static void rotate(int[] arr, int k) {
    for (int i = 0; i < k; i++) {
      int data = arr[arr.length - 1];
      for (int j = arr.length - 1; j > 0; j--) {
        arr[j] = arr[j - 1];
      }
      arr[0] = data;
    }
  }

  public static void main(String[] args) {
    int[] arr;

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter total number of items : ");
    int n = scan.nextInt();
    arr = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Enter your number : ");
      arr[i] = scan.nextInt();
    }

    System.out.print("Enter no of rotations : ");
    int k = scan.nextInt();

    rotate(arr, k);

    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }

    scan.close();
  }
}
