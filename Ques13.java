/**
 * Ques13
 * 
 * Find the minimum no of coins required to form any value between 1 to N, both
 * inclusive should not exceed N. Coin denomination are 1,2 and 5.
 * 
 * Example:
 * 
 * Input
 * 
 * N - 13
 * 
 * Output:
 * 
 * 6132
 * 
 * T - 6 5 - 1 2 - 3 1 - 2
 * 
 * 
 */

public class Ques13 {

  public static void main(String[] args) {

    int N = 13;

    int one = 0, two = 0;
    int five = (N - 4) / 5;

    if ((N - (5 * five)) % 2 == 0) {
      one = 2;
    } else {
      one = 1;
    }

    two = (N - (5 * five) - one) / 2;

    System.out.print(one + two + five);
    System.out.print(five);
    System.out.print(two);
    System.out.print(one);

  }

}