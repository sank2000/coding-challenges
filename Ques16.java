/**
 * Ques16
 * 
 * There are M boys, N girl adn P pets. Create the no of teams such that each
 * team contains at lest one boy and one girl and the third member may be boy or
 * girl or pet
 * 
 * Example 1:
 * 
 * Input :
 * 
 * 5
 * 
 * 4
 * 
 * 2
 * 
 * Output :
 * 
 * 3
 * 
 * Explanation: B-1 G-1 P-1 | B-1 G-1 p-1 | B-2 G-1
 * 
 * remaining B-1 G-1
 * 
 * So total teams 3
 * 
 * Example 2:
 * 
 * Input :
 * 
 * 3
 * 
 * 2
 * 
 * 0
 * 
 * Output :
 * 
 * 1
 * 
 * Explanation: B-2 G-1
 * 
 * remaining B-1 G-1
 * 
 * So total teams 1
 * 
 * 
 */
public class Ques16 {

  public static void main(String[] args) {

    int boys = 3;
    int girls = 2;
    int pets = 0;

    int teams = 0;

    while (boys > 0 && girls > 0 && boys + girls + pets >= 3) {

      int temp = 0;

      if (pets > 0) {
        pets--;
        temp++;
      }

      boys--;
      girls--;
      temp = temp + 2;

      if (temp != 3) {
        if (boys > girls) {
          boys--;
        } else {
          girls--;
        }
      }
      teams++;
    }

    System.out.println(teams);

  }

}
