/**
 * Ques12
 * 
 * A teacher ask their books to a page number. A student can either start turing
 * from front or back. When they open the book, page 1 is always on the right
 * side.
 * 
 * If thr book is n pages long, and a student want to turn page p,what is the
 * minimum number of pages to turn? They can start at the beginning or the end
 * 
 * 
 * Example 1: n = 5 p = 3
 * 
 * Output : 1
 * 
 * Example 2: n = 6 p = 2
 * 
 * Output : 1
 * 
 * 
 */
public class Ques12 {

  public static void main(String[] args) {
    int n = 7;
    int p = 3;

    int frontPage = 1;
    int frontTurn = 0;

    while (frontPage < p) {
      frontTurn++;
      frontPage += 2;
    }

    int lastPage = n;
    int lastTurn = 0;
    if (!(lastPage % 2 != 0 && lastPage - 1 == p)) {
      while (lastPage > p) {
        lastTurn++;
        lastPage -= 2;
      }
    }

    System.out.println(Math.min(frontTurn, lastTurn));
  }

}

// we can also use formula p/2 and (n-p)/2