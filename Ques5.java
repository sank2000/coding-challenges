/**
 * For hiring a car, a travel agency charges R1 rupees per hour for the first N
 * hours and then R2 rupees per hour. Given the total time of travel in minutes
 * in X. The task is to find the total travelling cost in rupees. Note : While
 * converting minutes into hours, ceiling value should be considered as the
 * total number of hours. For example : If the total travelling time is 90
 * minutes, i.e. 1.5 hours, it must be considered as 2 hours.
 * 
 * Example :
 * 
 * Input :
 * 
 * 20 -- r1
 * 
 * 4 -- n
 * 
 * 40 -- r2
 * 
 * 300 -- x
 * 
 * Output : 120
 * 
 * Explanation :
 * 
 * Total travelling hours = 300 / 60 = 5 hours
 * 
 * Rupees 20 / hours for first 4 hours = 20 * 4 = 80 rupees
 * 
 * Rupees 40 / hours in 5th hour = 40 * 1 = 40 rupees
 * 
 * Hence, the total travelling cost = 80 + 40 = 120 rupees
 * 
 */

public class Ques5 {
  public static void main(String[] args) {
    int startingPrice = 20;
    int limit = 4;
    int normalPrice = 40;
    int totalMin = 300;

    int hour = (int) Math.ceil(totalMin / 60);

    System.out.println(hour > limit ? (limit * startingPrice) + ((hour - limit) * normalPrice) : hour * startingPrice);
  }
}
