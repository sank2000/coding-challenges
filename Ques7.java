/**
 * 
 * Encode the string by adding constant 5 to each ASCII character of String
 * 
 * For decode reverse the process.
 * 
 * If the input string has special character, it should display "Invalid Input".
 * If text is empty then display "INVALID INPUT" Spaces, dot, commas are ignored
 * and appear as it is during encoding or decoding
 * 
 * Example:
 * 
 * Input:
 * 
 * Hello Sir
 * 
 * sjjiytyfqp
 * 
 * Output:
 * 
 * Mjqqt Xnw
 * 
 * need to talk
 * 
 * Explanation
 * 
 * Output:
 * 
 * s - ASCII Value, 115 - 5 = 110 = n
 * 
 * j - ASCII Value, 106 - 5 = 101 = e
 * 
 * j - ASCII Value, 106 - 5 = 101 = e
 * 
 * i - ASCII Value, 105 - 5 = 100 = d
 * 
 * and the process goes on
 * 
 */

public class Ques7 {

  private static boolean isValid(Character sym) {
    return (sym >= 65 && sym <= 90) || (sym >= 97 && sym <= 122 || sym == ' ' || sym == ',' || sym == '.');
  }

  private static boolean isValidChar(Character sym) {
    return (sym >= 65 && sym <= 90) || (sym >= 97 && sym <= 122);
  }

  private static Character covertForward(Character chr) {
    int temp = (int) chr + 5;

    if (temp > 90 && temp < 96) {
      temp = 96 + (temp - 91);
    } else if (temp > 122) {
      temp = 65 + (temp - 122);
    }

    return (char) temp;
  }

  private static Character covertBackward(Character chr) {
    int temp = (int) chr - 5;

    if (temp > 90 && temp < 96) {
      temp = 90 - (96 - temp);
    } else if (temp < 65) {
      temp = 122 - (65 - temp);
    }

    return (char) temp;
  }

  public static String encode(String str) {
    String tempStr = "";

    for (Character chr : str.toCharArray()) {
      if (!isValid(chr)) {
        System.out.println("INVALID INPUT");
        System.exit(0);
      }
      if (isValidChar(chr))
        tempStr += covertForward(chr);
      else
        tempStr += chr;

    }

    return tempStr;
  }

  public static String decode(String str) {
    String tempStr = "";

    for (Character chr : str.toCharArray()) {
      if (!isValid(chr)) {
        System.out.println("INVALID INPUT");
        System.exit(0);
      }
      if (isValidChar(chr))
        tempStr += covertBackward(chr);
      else
        tempStr += chr;
    }

    return tempStr;
  }

  public static void main(String[] args) {
    String toEncode = "Hello Sir";
    String toDecode = "sjji yt yfqp";

    if (toEncode == "" || toDecode == "") {
      System.out.println("INVALID INPUT");
      return;
    }

    System.out.println(encode(toEncode));
    System.out.println(decode(toDecode));
  }

}
