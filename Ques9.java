/**
 * In a shop every item has an alphanumeric code printed on the label. Each
 * consecutive sequence of the digit in a code is to be read as a multi digit
 * number. The selling price of the product is the sum of the number in the
 * code. You are given the alphanumeric code for an item as a string Str. your
 * task is to compute the selling price of the item.
 * 
 * Example 1: Input : 1xyz23
 * 
 * Output : 24
 * 
 * Explanation :
 * 
 * Here the alphanumeric string is : 1xyz23 In the give string , 1+23 = 24
 * Hence, the output is 24
 * 
 * Example 2:
 * 
 * Input : 1g2a30t20
 * 
 * Output : 53
 * 
 * 
 */

public class Ques9 {

  public static int calculateAmount(String str) {
    int amount = 0;

    int temp = 0;
    for (Character chr : str.toCharArray()) {
      if (Character.isAlphabetic(chr)) {
        amount += temp;
        temp = 0;
      } else {
        temp = (temp * 10) + Character.getNumericValue(chr);
      }
    }

    amount += temp;

    return amount;
  }

  public static void main(String[] args) {
    System.out.println(calculateAmount("1xyz23"));
    System.out.println(calculateAmount("1g2a30t20"));
  }

}
