import java.util.*;
public class Parens {
  // the way to find out a solution recusively
  // assume a simple solution, add something to make it larger

  /*   This is the first solution */
  /* a recusive solution */
  Set<String> generateParens(int remaining) {
    if (remaining < 0) { throw new IllegalArgumentException(); }
    Set<String> set = new HashSet<>();
    if (remaining == 0) {
      set.add("");
    }else {
      Set<String> preSet = generateParens(remaining - 1);
      for (String s : preSet) {
        for (int i = 0; i < s.length() ; i++) {
          if (s.charAt(i) == '(') {
            String newStr = insertInside(s, i);
            set.add(newStr);
          }
        }
        set.add("()" + s);
      }
    }
    return set;
  } // The end of method


  String insertInside(String s, int leftIndex) {
    String left = s.substring(0, leftIndex + 1);
    String right = s.substring(leftIndex + 1, s.length());
    return left + "()" + right;
  }
  /*   This is the end of the first solution */




  




public static void main(String[] args) {
  System.out.println("input an integer: ");
  Scanner sc = new Scanner(System.in);
  String input = sc.nextLine();
  int remaining = Integer.valueOf(input);
  Parens p = new Parens();

  p.generateParens(remaining).forEach(
   (s) -> { System.out.println(s); });
}


} // The end of the class
