package book.edu.exercises.chapter03.listing3113;

import java.util.ArrayList;
import java.util.List;

/**
 * a tool for Strings
 */
public class StringTools {

  /**
   * Reverses the string
   *
   * @param s the string to reverse
   * @return the reversed String
   */
  public static String reverse(String s) {
    List<String> tempArray = new ArrayList<>(s.length());
    for(int i = 0; i < s.length(); i++) {
      tempArray.add(s.substring(i, i+1));
    }

    StringBuilder reversedString = new StringBuilder(s.length());
    for(int i = tempArray.size() -1; i >= 0; i--) {
      reversedString.append(tempArray.get(i));
    }

    return reversedString.toString();
  }
}
