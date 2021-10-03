import java.util.HashMap;
import java.util.Map;

/**
 * Ques14
 * 
 * With the score board you need to find a winner and print the name of the
 * winner and points earned by the team.
 * 
 * Each team gets
 * 
 * - 3 points for win
 * 
 * - 1 points for draw
 * 
 * - 0 points for loss
 * 
 * The first line contains a integer N, which is no of teams.The next N*(N-1)/2
 * line contains three space separated string.
 * 
 * Input:
 * 
 * 3
 * 
 * A B 2-1
 * 
 * B C 5-6
 * 
 * C A 2-1
 * 
 * Output:
 * 
 * C
 * 
 * 6
 * 
 * Explanation: A has won 1 match: 3 points. B has won 0 match: 0 points. C has
 * won 2 match: 6 points
 * 
 * 
 */

public class Ques14 {

  public static void main(String[] args) {
    int N = 3;
    String[] input = { "A B 2-1", "B C 5-6", "C A 2-1" };
    HashMap<String, Integer> ls = new HashMap<String, Integer>();

    // user input logic
    // for (int index = 0; index < N * (N - 1) / 2; index++) {
    // }

    for (int i = 0; i < N; i++) {
      String[] valArr = input[i].split(" ");

      String[] score = valArr[2].split("-");
      int high = -1;
      if (Integer.valueOf(score[0]) < Integer.valueOf(score[1])) {
        high = 1;
      } else if (Integer.valueOf(score[0]) > Integer.valueOf(score[1])) {
        high = 0;
      }

      if (high == -1) {
        ls.put(valArr[0], ls.containsKey(valArr[0]) ? ls.get(valArr[0]) + 1 : 1);
        ls.put(valArr[1], ls.containsKey(valArr[1]) ? ls.get(valArr[1]) + 1 : 1);
      } else {
        ls.put(valArr[high], ls.containsKey(valArr[high]) ? ls.get(valArr[high]) + 3 : 3);
      }
    }

    String leadTeam = "";
    int score = -1;

    for (Map.Entry<String, Integer> itr : ls.entrySet()) {
      if (itr.getValue() > score) {
        leadTeam = itr.getKey();
        score = itr.getValue();
      }
    }

    System.out.println(leadTeam);
    System.out.println(score);
  }

}