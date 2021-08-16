/**
 * Given a sentence, written in a camel case (i.e. every word starts with an
 * uppercase letter and there is no space or punctuation between two consecutive
 * words). The task is to put one space after every word and convert every
 * uppercase letter to lowercase.
 * 
 * Example 1: Input : ThisIsAnAutomationEra
 * 
 * Output: this is an Automation Era
 * 
 * Output: this is an automation era
 * 
 * Example 2: Input: HeyYou
 * 
 * Output: hey you
 * 
 */

public class Ques8 {

  public static String convert(String str) {
    String temp = "";

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
        if (i == 0) {
          temp += (char) (str.charAt(i) + 32);
        } else {
          temp += " " + (char) (str.charAt(i) + 32);
        }
      } else
        temp += str.charAt(i);
    }

    return temp;
  }

  public static void main(String[] args) {

    String str = "HeyYou";

    System.out.println(convert(str));

  }

}
